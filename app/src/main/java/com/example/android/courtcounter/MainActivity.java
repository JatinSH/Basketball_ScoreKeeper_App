package com.example.android.courtcounter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0,scoreB=0;

    /**
     * This method is called when the order button is clicked.
     */

    public void A3(View view){
        scoreA+=3;
        displayA(scoreA);
    }

    public void A2(View view){
        scoreA+=2;
        displayA(scoreA);
    }

    public void freeA(View view){
        scoreA++;
        displayA(scoreA);
    }

    public void B3(View view){
        scoreB+=3;
        displayB(scoreB);
    }

    public void B2(View view){
        scoreB+=2;
        displayB(scoreB);
    }

    public void freeB(View view){
        scoreB++;
        displayB(scoreB);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamA);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.teamB);
            quantityTextView.setText("" + number);
    }





}