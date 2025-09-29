package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner HSW = new Scanner(System.in);
        //Home:Visitor|21:9



        String scoring = "Home|Visitor|21|9";

        String[] splitInput = scoring.split("\\|");

        String home = splitInput[0];
        String visitor = splitInput[1];
        int score1 = Integer.parseInt(splitInput[2]);
        int score2 = Integer.parseInt(splitInput[3]);

        System.out.println("And The Team With The Winning Score Is: %s, score, team ");






    }
}
