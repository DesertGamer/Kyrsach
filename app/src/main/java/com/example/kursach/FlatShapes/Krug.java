package com.example.kursach.FlatShapes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kursach.DimensionalShapes.PloskiyF;
import com.example.kursach.R;

public class Krug extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private String text[] = { "r (радиус)", "d (диаметр)",  "S (площадь)", "P (окружость)" };
    private EditText editText;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private String selected = "r (радиус)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Задаётся состояние активности
        setContentView(R.layout.activity_krug); // Открывается активность

        editText = (EditText) findViewById(R.id.inputKrug); // Вот переменная для изменения текста
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, text);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        tv1 = (TextView) findViewById(R.id.textView23);
        tv2 = (TextView) findViewById(R.id.textView24);
        tv3 = (TextView) findViewById(R.id.textView25);
    }

    public void Strela1(View view) {
        Intent intent3;
        intent3 = new Intent(this, PloskiyF.class);
        startActivity(intent3);
    }

    public void result(View view) {
        tv2.setText("" + " ");
        tv3.setText("" + " ");
        if(editText.getText().toString().isEmpty() == true){
            tv1.setText("" + "Вы не указали заданное число!");
            return;
        }
        switch(selected){
            case "r (радиус)":
                double r0 = Float.valueOf(editText.getText().toString());
                double d = r0 * 2;
                double S = r0 * r0 * Math.PI;
                double P = r0 * 2 * Math.PI;

                tv1.setText("" + "Площадь круга: " + S);
                tv2.setText("" + "Диаметр круга: " + d);
                tv3.setText("" + "Длина окружности круга: " + P);
            break;

            case "d (диаметр)":
                double d0 = Float.valueOf(editText.getText().toString());
                double r = d0 / 2;
                double S2 = (Math.PI/4) * d0 * d0;
                double P2 = d0 * 4 * Math.PI;

                tv1.setText("" + "Площадь круга: " + S2);
                tv2.setText("" + "Радиус круга: " + r);
                tv3.setText("" + "Длина окружности круга: " + P2);
            break;

            case "S (площадь)":
                double S0 = Float.valueOf(editText.getText().toString());
                double r3 =  Math.sqrt(S0/Math.PI);
                double d3 =  Math.sqrt(S0/Math.PI) * 2;
                double P3 =  Math.sqrt(2 * Math.PI * r3);

                tv1.setText("" + "Диаметр круга: " + d3);
                tv2.setText("" + "Радиус круга: " + r3);
                tv3.setText("" + "Длина окружности круга: " + P3);
            break;

            case "P (окружость)":
                double P0 = Float.valueOf(editText.getText().toString());
                double r4 =  (P0) / (2 * Math.PI);
                double d4 =  r4 * 2;
                double S4 =  (Math.pow(P0, 2)) / (4 * Math.PI);

                tv1.setText("" + "Диаметр круга: " + d4);
                tv2.setText("" + "Радиус круга: " + r4);
                tv3.setText("" + "Площадь круга: " + S4);
            break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        System.out.println("Index: " + i);
        System.out.println("Selected: " + text[i]);

        selected = text[i];
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Забей Java это нужно поэтому просто оставим это
    }


}