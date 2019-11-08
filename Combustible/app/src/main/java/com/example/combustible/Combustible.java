package com.example.combustible;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;


/**
 * A simple {@link Fragment} subclass.
 */
public class Combustible extends Fragment {


    public Combustible() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_combustible, container, false);
        Chronometer simpleChronometer = (Chronometer)rootView.findViewById(R.id.simpleChronometer); // initiate a chronometer
        simpleChronometer.start();
        return rootView;
    }

}
