package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {

    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        volver = findViewById(R.id.volver);
        volver.setOnClickListener(this);
    }
    public void onClick(View view) {

        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}