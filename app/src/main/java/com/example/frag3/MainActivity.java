package com.example.frag3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This gets called by Top Fragment when user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        BottomFragment PictureFrag = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        PictureFrag.setMemeText(top, bottom);

    }
}