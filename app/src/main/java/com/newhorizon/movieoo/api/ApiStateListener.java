package com.newhorizon.movieoo.api;

public interface ApiStateListener {

    void onSuccess(Object... params);

    void onFailure(Object... params);

}
