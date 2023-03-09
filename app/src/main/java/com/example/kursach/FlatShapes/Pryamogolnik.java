package com.example.kursach.FlatShapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.kursach.FlatMonougolniks.Mnogougolnik;
import com.example.kursach.R;

public class Pryamogolnik extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private String text[] = { "a, b (стороны)", "S, a или b (площадь и сторона)",  "d, a или b (диагоналоь и сторона)", "P, d (периметр и диагональ)" };
    private EditText editText;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private String selected = "r (радиус)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pryamogolnik);

        editText = (EditText) findViewById(R.id.inputPrimoug); // Вот переменная для изменения текста
        editText = (EditText) findViewById(R.id.inputPrimoug2); // Вот переменная для изменения текста
        spinner = (Spinner) findViewById(R.id.spinner4);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, text);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        tv1 = (TextView) findViewById(R.id.textView37);
        tv2 = (TextView) findViewById(R.id.textView39);
        tv3 = (TextView) findViewById(R.id.textView44);
        tv3 = (TextView) findViewById(R.id.textView46);
    }

    public void Strela1(View view) {
        Intent intent3;
        intent3 = new Intent(this, Mnogougolnik.class);
        startActivity(intent3);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}