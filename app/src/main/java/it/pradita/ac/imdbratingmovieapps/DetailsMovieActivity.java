package it.pradita.ac.imdbratingmovieapps;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import it.pradita.ac.imdbratingmovieapps.model.Movie;

public class DetailsMovieActivity extends AppCompatActivity {

    @BindView(R.id.imgMovie)
    ImageView movieImage;

    @BindView(R.id.tvFullitle)
    TextView fullTitleMovie;

    @BindView(R.id.tvYears)
    TextView yearsMovie;

    @BindView(R.id.tvRank)
    TextView rankMovie;

    @BindView(R.id.tvRating)
    TextView ratingMovie;

    @BindView(R.id.tvCrew)
    TextView crewMovie;

    @BindView(R.id.progressBar)
    ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_movie);
        ButterKnife.bind(this);
        initDetailMovie();
    }

    private void initDetailMovie() {
        Movie data = (Movie) getIntent().getExtras().get("data");
        String strImage = data.getImage();
        Glide.with(getApplicationContext()).load(strImage).into(movieImage);
        fullTitleMovie.setText(data.getFullTitle());
        yearsMovie.setText(data.getYear());
        rankMovie.setText(data.getRank());
        ratingMovie.setText(data.getImdbRating());
        crewMovie.setText(data.getCrew());
    }
}