package com.example.atulmishra.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.horofinder {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void searchoro(String date, String month) {
        BottomFragment btmfrag = (BottomFragment)getFragmentManager().findFragmentById(R.id.bottomfragment);
        String resultstr = date + "-" + month;
            btmfrag.hororesult(resultstr);


    }
}
