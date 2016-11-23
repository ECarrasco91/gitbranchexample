package com.ezequielc.branchexample;

/**
 * Created by NikitaShuvalov on 11/23/16.
 */

public class Actor {
    private String mName, mDOB;
    private int mOscars;

    public Actor(String name, String DOB, int oscars) {
        mName = name;
        mDOB = DOB;
        mOscars = oscars;
    }

    public String getName() {
        return mName;
    }

    public String getDOB() {
        return mDOB;
    }

    public int getOscars() {
        return mOscars;
    }
}
