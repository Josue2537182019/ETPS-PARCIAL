package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {


    EditText pese;
    EditText alte;
    TextView reste;
    Button calcb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        pese = findViewById(R.id.epeso);
        alte = findViewById(R.id.ealtura);
        reste = findViewById(R.id.tresss);

        calcb = findViewById(R.id.bcalc);
        calcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso = Double.parseDouble(pese.getText().toString());
                double altura = Double.parseDouble(alte.getText().toString());
                double imc = calcularIMC(peso, altura);
                String categoria = getCategoria(imc);
                reste.setText("Tu IMC es " + imc + ", lo que indica que tienes " + categoria + ".");
            }
        });
    }

    private double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    private String getCategoria(double imc) {
        if (imc < 10.5) {
            return "críticamente bajo de peso";
        } else if (imc < 15.9) {
            return "severamente bajo de peso";
        } else if (imc < 18.5) {
            return "bajo de peso";
        } else if (imc < 25) {
            return "con un peso saludable";
        } else if (imc < 30) {
            return "con sobrepeso";
        } else if (imc < 35) {
            return "con obesidad clase 1 - moderadamente obeso";
        } else if (imc < 40) {
            return "con obesidad clase 2 - severamente obeso";
        } else {
            return "con obesidad clase 3 - críticamente obeso";
        }
    }

}