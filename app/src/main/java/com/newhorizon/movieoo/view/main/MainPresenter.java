package com.newhorizon.movieoo.view.main;

import android.view.View;
import android.widget.Toast;

import com.newhorizon.movieoo.api.ApiStateListener;
import com.newhorizon.movieoo.view.main.caller.MovieCaller;

import java.util.List;

public class MainPresenter {
    //region Variables
    MainActivity mainActivity;
    MovieCaller movieCaller;
    List<ShowMoviesResponse> showMoviesResponses;

    //endregion

    //region Constructor

    public MainPresenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        movieCaller = new MovieCaller();
        getMovies();
    }

    //endregion

    //region Methods
    public void getMovies() {
        mainActivity.binding.activityMainLoading.setVisibility(View.VISIBLE);

        movieCaller.connectToGetAllMoviesApi(new ApiStateListener() {
            @Override
            public void onSuccess(Object... params) {
                showMoviesResponses = (List<ShowMoviesResponse>) params[0];

                mainActivity.movieAdapter.updateList(showMoviesResponses);
                mainActivity.binding.activityMainLoading.setVisibility(View.GONE);
                Toast.makeText(mainActivity, "you make it well", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Object... params) {
                mainActivity.binding.activityMainLoading.setVisibility(View.GONE);
                Toast.makeText(mainActivity, "check your connection please habaibi", Toast.LENGTH_SHORT).show();

            }
        });

    }
    //endregion

}
