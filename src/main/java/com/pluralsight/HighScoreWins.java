package com.pluralsight;

import com.sun.jdi.event.EventIterator;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner HSW = new Scanner(System.in);
        //Home:Visitor|21:9



        String scoring = "BlueLock|AoAshi|21|9";

        String[] splitInput = scoring.split("\\|");

        String blueLock = splitInput[0];
        String aoAshi = splitInput[1];
        int score1 = Integer.parseInt(splitInput[2]);
        int score2 = Integer.parseInt(splitInput[3]);

        String winner;
        if (score1 > score2)
            winner = blueLock;
        else
            winner = aoAshi;


        System.out.println("And The Team With The Winning Score Is:" + "\u001B[1m" + winner + "\u001B[0m");






    }
}
