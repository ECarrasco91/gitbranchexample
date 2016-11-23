package com.ezequielc.branchexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Actor leo = new Actor("Leonardo DiCaprio", "November 11, 1974", 1);
        Actor matt = new Actor("Matt Damon", "October 8, 1970", 1);
        Actor jen = new Actor("Jennifer Lawrence", "August 15, 1990", 1);

        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(leo);
        actors.add(matt);
        actors.add(jen);
    }
}
