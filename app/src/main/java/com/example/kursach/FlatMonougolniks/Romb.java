package com.example.kursach.FlatMonougolniks;

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

public class Romb extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private String text[] = {
            "a, h (сторона, высота)",
            "S, d2 (Площадь, малая диагональ)",
            "S, d1 (Площадь, большая диагональ)",
            "d1, d2 (Диагонали)",
            "S, a (Площадь, сторона)",
            "a, d2 (Сторона, малая диагональ)",
            "a, d1 (Сторона, большая диагональ)",
            "r, a (Радиус и сторона)"
    };
    private EditText editText;
    private EditText editText2;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;
    private String selected = "a, h (сторона, высота)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Задаётся состояние активности
        setContentView(R.layout.activity_romb); // Открывается активность

        editText = (EditText) findViewById(R.id.inputRomb); // Вот переменная для изменения текста
        editText2 = (EditText) findViewById(R.id.inputRomb2); // Вот переменная для изменения текста
        spinner = (Spinner) findViewById(R.id.spinner6);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, text);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        tv1 = (TextView) findViewById(R.id.textView56);
        tv2 = (TextView) findViewById(R.id.textView57);
        tv3 = (TextView) findViewById(R.id.textView58);
        tv4 = (TextView) findViewById(R.id.textView59);
        tv5 = (TextView) findViewById(R.id.textView58);
        tv6 = (TextView) findViewById(R.id.textView58);
        tv7 = (TextView) findViewById(R.id.textView58);
    }

    public void Strela1(View view) {
        Intent intent3;
        intent3 = new Intent(this, Mnogougolnik.class);
        startActivity(intent3);
    }

    public void result(View view) {
        tv2.setText("" + " ");
        tv3.setText("" + " ");
        tv4.setText("" + " ");
        tv5.setText("" + " ");
        tv6.setText("" + " ");
        tv7.setText("" + " ");
        if (editText.getText().toString().isEmpty() == true) {
            tv1.setText("" + "Вы не указали заданное число!");
            return;
        }
        switch(selected) {
            case "a, h (сторона, высота)": {
                double a = Float.valueOf(editText.getText().toString()); // Сторона ромба
                double h = Float.valueOf(editText2.getText().toString()); // Высота ромба

                double S = a * h;
                double P = a * 4;
                double D = a * Math.sqrt(2 + 2 * Math.cos(a));

                tv1.setText("" + "Площадь ромба: " + S);
                tv2.setText("" + "Периметр ромба: " + P);
                tv3.setText("Угол ромба α: " + D);
                break;
            }
        }
    }

    @Override
    public void onItemSelected (AdapterView < ? > adapterView, View view,int i, long l){
        System.out.println("Index: " + i);
        System.out.println("Selected: " + text[i]);

        selected = text[i];
    }

    @Override
    public void onNothingSelected (AdapterView < ? > adapterView){

    }
}