package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button Ex1;
    Button Ex2;
    Button Ex3;
    Button Ex4;
    Button Im1;
    Button Im2;
    Button Im3;
    Button Im4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Ex1 = findViewById(R.id.boton1);
        Ex2 = findViewById(R.id.boton2);
        Ex3 = findViewById(R.id.boton3);
        Ex4 = findViewById(R.id.boton4);
        Im1 = findViewById(R.id.boton5);
        Im2 = findViewById(R.id.boton6);
        Im3 = findViewById(R.id.boton7);
        Im4 = findViewById(R.id.boton8);
        Im1.setOnClickListener(this);
        Im2.setOnClickListener(this);
        Im3.setOnClickListener(this);
        Im4.setOnClickListener(this);
        Ex1.setOnClickListener(this);
        Ex2.setOnClickListener(this);
        Ex3.setOnClickListener(this);
        Ex4.setOnClickListener(this);


    }
    public void onClick(View view) {
        if (view == Ex1) {
            expli1();
        } else if (view == Im1) {
            web1();
        }
        else if (view == Im2) {
            web2();
        }
        else if (view == Ex2) {
            expli2();
        }
        else if (view == Im3) {
            web3();
        }
        else if (view == Im4) {
            web4();
        }
        else if (view == Ex3) {
            expli3();
        }
        else if (view == Ex4) {
            expli4();
        }
    }
    public void expli1(){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void expli2(){
        Intent intent = new Intent(this,MainActivity7.class);
        startActivity(intent);
    }
    public void expli3(){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void expli4(){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
    public void web1(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com.ar"));
        startActivity(intent);
    }
    public void web2(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com.ar"));
        startActivity(intent);
    }
    public void web3(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.instagram.com.ar"));
        startActivity(intent);
    }
    public void web4(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com.ar"));
        startActivity(intent);
    }

}