package com.ezequielc.branchexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NikitaShuvalov on 11/23/16.
 */

public class ActorRecyclerViewAdapter extends RecyclerView.Adapter {
    ArrayList<Actor> mActorArrayList;

    public ActorRecyclerViewAdapter(ArrayList<Actor> actorArrayList) {
        mActorArrayList = actorArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mActorArrayList.size();
    }
}
class ActorViewHolder extends RecyclerView.ViewHolder{
    TextView mName, mDob, mOscars;

    public ActorViewHolder(View itemView) {
        super(itemView);

        
    }
}
