package com.example.marcolifecounter9000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThreePlayers extends AppCompatActivity {
    // Log tag variable
    private static final String TAG = "ThreePlayers";


    // ------------ Instance methods ------------ \\

    /**
     * When the instance (activity) get's launched, this method will be called first.
     *
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_players);

    }
    public void home(View v){
        Log.d(TAG, "twoplayers: Method called");

        Toast.makeText(ThreePlayers.this, "Ending game...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(ThreePlayers.this, MainActivity.class);
        startActivity(intent);
    }
}
