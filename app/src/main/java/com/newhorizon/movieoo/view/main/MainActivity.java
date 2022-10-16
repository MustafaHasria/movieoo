package com.newhorizon.movieoo.view.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.newhorizon.movieoo.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //region Variables
    MainPresenter mainPresenter;
    MovieAdapter movieAdapter;
    ActivityMainBinding binding;
    //endregion

    //region Life cycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mainPresenter = new MainPresenter(this);
        setupRecyclerView();
    }

    //endregion

    //region Methods
    private void setupRecyclerView() {
        movieAdapter = new MovieAdapter(new ArrayList<>());
        binding.activityMainRecyclerView.setAdapter(movieAdapter);
    }

    //endregion
}