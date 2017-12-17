package com.udacity.gradle.showjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJoke extends AppCompatActivity {

    public final static String JOKE_ARG = "JOKE_ARG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);
        String joke = getIntent().getStringExtra(JOKE_ARG);
        TextView tv = (TextView)findViewById(R.id.joke_tv);
        tv.setText(joke);
    }
}
