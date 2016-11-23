package com.ezequielc.branchexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActorRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Actor> actorArrayList = new ArrayList<>();
        actorArrayList.add(new Actor("Mila Kunis", "August 14, 1983", 0));
        actorArrayList.add(new Actor("Morena Baccarin", "June 2, 1979", 0));
        actorArrayList.add(new Actor("Elijah Wood", "January 28,1981",0));

        Actor leo = new Actor("Leonardo DiCaprio", "November 11, 1974", 1);
        Actor matt = new Actor("Matt Damon", "October 8, 1970", 1);
        Actor jen = new Actor("Jennifer Lawrence", "August 15, 1990", 1);
        actorArrayList.add(leo);
        actorArrayList.add(matt);
        actorArrayList.add(jen);


        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mAdapter = new ActorRecyclerViewAdapter(actorArrayList);
        recyclerView.setAdapter(mAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);



    }
}
