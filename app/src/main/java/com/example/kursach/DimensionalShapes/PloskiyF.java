package com.example.kursach.DimensionalShapes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kursach.FlatShapes.Elips;
import com.example.kursach.FlatShapes.Krug;
import com.example.kursach.FlatMonougolniks.Mnogougolnik;
import com.example.kursach.MainActivity;
import com.example.kursach.R;

public class PloskiyF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ploskiy_main);
    }

    public void Strela1(View view) {
        Intent intent3;
        intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }

    public void Mnogoug(View view) {
        Intent intent6;
        intent6 = new Intent(this, Mnogougolnik.class);
        startActivity(intent6);
    }

    public void Krug(View view) {
        Intent intent8;
        intent8 = new Intent(this, Krug.class);
        startActivity(intent8);
    }

    public void Elips(View view) {
        Intent intent10;
        intent10 = new Intent(this, Elips.class);
        startActivity(intent10);
    }
}