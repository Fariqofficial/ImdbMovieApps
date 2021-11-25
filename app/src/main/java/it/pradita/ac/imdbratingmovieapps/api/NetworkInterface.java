package it.pradita.ac.imdbratingmovieapps.api;

import it.pradita.ac.imdbratingmovieapps.model.Items;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NetworkInterface {

    @GET("en/API/Top250Movies")
    Call<Items> getItems(@Query("apiKey") String apiKey);

}
