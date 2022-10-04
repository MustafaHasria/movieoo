package com.newhorizon.movieoo.api.endpoints;

import com.newhorizon.movieoo.view.main.ShowMoviesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApis {

    String SHOW_ALL = "shows";


    @GET(SHOW_ALL)
    Call<List<ShowMoviesResponse>> getMovies();
}
