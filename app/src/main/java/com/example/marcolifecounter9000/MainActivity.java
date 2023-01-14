package com.example.marcolifecounter9000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Log tag variable
    private static final String TAG = "AdminMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void twoplayers(View v){
        Log.d(TAG, "twoplayers: Method called");

        Toast.makeText(MainActivity.this, "Creating a two-player game...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, TwoPlayers.class);
        startActivity(intent);
    }
    public void threeplayers(View v){
        Log.d(TAG, "threeplayers: Method called");

        Toast.makeText(MainActivity.this, "Creating a three-player game...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, ThreePlayers.class);
        startActivity(intent);
    }
    public void fourplayers(View v){
        Log.d(TAG, "twoplayers: Method called");

        Toast.makeText(MainActivity.this, "Creating a four-player game...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, FourPlayers.class);
        startActivity(intent);
    }
}