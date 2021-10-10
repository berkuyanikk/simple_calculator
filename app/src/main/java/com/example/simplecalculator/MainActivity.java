package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;
            resultText.setText("Sonuç: " + result);
        }


    }

    public void sub(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;
            resultText.setText("Sonuç: " + result);
        }

    }

    public void multiply(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;
            resultText.setText("Sonuç: " + result);
        }

    }

    public void divide(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else if (Integer.parseInt(number2Text.getText().toString()) == 0) {
            resultText.setText("HATA!");

        } else {
            Float number1 = Float.parseFloat(number1Text.getText().toString());
            Float number2 = Float.parseFloat(number2Text.getText().toString());

            Float result= (number1/number2);
            resultText.setText("Sonuç: "+result);

        }

    }


}