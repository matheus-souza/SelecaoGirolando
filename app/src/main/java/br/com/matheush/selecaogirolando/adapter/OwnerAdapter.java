package br.com.matheush.selecaogirolando.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.matheush.selecaogirolando.R;
import br.com.matheush.selecaogirolando.model.Owner;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by matheush on 24/02/17.
 */

public class OwnerAdapter extends RecyclerView.Adapter<OwnerAdapter.ViewHolder> {
    private Context context;
    private List<Owner> ownerList;

    public OwnerAdapter(Context context, List<Owner> ownerList) {
        this.context = context;
        this.ownerList = ownerList;
    }

    @Override
    public int getItemCount() {
        return this.ownerList != null ? this.ownerList.size() : 0;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_item, viewGroup, false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Atualiza a view
        Owner o = ownerList.get(position);

        //Aqui a regra da cor
        //verifica se o campo da 3coluna não é null

        holder.tvOneFullName.setText(o.getFullName());
        if (o.getFullName().length() %2 == 0)
            holder.tvOneFullName.setTextColor(Color.RED);
        holder.tvOneOwnerLogin.setText(o.getOwner().getLogin());

        holder.tvTwoFullName.setText(o.getFullName());
        if (o.getFullName().length() %2 == 0)
            holder.tvTwoFullName.setTextColor(Color.RED);
        holder.tvTwoOwnerLogin.setText(o.getOwner().getLogin());

        if (holder.tvThreeFullName != null) {
            holder.tvThreeFullName.setText(o.getFullName());
            if (o.getFullName().length() %2 == 0)
                holder.tvThreeFullName.setTextColor(Color.RED);
        }

        if (holder.tvThreeOwnerLogin != null) {
            holder.tvThreeOwnerLogin.setText(o.getOwner().getLogin());
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card_one_tv_full_name)
        TextView tvOneFullName;
        @BindView(R.id.card_one_tv_owner_login)
        TextView tvOneOwnerLogin;

        @BindView(R.id.card_two_tv_full_name)
        TextView tvTwoFullName;
        @BindView(R.id.card_two_tv_owner_login)
        TextView tvTwoOwnerLogin;

        @Nullable
        @BindView(R.id.card_three_tv_full_name)
        TextView tvThreeFullName;
        @Nullable
        @BindView(R.id.card_three_tv_owner_login)
        TextView tvThreeOwnerLogin;

        public ViewHolder(View view) {
            super(view);

            ButterKnife.bind(this, view);
        }
    }
}
