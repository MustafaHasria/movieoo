package com.newhorizon.movieoo.model.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.newhorizon.movieoo.R;

public class MainActivity extends AppCompatActivity {

    //region Variables
    MainPresenter mainPresenter;
    //endregion

    //region Life cycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //endregion
}