package com.udacity.gradle.builditbigger.backend;
import com.example.android.jokeslib.myJokesClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private myJokesClass jokesLib;
    //Building the jokes variable
    public  MyBean(){
        jokesLib= new myJokesClass();
    }

    public String getJoke(){
        return jokesLib.getRandomJoke();
    }
}