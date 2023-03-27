package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText number1, number2;
    private   TextView result;
    private Button add , sub, mul, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.editTextNumber);
        number2 =(EditText)  findViewById(R.id.editTextNumber2);
        result = (TextView) findViewById(R.id.textView4);

        add = (Button) findViewById(R.id.button);
        sub =(Button)  findViewById(R.id.button2);
        mul =(Button)  findViewById(R.id.button3);
        div = (Button) findViewById(R.id.button4);



           add.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View view) {
                   String num1=  number1.getText().toString();
                   String num2=  number2.getText().toString();


                   double number1 = Double.parseDouble(num1);
                   double number2 = Double.parseDouble(num2);
                   double ans = number1 + number2;
                   result.setText(""+ans);
               }
           });
           sub.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   String num1=  number1.getText().toString();
                   String num2=  number2.getText().toString();


                   double number1 = Double.parseDouble(num1);
                   double number2 = Double.parseDouble(num2);
                   double ans = number1 - number2;
                   result.setText(""+ans);
               }
           });
           mul.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   String num1=  number1.getText().toString();
                   String num2=  number2.getText().toString();


                   double number1 = Double.parseDouble(num1);
                   double number2 = Double.parseDouble(num2);
                   double ans = number1 * number2;
                   result.setText(""+ans);
               }
           });
           div.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   String num1=  number1.getText().toString();
                   String num2=  number2.getText().toString();


                   double number1 = Double.parseDouble(num1);
                   double number2 = Double.parseDouble(num2);
                   double ans =( number1 / number2);
                   result.setText(""+ans);
               }
           });

    }
}