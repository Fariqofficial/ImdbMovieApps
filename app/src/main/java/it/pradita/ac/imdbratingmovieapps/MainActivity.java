package it.pradita.ac.imdbratingmovieapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import it.pradita.ac.imdbratingmovieapps.adapter.MoviesAdapter;
import it.pradita.ac.imdbratingmovieapps.model.Items;
import it.pradita.ac.imdbratingmovieapps.model.Movie;
import it.pradita.ac.imdbratingmovieapps.presenter.MoviePresenter;
import it.pradita.ac.imdbratingmovieapps.view.MoviesView;

public class MainActivity extends AppCompatActivity implements MoviesView{

    @BindView(R.id.rvMovies)
    RecyclerView rvDataMovie;

    @BindView(R.id.progressBar)
    ProgressBar loading;

    private MoviePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new MoviePresenter(this);
        presenter.getListMovies();
    }

    @Override
    public void setMovies(List<Movie> items) {
        MoviesAdapter adapter = new MoviesAdapter(items, this);
        rvDataMovie.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        rvDataMovie.setLayoutManager(layoutManager);
        rvDataMovie.setNestedScrollingEnabled(true);
        adapter.notifyDataSetChanged();

        adapter.setOnItemClickCallback(data -> {
            Intent intent = new Intent(this, DetailsMovieActivity.class);
            intent.putExtra("data", data);
            startActivity(intent);
        });
    }

    @Override
    public void onErrorResponse(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT);
    }

    @Override
    public void showLoading() {
        loading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        loading.setVisibility(View.GONE);
    }
}