package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentOne fragmentOne;
    private FragmentTwo fragmentTwo;
    private FragmentThree fragmentThree;
    private FragmentFour fragmentFour;

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = FragmentOne.newInstance();
        fragmentTwo = FragmentTwo.newInstance();
        fragmentThree = FragmentThree.newInstance();
        fragmentFour = FragmentFour.newInstance();

        manager = getSupportFragmentManager();

        findViewById(R.id.google).setOnClickListener(view -> {
            // start of transaction
            FragmentTransaction transaction = manager.beginTransaction();
            // changing fragments
            transaction.replace(R.id.container, fragmentOne);
            transaction.commit();
        });

        findViewById(R.id.facebook).setOnClickListener(view -> {
            // start of transaction
            FragmentTransaction transaction = manager.beginTransaction();
            // changing fragments
            transaction.replace(R.id.container, fragmentTwo);
            transaction.commit();
        });

        findViewById(R.id.twitter).setOnClickListener(view -> {
            // start of transaction
            FragmentTransaction transaction = manager.beginTransaction();
            // changing fragments
            transaction.replace(R.id.container, fragmentThree);
            transaction.commit();
        });

        findViewById(R.id.developer).setOnClickListener(view -> {
            // start of transaction
            FragmentTransaction transaction = manager.beginTransaction();
            // changing fragments
            transaction.replace(R.id.container, fragmentFour);
            transaction.commit();
        });
    }
}
