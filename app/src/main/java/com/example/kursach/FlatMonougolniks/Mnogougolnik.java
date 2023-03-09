package com.example.kursach.FlatMonougolniks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kursach.FlatShapes.Pryamogolnik;
import com.example.kursach.MainActivity;
import com.example.kursach.R;
import com.example.kursach.Treug2;

public class Mnogougolnik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnogougolnik);
    }
    public void Strela1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Trup(View view) {
        Intent intent = new Intent(this, Trupechiya.class);
        startActivity(intent);
    }
    public void Pryamoug(View view) {
        Intent intent = new Intent(this, Pryamogolnik.class);
        startActivity(intent);
    }

    public void Tringle(View view) {
        Intent intent = new Intent(this, Treug2.class);
        startActivity(intent);
    }

    public void Romb(View view) {
        Intent intent = new Intent(this, Romb.class);
        startActivity(intent);
    }
    public void Kvadrat(View view) {
        Intent intent = new Intent(this, Kvadrat.class);
        startActivity(intent);
    }
}