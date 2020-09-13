package com.example.appvoufolgar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void SetResultado(View view) {

        EditText txtAltura = findViewById(R.id.editTextAltura);
        EditText txtPeso = findViewById(R.id.editTextPeso);

        float setAltura = Float.valueOf(txtAltura.getText().toString());
        float floatAltura = setAltura / 100;
        int setPeso = Integer.valueOf(txtPeso.getText().toString());

        String situacao = "";
        float resultImc = setPeso / (floatAltura*floatAltura);


        if (resultImc < 16){
            situacao = "Subpeso Severo";
        }
        else if (resultImc >= 16 && resultImc <= 19.9){
            situacao = "Subpeso";
        }
        else if (resultImc >= 20 && resultImc <= 24.9){
            situacao = "Normal";
        }
        else if (resultImc >= 25 && resultImc <= 24.9){
            situacao = "Sobrepeso";
        }
        else if (resultImc >= 30 && resultImc <= 39.9){
            situacao = "Obeso";
        }
        else if (resultImc >= 40){
            situacao = "Obeso Mórbio";
        }


        TextView textResultado = (TextView) findViewById(R.id.textViewResultado);
        textResultado.setText(String.valueOf("Situação: "+ situacao ));
    }
}