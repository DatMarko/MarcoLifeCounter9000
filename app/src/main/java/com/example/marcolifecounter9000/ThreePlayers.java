package com.example.marcolifecounter9000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreePlayers extends AppCompatActivity {
    // Log tag variable
    private static final String TAG = "ThreePlayers";


    // ------------ Instance methods ------------ \\
    private int mCounter1 = 0;
    private int mCounter2 = 0;
    private int mCounter3 = 0;
    private Button btn;
    private TextView txv;
    private String serverName = "time.nist.gov"; //I need another address for my application
    private int serverPort = 13; //I need to find a port number for my server

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
        Log.d(TAG, "Getting Time: Method called");
        Button btn = findViewById(R.id.button1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mCounter1 ++;         // commenting these out for now to test server/client code
                //txv.setText(Integer.toString(mCounter1));
                TextView txv = findViewById(R.id.textView1);
                NistTimeClient runnable = new NistTimeClient(serverName, serverPort, txv);
                new Thread(runnable).start();

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
    private class NistTimeClient implements Runnable{

        private String serverName;
        private int serverPort;
        public NistTimeClient(String serverName, int serverPort, TextView txv) {
            this.serverName = serverName;
            this.serverPort = serverPort;
        }
        @Override
        public void run() {

            try{
                Socket socket = new Socket(serverName, serverPort);
                
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                br.readLine(); //this represents current line which starts empty.
                String recTime = br.readLine().substring(6,23);
                socket.close();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        txv.setText(recTime);
                    }
                });
            }   catch (IOException e){
                    e.printStackTrace();
            }

        }

    }
}
