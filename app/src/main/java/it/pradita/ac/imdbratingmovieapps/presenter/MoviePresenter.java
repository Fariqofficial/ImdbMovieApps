package it.pradita.ac.imdbratingmovieapps.presenter;

import java.util.List;

import it.pradita.ac.imdbratingmovieapps.api.ApiClient;
import it.pradita.ac.imdbratingmovieapps.model.Items;
import it.pradita.ac.imdbratingmovieapps.model.Movie;
import it.pradita.ac.imdbratingmovieapps.utils.Utils;
import it.pradita.ac.imdbratingmovieapps.view.MoviesView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviePresenter {

    private MoviesView view;

    public MoviePresenter(MoviesView view) {
        this.view = view;
    }

    public void getListMovies() {
        view.showLoading();

        Call<Items> call = Utils.getApi().getItems("k_7lb8lynv");
        call.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(Call<Items> call, Response<Items> response) {
                if (response.isSuccessful() && response.body() != null) {
                    view.setMovies(response.body().getMovies());
                } else {
                    view.onErrorResponse(response.message());
                }
                view.hideLoading();
            }

            @Override
            public void onFailure(Call<Items> call, Throwable t) {
                view.hideLoading();
                view.onErrorResponse(t.getLocalizedMessage());
            }
        });
    }
}
