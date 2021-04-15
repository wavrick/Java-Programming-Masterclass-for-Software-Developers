package com.Section4_ExpressionsStatementsCodeblocksMethods;

public class ScoreChallenge {


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + calculateHighScore(highScorePosition) + " on the high score table");
    }

    public static int calculateHighScore(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else {
            if (playerScore > 500 && playerScore < 1000) {
                return 2;
            } else {
                if (playerScore > 100 && playerScore < 500) {
                    return 3;
                } else {
                    return 4;
                }
            }
        }
    }

    public static void main(String[] args){

        displayHighScorePosition("Ricardo", 1500);
        displayHighScorePosition("Joanna", 900);
        displayHighScorePosition("Mateus", 400);
        displayHighScorePosition("Eryk", 50);

    }


}
