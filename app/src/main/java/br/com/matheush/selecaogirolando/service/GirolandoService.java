package br.com.matheush.selecaogirolando.service;

import java.util.List;

import br.com.matheush.selecaogirolando.model.Owner;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by matheush on 24/02/17.
 */

public interface GirolandoService {
    public static final String BASE_URL = "https://api.github.com/";

    @GET("repositories")
    Call<List<Owner>> getOwners();

}
