package com.example.atulmishra.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Atul Mishra on 29-04-17.
 */

public class BottomFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottomfragment,container,false);
    }
public void hororesult(String result)

{
    TextView horotxt = (TextView) getActivity().findViewById(R.id.horoview);
    horotxt.setText(result);

}

}

