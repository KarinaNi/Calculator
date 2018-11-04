package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3,
            buttonAdd, buttonSub, buttonC, buttonEqual;  //comment out button add sub c and equal
    EditText text;
    float valueOne, valueTwo;
    boolean addition, subtraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        text = (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }
        });
        //comment out add
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text == null){
                    text.setText("");
                } else{
                    valueOne = Float.parseFloat(text.getText() + "");
                    addition = true;
                    text.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View v){
              valueOne = Float.parseFloat(text.getText() + "");
              subtraction = true;
              text.setText(null);
          }
        });

        //Comment out equals
        buttonEqual.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            valueTwo = Float.parseFloat(text.getText() + "");
            if(addition == true){
                text.setText(valueOne + valueTwo + "");
                addition = false;
            }

            if(subtraction == true){
                text.setText(valueOne - valueTwo + "");
                subtraction = false;
            }
        }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });

    }
    }
