package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private int result = 0;
    private TextView resultOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        resultOutput = findViewById(R.id.result);
    }

    public void sum(View view) {

        result = Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString());

        resultOutput.setText(Integer.toString(result));
    }

    public void subtract(View view) {

        result = Integer.parseInt(firstNumber.getText().toString()) - Integer.parseInt(secondNumber.getText().toString());

        resultOutput.setText(Integer.toString(result));
    }

    public void multiply(View view) {

        result = Integer.parseInt(firstNumber.getText().toString()) * Integer.parseInt(secondNumber.getText().toString());

        resultOutput.setText(Integer.toString(result));
    }

    public void divide(View view) {

        result = Integer.parseInt(firstNumber.getText().toString()) / Integer.parseInt(secondNumber.getText().toString());

        resultOutput.setText(Integer.toString(result));
    }
}