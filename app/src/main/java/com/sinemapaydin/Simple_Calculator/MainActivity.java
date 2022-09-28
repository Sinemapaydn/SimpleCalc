package com.sinemapaydin.Simple_Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.sinemapaydin.methodsandclasses.R;


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

    public void summation(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Enter number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result);
        }



    }
    public void extraction(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Enter number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);
        }

    }
    public void multiply(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Enter number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result);
        }

    }
    public void division(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Enter number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 /  number2;

            resultText.setText("Result: " + result);
        }

    }
}