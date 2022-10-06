package com.newhorizon.movieoo.view.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.newhorizon.movieoo.R;
import com.newhorizon.movieoo.api.ApiStateListener;
import com.newhorizon.movieoo.view.main.caller.MovieCaller;
import com.wang.avi.AVLoadingIndicatorView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //region Variables
    MainPresenter mainPresenter;
    MovieCaller movieCaller;
    List<ShowMoviesResponse> showMoviesResponses;
    MovieAdapter movieAdapter;
    //endregion

    //region Components
    AVLoadingIndicatorView activityMainLoading;
    TextView first_movie;
    RecyclerView activityMainRecyclerView;
    //endregion

    //region Life cycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainLoading = findViewById(R.id.activity_main_loading);
        activityMainRecyclerView = findViewById(R.id.activity_main_recycler_view);
        first_movie = findViewById(R.id.first_movie);

        movieCaller = new MovieCaller();
        setupRecyclerView();

        activityMainLoading.setVisibility(View.VISIBLE);
        movieCaller.connectToGetAllMoviesApi(new ApiStateListener() {
            @Override
            public void onSuccess(Object... params) {
                showMoviesResponses = (List<ShowMoviesResponse>) params[0];
                movieAdapter.updateList(showMoviesResponses);
                first_movie.setText(showMoviesResponses.get(0).getName());
                activityMainLoading.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "you make it well", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Object... params) {
                activityMainLoading.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "check your connection please habaibi", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void setupRecyclerView() {
        movieAdapter = new MovieAdapter(new ArrayList<>());
        activityMainRecyclerView.setAdapter(movieAdapter);
    }
    //endregion
}