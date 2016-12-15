package com.example.usuario.juegosimon;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mpb,mpr,mpg,mpy,mpf,mpw;

    TextView Text;
    Button ButtonGreen, ButtonYellow, ButtonRed, ButtonBlue, Start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            mpb = MediaPlayer.create(this, R.raw.blue);
            mpg = MediaPlayer.create(this, R.raw.green);
            mpr = MediaPlayer.create(this, R.raw.red);
            mpy = MediaPlayer.create(this, R.raw.yellow);
            mpw = MediaPlayer.create(this, R.raw.win);
            mpf = MediaPlayer.create(this, R.raw.loose);

            Start = (Button) findViewById(R.id.buttonStart);
            ButtonGreen= (Button) findViewById(R.id.buttonGreen);
            ButtonRed = (Button) findViewById(R.id.buttonRed);
            ButtonBlue = (Button) findViewById(R.id.buttonBlue);
            ButtonYellow = (Button) findViewById(R.id.buttonYellow);
            Text = (TextView) findViewById(R.id.textView);





        }
    }
}
