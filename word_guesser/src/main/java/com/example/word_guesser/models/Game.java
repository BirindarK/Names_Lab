package com.example.word_guesser.models;

public class Game {
    //private attributes
    private String word;
    private int guesses;
    private boolean complete;

    //default constructor
    public Game() {}

    public Game(String word){
        this.word = word;
        this.guesses = 0;
        this.complete = false;
    }

    //accessible through getters and setters

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
