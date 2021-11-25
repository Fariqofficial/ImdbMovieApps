package it.pradita.ac.imdbratingmovieapps.view;

import java.util.List;

import it.pradita.ac.imdbratingmovieapps.model.Movie;

public interface MoviesView {

    void setMovies(List<Movie> items);

    void onErrorResponse(String message);

    void showLoading();

    void hideLoading();

}
