package com.example.android.jokeslib;

import java.awt.Button;
import java.util.Random;

public class myJokesClass {

    private String[] jokes;
    private Random random;
    private int numberOfJokes = 6;

    //Define jokes, to increase the number of Jokes first increase the numberOfJokes variable
    public myJokesClass(){
        jokes = new String[numberOfJokes];
        jokes[0]="Java has encountered a problem with Windows";
        jokes[1]="There are 10 kinds of people in the world: Those that know binary & those that don’t";
        jokes[2]="Two bytes meet. The first byte asks, “Are you ill? /n The second byte replies, “No, just feeling a bit off.";
        jokes[3]="If Java is the answer, it must have been a really verbose question";
        jokes[4]="Unix is user friendly. It’s just very particular about who its friends are.";
        jokes[5]="Software developers like to solve problems. If there are no problems handily available, they will create their own problems.";
        random = new Random();
    }
    //Get the jokes String Array
    public String[] getJokes(){
        return jokes;
    }

    //Get a random Joke
    public String getRandomJoke(){
        return jokes[random.nextInt(jokes.length)];
    }
}
