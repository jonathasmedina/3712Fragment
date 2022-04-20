package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentManager = getSupportFragmentManager();

        //BlankFragment blankFragment = new BlankFragment();

        fragmentManager.beginTransaction().add(R.id.frameLayout1,
                new BlankFragment()).commit();

        fragmentManager.beginTransaction().add(R.id.frameLayout2,
                new BlankFragment2()).commit();


    }
}