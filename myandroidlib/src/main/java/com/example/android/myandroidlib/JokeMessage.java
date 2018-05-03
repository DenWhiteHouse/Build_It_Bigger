package com.example.android.myandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeMessage extends AppCompatActivity {

    public final static String JOKE_INTENT="JOKE_INTENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_message_display);
        // Getting the Joke from the Intent
        String joke = getIntent().getStringExtra(JOKE_INTENT);
        TextView textViewJoke = (TextView) findViewById(R.id.textview_joke);
        String textholder = joke;
        textViewJoke.setText(joke);
    }
}
