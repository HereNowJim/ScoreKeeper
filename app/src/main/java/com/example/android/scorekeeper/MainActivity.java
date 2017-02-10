package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for Wales
    int scoreWales = 0;
    //Tracks the score for England
    int scoreEngland = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForWales(0);
        displayForEngland(0);
    }

    /**
     * This method is called when the 'Penalty/Drop Goal +3' button is pressed for Wales.
     */
    public void plus3PointsWales(View v) {
        scoreWales = scoreWales + 3;
        displayForWales(scoreWales);
    }

    /**
     * This method is called when the 'Conversion +2' button is pressed for Wales.
     */
    public void plus2PointsWales(View v) {
        scoreWales = scoreWales + 2;
        displayForWales(scoreWales);
    }

    /**
     * This method is called when the 'Try +5 button is pressed for Wales.
     */
    public void tryWales(View v) {
        scoreWales = scoreWales + 5;
        displayForWales(scoreWales);
    }

    /**
     * Displays the given score for Wales.
     */

    public void displayForWales(int score) {

        TextView scoreView = (TextView) findViewById(R.id.wales_score);

        scoreView.setText(String.valueOf(score));

    }

    /**
     * This method is called when the 'Penalty/Drop Goal +3' button is pressed for England.
     */
    public void plus3PointsEngland(View v) {
        scoreEngland = scoreEngland + 3;
        displayForEngland(scoreEngland);
    }

    /**
     * This method is called when the 'Conversion +2 button is pressed for England
     */
    public void plus2PointsEngland(View v) {
        scoreEngland = scoreEngland + 2;
        displayForEngland(scoreEngland);
    }

    /**
     * This method is called when the 'Try +5' button is pressed for England.
     */
    public void tryEngland(View v) {
        scoreEngland = scoreEngland + 5;
        displayForEngland(scoreEngland);
    }

    /**
     * Displays the given score for England.
     */

    public void displayForEngland(int score) {

        TextView scoreView = (TextView) findViewById(R.id.england_score);

        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 'Reset' button is pressed. It sets the scores to zero and displays those scores.
     */
    public void resetScore(View v) {
        scoreWales = 0;
        scoreEngland = 0;
        displayForWales(scoreWales);
        displayForEngland(scoreEngland);
    }
}