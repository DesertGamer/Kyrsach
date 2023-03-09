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

public class Kvadrat extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private String text[] = { "a (сторона)", "S (площадь)", "d (диагональ)", "P (периметр)", "r (радиус вписанной окружности)", "R (радиус описанной окружности)" };
    private EditText editText;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private String selected = "a (сторона)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kvadrat);

        editText = (EditText) findViewById(R.id.inputKvadrat); // Вот переменная для изменения текста
        spinner = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, text);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        tv1 = (TextView) findViewById(R.id.textView30);
        tv2 = (TextView) findViewById(R.id.textView27);
        tv3 = (TextView) findViewById(R.id.textView29);
        tv4 = (TextView) findViewById(R.id.textView28);
        tv5 = (TextView) findViewById(R.id.textView31);
        tv6 = (TextView) findViewById(R.id.textView32);
    }

    public void Strela1(View view) {
        Intent intent3;
        intent3 = new Intent(this, Mnogougolnik.class);
        startActivity(intent3);
    }

    public void Result(View view) {
        if (editText.getText().toString().isEmpty() == true) {
            tv1.setText("" + "Вы не указали заданное число!");
            return;
        }

        switch (selected){
            case "a (сторона)":
                double a0 = Float.valueOf(editText.getText().toString());
                double S = Math.pow(a0, 2);
                double P = a0 * 4;
                double d = Math.sqrt(2) * a0;
                double r = a0 / 2;
                double R = a0 / Math.sqrt(2);

                tv1.setText("" + "Площадь квадрата: " + S);
                tv2.setText("" + "Периметр квадрата: " + P);
                tv3.setText("" + "Диагональ квадрата: " + d);
                tv4.setText("" + "Радиус вписанной окружности: " + r);
                tv5.setText("" + "Радиус описанной окружности: " + R);
                break;

            case "S (площадь)":
                double S0 = Float.valueOf(editText.getText().toString());
                double a = Math.sqrt(S0);
                double P2 = a * 4;
                double d2 = Math.sqrt(2) * a;
                double r2 = a / 2;
                double R2 = a / Math.sqrt(2);

                tv1.setText("" + "Сторона квадрата: " + a);
                tv2.setText("" + "Периметр квадрата: " + P2);
                tv3.setText("" + "Диагональ квадрата: " + d2);
                tv4.setText("" + "Радиус вписанной окружности: " + r2);
                tv5.setText("" + "Радиус описанной окружности: " + R2);
                break;

            case "d (диагональ)":
                double d0 = Float.valueOf(editText.getText().toString());
                double a3 = d0 / Math.sqrt(2);
                double S3 = a3 * a3;
                double P3 = a3 * 4;
                double r3 = a3 / 2;
                double R3 = a3 / Math.sqrt(2);

                tv1.setText("" + "Сторона квадрата: " + a3);
                tv2.setText("" + "Площадь квадрата: " + S3);
                tv3.setText("" + "Периметр квадрата: " + P3);
                tv4.setText("" + "Радиус вписанной окружности: " + r3);
                tv5.setText("" + "Радиус описанной окружности: " + R3);
                break;

            case "P (периметр)":
                double P0 = Float.valueOf(editText.getText().toString());
                double a4 = P0 / 4;
                double S4 = a4 * a4;
                double d4 = Math.sqrt(2) * a4;
                double r4 = a4 / 2;
                double R4 = a4 / Math.sqrt(2);

                tv1.setText("" + "Сторона квадрата: " + a4);
                tv2.setText("" + "Площадь квадрата: " + S4);
                tv3.setText("" + "Диагональ квадрата: " + d4);
                tv4.setText("" + "Радиус вписанной окружности: " + r4);
                tv5.setText("" + "Радиус описанной окружности: " + R4);
                break;

            case "r (радиус вписанной окружности)":
                double r0 = Float.valueOf(editText.getText().toString());
                double a5 = r0 * 2;
                double S5 = a5 * a5;
                double d5 = Math.sqrt(2) * a5;
                double P5 = a5 * 4;
                double R5 = a5 / Math.sqrt(2);

                tv1.setText("" + "Сторона квадрата: " + a5);
                tv2.setText("" + "Площадь квадрата: " + S5);
                tv3.setText("" + "Диагональ квадрата: " + d5);
                tv4.setText("" + "Периметр квадрата : " + P5);
                tv5.setText("" + "Радиус описанной окружности: " + R5);
                break;

            case "R (радиус описанной окружности)":
                double R0 = Float.valueOf(editText.getText().toString());
                double d6 = 2 * R0;
                double a6 = d6 / Math.sqrt(2);
                double S6 = a6 * a6;
                double P6 = a6 * 4;
                double r6 = a6 / 2;

                tv1.setText("" + "Сторона квадрата: " + a6);
                tv2.setText("" + "Площадь квадрата: " + S6);
                tv3.setText("" + "Диагональ квадрата: " + d6);
                tv4.setText("" + "Периметр квадрата : " + P6);
                tv5.setText("" + "Радиус вписанной окружности: " + r6);
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

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}


