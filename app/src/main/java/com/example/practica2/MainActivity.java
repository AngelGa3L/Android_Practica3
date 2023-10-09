package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.CountDownTimer;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button iniciar;
    TextView countdown;
    CountDownTimer countDownTimer;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        iniciar = findViewById(R.id.inicio);
        countdown = findViewById(R.id.countdown);
        iniciar.setOnClickListener(this);

    }
    public void onClick(View view) {
        if (view == iniciar) {
            startTimer();
        }
    }
    private void startTimer() {
        countDownTimer = new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {

                int seconds = (int) (millisUntilFinished / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;
                String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
                countdown.setText("Temporizador: " + timeLeftFormatted);
            }
            public void onFinish() {
                countdown.setText("Temporizador: 00:00");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        }.start();
    }
}