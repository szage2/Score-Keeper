package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * It can happen that the counting method is different in the original Darts 301 Parchess game.
     */

    /**
     * The scoreRed shows the total Scores of Red. The scoreBlue shows the total Scores of Blue.
     * basicScoreRed is the latest Score what the Red player thrown.
     * basicScoreBlue is the latest Score what the Blue player thrown.
     * remainingRed shows the amount of score the player has to capture in order to win the game.
     * remainingBlue shows the amount of score the player has to capture in order to win the game.
     * multiplierRed is a tool to double or triple the thrown single score, if  the Red player
     * thrown into the double or triple ring.
     * multiplierBlue is a tool to double or triple the thrown single score, if  the Blue player
     * thrown into the double or triple ring.
     * addBullRed is used in the case when the red player thrown into the Single Bull (25) or
     * Double Bull (50), so these amount of score will be added to scoreRed.
     * addBullBlue is used in the case when the red player thrown into the Single Bull (25) or
     * Double Bull (50), so these amount of score will be added to scoreBlue.
     */

    int scoreRed = 0;
    int scoreBlue = 0;
    int basicScoreRed = 0;
    int basicScoreBlue = 0;
    int remainingRed = 301;
    int remainingBlue = 301;
    int multiplierRed = 0;
    int multiplierBlue = 0;
    int addBullRed = 0;
    int addBullBlue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * The following buttons Changes the Red's basic Score for a selected One (1-20).
     */

    public void redThrownOne(View v) {
        basicScoreRed = 1;
    }

    public void redThrownTwo(View v) {
        basicScoreRed = 2;
    }

    public void redThrownThree(View v) {
        basicScoreRed = 3;
    }

    public void redThrownFour(View v) {
        basicScoreRed = 4;
    }

    public void redThrownFive(View v) {
        basicScoreRed = 5;
    }

    public void redThrownSix(View v) {
        basicScoreRed = 6;
    }

    public void redThrownSeven(View v) {
        basicScoreRed = 7;
    }

    public void redThrownEight(View v) {
        basicScoreRed = 8;
    }

    public void redThrownNine(View v) {
        basicScoreRed = 9;
    }

    public void redThrownTen(View v) {
        basicScoreRed = 10;
    }

    public void redThrownEleven(View v) {
        basicScoreRed = 11;
    }

    public void redThrownTwelve(View v) {
        basicScoreRed = 12;
    }

    public void redThrownThirteen(View v) {
        basicScoreRed = 13;
    }

    public void redThrownFourteen(View v) {
        basicScoreRed = 14;
    }

    public void redThrownFifteen(View v) {
        basicScoreRed = 15;
    }

    public void redThrownSixteen(View v) {
        basicScoreRed = 16;
    }

    public void redThrownSeventeen(View v) {
        basicScoreRed = 17;
    }

    public void redThrownEighteen(View v) {
        basicScoreRed = 18;
    }

    public void redThrownNineteen(View v) {
        basicScoreRed = 19;
    }

    public void redThrownTwenty(View v) {
        basicScoreRed = 20;
    }


    /**
     * The following buttons Changes the Blue's basic Score for a selected One (1-20).
     */

    public void blueThrownOne(View v) {
        basicScoreBlue = 1;
    }

    public void blueThrownTwo(View v) {
        basicScoreBlue = 2;
    }

    public void blueThrownThree(View v) {
        basicScoreBlue = 3;
    }

    public void blueThrownFour(View v) {
        basicScoreBlue = 4;
    }

    public void blueThrownFive(View v) {
        basicScoreBlue = 5;
    }

    public void blueThrownSix(View v) {
        basicScoreBlue = 6;
    }

    public void blueThrownSeven(View v) {
        basicScoreBlue = 7;
    }

    public void blueThrownEight(View v) {
        basicScoreBlue = 8;
    }

    public void blueThrownNine(View v) {
        basicScoreBlue = 9;
    }

    public void blueThrownTen(View v) {
        basicScoreBlue = 10;
    }

    public void blueThrownEleven(View v) {
        basicScoreBlue = 11;
    }

    public void blueThrownTwelve(View v) {
        basicScoreBlue = 12;
    }

    public void blueThrownThirteen(View v) {
        basicScoreBlue = 13;
    }

    public void blueThrownFourteen(View v) {
        basicScoreBlue = 14;
    }

    public void blueThrownFifteen(View v) {
        basicScoreBlue = 15;
    }

    public void blueThrownSixteen(View v) {
        basicScoreBlue = 16;
    }

    public void blueThrownSeventeen(View v) {
        basicScoreBlue = 17;
    }

    public void blueThrownEighteen(View v) {
        basicScoreBlue = 18;
    }

    public void blueThrownNineteen(View v) {
        basicScoreBlue = 19;
    }

    public void blueThrownTwenty(View v) {
        basicScoreBlue = 20;
    }

    /**
     * Red's Multiplicators.
     * If the player thrown into a double or triple ring, Multiplicators makes possible
     * to correct the basicScoreRed by Multiplicators doubleScoreRed (x2) or tripleScoreRed (x3),
     * so it will add the multiplication to the total score(scoreRed).
     * If the player thrown into a single ring, singleScoreRed (x1) is going to add the basicScoreRed
     * to the total score(scoreRed).
     */

    /**
     * Multiplies Red's Score by 1 and counts the remaining score for Red to win the game.
     * If the Red player achieves the desired score (301), game is over.
     */

    public void singleScoreRed (View v) {
        multiplierRed = basicScoreRed * 1;
        if (remainingRed >= multiplierRed) {
            scoreRed = scoreRed + multiplierRed; }
        remainingRed = 301 - scoreRed;
        displayForRed(scoreRed);
        displayRemainingScoreRed(remainingRed);
        if (remainingRed == 0) {
            String winnerIsRed = "Game over. \nRed player is the winner!";
            displayGameOverRed(winnerIsRed); }
    }

    /**
     * Multiplies Red's Score by 2 and counts the remaining score for Red to win the game.
     * If the Red player achieves the desired score (301), game is over.
     */

    public void doubleScoreRed (View v) {
        multiplierRed = basicScoreRed * 2;
        if (remainingRed >= multiplierRed) {
            scoreRed = scoreRed + multiplierRed; }
        displayForRed(scoreRed);
        remainingRed = 301 - scoreRed;
        displayRemainingScoreRed(remainingRed);
        if (remainingRed == 0) {
            String winnerIsRed = "Game over. \nRed player is the winner!";
            displayGameOverRed(winnerIsRed); }
    }

    /**
     * Multiplies Red's Score by 3 and counts the remaining score for Red to win the game.
     * If the Red player achieves the desired score (301), game is over.
     */

    public void tripleScoreRed (View v) {
        multiplierRed = basicScoreRed * 3;
        if (remainingRed >= multiplierRed) {
            scoreRed = scoreRed + multiplierRed; }
        displayForRed(scoreRed);
        remainingRed = 301 - scoreRed;
        displayRemainingScoreRed(remainingRed);
        if (remainingRed == 0) {
            String winnerIsRed = "Game over. \nRed player is the winner!";
            displayGameOverRed(winnerIsRed); }
    }

    /**
     * Blue's Multiplicators:
     * * If the player thrown into a double or triple ring Multiplicators makes possible
     * to correct the basicScoreBlue by Multiplicators doubleScoreBlue (x2) or tripleScoreBlue (x3),
     * so it will add the multiplication to the total score(scoreBlue).
     * If the player thrown into a single ring, singleScoreBlue (x1) is going to add the basicScoreBlue
     * to the total score(scoreBlue).
     */

    /**
     * Multiplies Blue's Score by 1 and counts the remaining score for Blue to win the game.
     * If the Blue player achieves the desired score (301), game is over.
     */

    public void singleScoreBlue (View v) {
        multiplierBlue = basicScoreBlue * 1;
        if (remainingBlue >= multiplierBlue) {
            scoreBlue = scoreBlue + multiplierBlue; }
        displayForBlue(scoreBlue);
        remainingBlue = 301 - scoreBlue;
        displayRemainingScoreBlue(remainingBlue);
        if (remainingBlue == 0) {
            String winnerIsBlue = "Game over. \nBlue player is the winner!";
            displayGameOverBlue(winnerIsBlue); }
    }

    /**
     * Multiplies Blue's Score by 2 and counts the remaining score for Blue to win the game.
     * If the Blue player achieves the desired score (301), game is over.
     */

    public void doubleScoreBlue (View v) {
        multiplierBlue = basicScoreBlue * 2;
        if (remainingBlue >= multiplierBlue) {
            scoreBlue = scoreBlue + multiplierBlue; }
        displayForBlue(scoreBlue);
        remainingBlue = 301 - scoreBlue;
        displayRemainingScoreBlue(remainingBlue);
        if (remainingBlue == 0) {
            String winnerIsBlue = "Game over. \nBlue player is the winner!";
            displayGameOverBlue(winnerIsBlue); }

    }

    /**
     * Multiplies Blue's Score by 3 and counts the remaining score for Blue to win the game.
     * If the Blue player achieves the desired score (301), game is over.
     */

    public void tripleScoreBlue (View v) {
        multiplierBlue = basicScoreBlue * 3;
        if (remainingBlue >= multiplierBlue) {
            scoreBlue = scoreBlue + multiplierBlue; }
        displayForBlue(scoreBlue);
        remainingBlue = 301 - scoreBlue;
        displayRemainingScoreBlue(remainingBlue);
        if (remainingBlue == 0) {
            String winnerIsBlue = "Game over. \nBlue player is the winner!";
            displayGameOverBlue(winnerIsBlue); }
    }

    /**
     * Starts the counting over, so the Total scores and the remaining scores will change back
     * for the original value.
     */

    public void resetScore(View v) {
        scoreRed = 0;
        scoreBlue = 0;
        remainingRed = 301;
        remainingBlue = 301;
        String reloadRed = "Remaining";
        String reloadBlue = "Remaining";
        displayForRed(scoreRed);
        displayForBlue(scoreBlue);
        displayRemainingScoreRed(remainingRed);
        displayRemainingScoreBlue(remainingBlue);
        displayResetBlue(reloadBlue);
        displayResetRed(reloadRed);
    }

    /**
     * Adds the precise value of Single Bull for Red player (25).
     * If the Red player achieves the desired score (301), game is over.
     */

    public void redThrownSingleBull (View v) {
        addBullRed = 25;
        if (remainingRed >= addBullRed) {
            scoreRed = scoreRed + addBullRed ; }
        remainingRed = 301 - scoreRed;
        displayForRed(scoreRed);
        displayRemainingScoreRed(remainingRed);
        if (remainingRed == 0) {
            String winnerIsRed = "Game over. \nRed player is the winner!";
            displayGameOverRed(winnerIsRed); }
    }

    /**
     * Adds the precise value of Double Bull for Red player (50).
     * If the Red player achieves the desired score (301), game is over.
     */

    public void redThrownDoubleBull (View v) {
        addBullRed = 50;
        displayRemainingScoreRed(remainingRed);
        if (remainingRed >= addBullRed) {
            scoreRed = scoreRed + addBullRed ; }
        remainingRed = 301 - scoreRed;
        displayForRed(scoreRed);
        if (remainingRed == 0) {
            String winnerIsRed = "Game over. \nRed player is the winner!";
            displayGameOverRed(winnerIsRed); }

    }

    /**
     * Adds the precise value of Single Bull for Blue player (25).
     * If the Blue player achieves the desired score (301), game is over.
     */

    public void blueThrownSingleBull (View v) {
        addBullBlue = 25;
        if (remainingBlue >= addBullBlue) {
            scoreBlue = scoreBlue + addBullBlue ; }
        remainingBlue = 301 - scoreBlue;
        displayForBlue(scoreBlue);
        displayRemainingScoreBlue(remainingBlue);
        if (remainingBlue == 0) {
            String winnerIsBlue = "Game over. \nBlue player is the winner!";
            displayGameOverBlue(winnerIsBlue); }
    }

    /**
     * Adds the precise value of Double Bull for Blue player (50).
     * If the Blue player achieves the desired score (301), game is over.
     */

    public void blueThrownDoubleBull (View v) {
        addBullBlue = 50;
        if (remainingBlue >= addBullBlue) {
            scoreBlue = scoreBlue + addBullBlue ; }
        remainingBlue = 301 - scoreBlue;
        displayForBlue(scoreBlue);
        displayRemainingScoreBlue(remainingBlue);
        if (remainingBlue == 0) {
            String winnerIsBlue = "Game over. \nBlue player is the winner!";
            displayGameOverBlue(winnerIsBlue); }
    }

    /**
     * Displays the given score for Red player.
     */

    public void displayForRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Blue player.
     */

    public void displayForBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the remaining scores from 301 for Red player.
     */

    public void displayRemainingScoreRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.remaining_for_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the remaining scores from 301 for Blue player.
     */

    public void displayRemainingScoreBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.remaining_for_blue);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the text "Game over. Red player is the winner!" once Red achieves the score of 301.
     */

    private void displayGameOverRed(String message) {
        TextView remainTextView = (TextView) findViewById(R.id.for_red_to_win);
        remainTextView.setText(message);
    }

    /**
     * Displays the text "Game over. Blue player is the winner!" once Blue achieves the score of 301.
     */

    private void displayGameOverBlue(String message) {
        TextView remainTextView = (TextView) findViewById(R.id.for_blue_to_win);
        remainTextView.setText(message);
    }

    /**
     * Disappears the text "Game over. ..." and change for original text "Remaining" for Red.
     */

    public void displayResetRed(String message) {
        TextView remainTextView = (TextView) findViewById(R.id.for_red_to_win);
        remainTextView.setText(message);
    }

    /**
     * Disappears the text "Game over. ..." and change for original text "Remaining" for Blue.
     */

    public void displayResetBlue(String message) {
        TextView remainTextView = (TextView) findViewById(R.id.for_blue_to_win);
        remainTextView.setText(message);
    }

}