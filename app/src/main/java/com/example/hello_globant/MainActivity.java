package com.example.hello_globant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.etxtNum1);
        num2 = findViewById(R.id.etxtNum2);
        tv1 = findViewById(R.id.textView2);
    }
    public void calcular(View view){
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());
        int suma = valor1 + valor2;
        tv1.setText("La suma es: " + suma);


    }
}