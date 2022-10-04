package com.newhorizon.movieoo.view.main.caller;

import com.newhorizon.movieoo.api.ApiClient;
import com.newhorizon.movieoo.api.ApiStateListener;
import com.newhorizon.movieoo.api.endpoints.MovieApis;
import com.newhorizon.movieoo.view.main.ShowMoviesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieCaller {
    //region Variables
    MovieApis movieApis;
    Call<List<ShowMoviesResponse>> showMovieResponseCall;
    //endregion

    //region Constructor

    public MovieCaller() {
        movieApis = ApiClient.getAPIClient().create(MovieApis.class);
    }
    //endregion

    //region Methods
    public void connectToGetAllMoviesApi(final ApiStateListener apiStateListener) {
        showMovieResponseCall = movieApis.getMovies();
        showMovieResponseCall.enqueue(new Callback<List<ShowMoviesResponse>>() {
            @Override
            public void onResponse(Call<List<ShowMoviesResponse>> call, Response<List<ShowMoviesResponse>> response) {

            }

            @Override
            public void onFailure(Call<List<ShowMoviesResponse>> call, Throwable t) {

            }
        });
    }
    //endregion


}
