package com.samu.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Fragment myfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FragmentOneClick(View view) {
        myfragment = new Fragment_1();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_switch,myfragment);
        fragmentTransaction.commit();
    }

    public void FragmentTwoClick(View view){

        myfragment = new Fragment_2();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_switch2,myfragment);
        fragmentTransaction.commit();
    }
}
