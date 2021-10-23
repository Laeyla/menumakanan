package com.example.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void beli(View view) {
        Intent intent = new Intent( MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    public void ayam(View view) {
        Intent intent = new Intent( MainActivity.this,MainActivity3.class);
        startActivity(intent);
    }
    public void teok(View view) {
        Intent intent = new Intent( MainActivity.this,MainActivity4.class);
        startActivity(intent);
    }
}