package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.kursach.DimensionalShapes.PloskiyF;
import com.example.kursach.FlatShapes.ObemnyMain;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plosky(View view) {
        try {
            Intent intent = new Intent(this, PloskiyF.class);
            startActivity(intent);
        } catch(Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }

    public void obemny(View view) {
        try {
            Intent intent2 = new Intent(this, ObemnyMain.class);
            startActivity(intent2);
        } catch(Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }
}