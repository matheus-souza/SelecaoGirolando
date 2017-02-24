package br.com.matheush.selecaogirolando;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.matheush.selecaogirolando.adapter.OwnerAdapter;
import br.com.matheush.selecaogirolando.model.Owner;
import br.com.matheush.selecaogirolando.service.GirolandoService;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LogX";
    @BindView(R.id.frame_progress)
    FrameLayout frameProgress;

    List<Owner> ownerList;
    @BindView(R.id.rv_owner)
    RecyclerView rvOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        rvOwner.setLayoutManager(new LinearLayoutManager(this));
        rvOwner.setItemAnimator(new DefaultItemAnimator());
        rvOwner.setHasFixedSize(true);
        if (savedInstanceState != null) {
            ArrayList<Owner> loadedList = savedInstanceState.getParcelableArrayList("key");
            ownerList = new LinkedList<Owner>(loadedList);

            updateRecyclerView();
        } else {
            frameProgress.setVisibility(View.VISIBLE);
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(GirolandoService.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            GirolandoService girolandoService = retrofit.create(GirolandoService.class);
            Call<List<Owner>> ownerCall = girolandoService.getOwners();

            ownerCall.enqueue(new Callback<List<Owner>>() {
                @Override
                public void onResponse(Call<List<Owner>> call, Response<List<Owner>> response) {
                    if (response.isSuccessful()) {
                        ownerList = response.body();

                        Log.i(TAG, "Resposta com sucesso:" + ownerList.toString());
                        Log.i(TAG, "Resposta quantidade total:" + ownerList.size());
                        updateRecyclerView();
                    } else {
                        Log.d(TAG, "Erro response: " + response.code());
                    }
                }

                @Override
                public void onFailure(Call<List<Owner>> call, Throwable t) {
                    Log.e(TAG, "Erro: " + t.getMessage());
                }
            });
        }
    }

    public void updateRecyclerView() {
        OwnerAdapter ownerAdapter = new OwnerAdapter(MainActivity.this, ownerList);
        rvOwner.setAdapter(ownerAdapter);
        frameProgress.setVisibility(View.GONE);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        ArrayList<Owner> listToSave = new ArrayList<Owner>(ownerList);
        outState.putParcelableArrayList("key", listToSave);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
