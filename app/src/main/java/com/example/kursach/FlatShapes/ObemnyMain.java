package com.example.kursach.FlatShapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kursach.DimensionalShapes.Elipsoid;
import com.example.kursach.DimensionalShapes.Prizma;
import com.example.kursach.MainActivity;
import com.example.kursach.Pryamoug2;
import com.example.kursach.R;
import com.example.kursach.Romb2;
import com.example.kursach.Tor;
import com.example.kursach.Treug2;

public class ObemnyMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obemny_main);
    }

    public void strela3(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Elips2(View view) {
        Intent intent = new Intent(this, Elipsoid.class);
        startActivity(intent);
    }

    public void Pryamoug2(View view) {
        Intent intent = new Intent(this, Pryamoug2.class);
        startActivity(intent);
    }

    public void Krug2(View view) {
        Intent intent = new Intent(this, Pryamoug2.class);
        startActivity(intent);
    }
    public void Kvadrat2(View view) {
        Intent intent = new Intent(this, Pryamoug2.class);
        startActivity(intent);
    }
    public void Treug2(View view) {
        Intent intent = new Intent(this, Treug2.class);
        startActivity(intent);
    }

    public void Romb2(View view) {
        Intent intent = new Intent(this, Romb2.class);
        startActivity(intent);
    }

    public void Prizma2(View view) {
        Intent intent = new Intent(this, Prizma.class);
        startActivity(intent);
    }

    public void Tor(View view) {
        Intent intent = new Intent(this, Tor.class);
        startActivity(intent);
    }


}