package com.samu.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragment_1 extends Fragment implements View.OnClickListener {

    public View myview;
    public Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myview = inflater.inflate(R.layout.fragment_1, container, false);
        button = (Button) myview.findViewById(R.id.buttonId);
        button.setOnClickListener(this);
        return myview;

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonId:
                Toast.makeText(getContext(), "Fragment 1 is clicked", Toast.LENGTH_LONG).show();
                break;
            default:
//                Toast.makeText(getContext(),"Fragment 1 is clicked",Toast.LENGTH_LONG);
                break;

        }
    }
}