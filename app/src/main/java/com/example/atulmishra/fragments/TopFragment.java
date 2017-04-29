package com.example.atulmishra.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Atul Mishra on 29-04-17.
 */

public class TopFragment extends Fragment {
    private horofinder interfacesearcher;



    public interface horofinder
{
    public void searchoro(String date, String month);

}

    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        this.interfacesearcher=(horofinder)context ;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.topfragment,container,false);
    }


    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Spinner datespin = (Spinner)getActivity().findViewById(R.id.date);
                Spinner monthspin = (Spinner)getActivity().findViewById(R.id.month);

                interfacesearcher.searchoro(datespin.getSelectedItem().toString(),monthspin.getSelectedItem().toString());


            }
        });


    }
}
