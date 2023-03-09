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

import com.example.kursach.DimensionalShapes.PloskiyF;
import com.example.kursach.R;

public class Elips extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private String text[] = { "a, b (полуоси)", "c, d (оси)" };
    private EditText editText;
    private EditText editText2;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private String selected = "a, b (полуоси)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elips);

        editText = (EditText) findViewById(R.id.inputElips1); // Вот переменная для изменения текста
        editText2 = (EditText) findViewById(R.id.inputElips2); // Вот переменная для изменения текста
        spinner = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, text);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        tv1 = (TextView) findViewById(R.id.textView38);
        tv2 = (TextView) findViewById(R.id.textView33);
        tv3 = (TextView) findViewById(R.id.textView35);
        tv4 = (TextView) findViewById(R.id.textView34);

    }
    public void Strela1(View view) {
        Intent intent3;
        intent3 = new Intent(this, PloskiyF.class);
        startActivity(intent3);
    }

    public void Result(View view) {
        tv2.setText("" + " ");
        tv3.setText("" + " ");
        tv4.setText("" + " ");
        if(editText.getText().toString().isEmpty() == true){
            tv1.setText("" + "Вы не указали заданное число!");
            return;
        }
        if(editText2.getText().toString().isEmpty() == true){
            tv1.setText("" + "Вы не указали заданное число!");
            return;
        }

        switch(selected){
            case "a, b (полуоси)":
                double a0 = Float.valueOf(editText.getText().toString());
                double b0 = Float.valueOf(editText2.getText().toString());
                double S = a0 * b0 * Math.PI;
                double P = (2 * Math.PI) * (Math.sqrt(Math.pow(a0, 2) + Math.pow(b0, 2) / 2));
                double c = a0 * 2;
                double d = b0 * 2;

                tv1.setText("" + "Площадь эллипса: " + S);
                tv2.setText("" + "Длина окружности эллипса: " + P);
                tv3.setText("" + "Длина малой оси: " + c);
                tv4.setText("" + "Длина большой оси: " + d);
                break;

            case "c, d (оси)":
                double a01 = Float.valueOf(editText.getText().toString());
                double b01 = Float.valueOf(editText2.getText().toString());
                double S2 = Math.PI * ((a01 * b01) / 4);
                double P2 = (2 * Math.PI) * (Math.sqrt((Math.pow(a01, 2) + Math.pow(b01, 2))/ 8));
                double a = a01 / 2;
                double b = b01 / 2;

                tv1.setText("" + "Площадь эллипса: " + S2);
                tv2.setText("" + "Окружность эллипса: " + P2);
                tv3.setText("" + "Длина малой полуоси: " + a);
                tv4.setText("" + "Длина большой полуоси: " + b);
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Вот здесь код выбора из выпадающего меню
        System.out.println("Index: " + i);
        System.out.println("Selected: " + text[i]);

        selected = text[i];
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        //Пустой метод не нужен в данном случае
    }
}