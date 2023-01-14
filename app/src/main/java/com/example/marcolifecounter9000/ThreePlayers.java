package com.example.marcolifecounter9000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThreePlayers extends AppCompatActivity {
    // Log tag variable
    private static final String TAG = "ThreePlayers";


    // ------------ Instance methods ------------ \\
    private int mCounter1 = 0;
    private int mCounter2 = 0;
    private int mCounter3 = 0;
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
        setContentView(R.layout.three_players);

    }
    public void home(View v){
        Log.d(TAG, "twoplayers: Method called");

        Toast.makeText(ThreePlayers.this, "Ending game...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(ThreePlayers.this, MainActivity.class);
        startActivity(intent);
    }
    public void addLife1(View v){
        Log.d(TAG, "addLife: Method called");
        Button btn = findViewById(R.id.button1);
        TextView txv = findViewById(R.id.textView1);

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
        Button btn = findViewById(R.id.button2);
        TextView txv = findViewById(R.id.textView1);

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
        Button btn = findViewById(R.id.button3);
        TextView txv = findViewById(R.id.textView2);

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
        Button btn = findViewById(R.id.button4);
        TextView txv = findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter2 --;
                txv.setText(Integer.toString(mCounter2));
            }
        });
    }
    public void addLife3(View v){
        Log.d(TAG, "addLife: Method called");
        Button btn = findViewById(R.id.button5);
        TextView txv = findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter3 ++;
                txv.setText(Integer.toString(mCounter3));
            }
        });
    }
    public void loseLife3(View v){
        Log.d(TAG, "loseLife: Method called");
        Button btn = findViewById(R.id.button6);
        TextView txv = findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter3 --;
                txv.setText(Integer.toString(mCounter3));
            }
        });
    }
}
