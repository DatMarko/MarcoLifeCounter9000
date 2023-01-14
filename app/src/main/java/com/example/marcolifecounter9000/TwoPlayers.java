package com.example.marcolifecounter9000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class TwoPlayers extends AppCompatActivity {
    // ------------ INSTANCE VARIABLES ------------ \\

    // Log tag variable
    private static final String TAG = "TwoPlayers";

    // ------------ Instance methods ------------ \\
    private int mCounter1 = 0;
    private int mCounter2 = 0;
    Button btn;
    TextView txv;
    /**
     * When the instance (activity) get's launched, this method will be called first.
     *
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_players);

    }
    public void home(View v){
        Log.d(TAG, "twoplayers: Method called");

        Toast.makeText(TwoPlayers.this, "Ending game...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(TwoPlayers.this, MainActivity.class);
        startActivity(intent);
    }

    public void addLife1(View v){
        Log.d(TAG, "addLife: Method called");
        Button btn = findViewById(R.id.button5);
        TextView txv = findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter1 ++;
                txv.setText(Integer.toString(mCounter1));
            }
        });
    }
    public void loseLife1(View v){
        Log.d(TAG, "loseLife: Method called");
        Button btn = findViewById(R.id.button6);
        TextView txv = findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter1 --;
                txv.setText(Integer.toString(mCounter1));
            }
        });
    }
    public void addLife2(View v){
        Log.d(TAG, "addLife: Method called");
        Button btn = findViewById(R.id.button7);
        TextView txv = findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter2 ++;
                txv.setText(Integer.toString(mCounter2));
            }
        });
    }
    public void loseLife2(View v){
        Log.d(TAG, "loseLife: Method called");
        Button btn = findViewById(R.id.button8);
        TextView txv = findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter2 --;
                txv.setText(Integer.toString(mCounter2));
            }
        });
    }


    /**
     * Initializing all the objects that have associated
     * values from the XML file.
     * AKA initializing widgets.
     */

}
