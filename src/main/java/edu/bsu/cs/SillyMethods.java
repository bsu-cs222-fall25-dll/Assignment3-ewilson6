package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int count) {
        StringBuilder countSequence = new StringBuilder();
        for(int i = 0; i <= count; i++){
            countSequence.append(i).append(" ");
        }
        return countSequence.toString().trim();
    }
}
