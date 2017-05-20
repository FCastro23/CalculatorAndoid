package com.example.integraphicdesigns.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Locale;
import java.text.*;

public class MainActivity extends AppCompatActivity {

    Button Btn0;
    Button Btn1;
    Button Btn2;
    Button Btn3;
    Button Btn4;
    Button Btn5;
    Button Btn6;
    Button Btn7;
    Button Btn8;
    Button Btn9;
    Button Result;
    Button Addition;
    Button Subtraccion;
    Button Multiplication;
    Button Division;
    Button Clear;
    EditText Text;
    Button Point;
    double Cant=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Instancias
        Text = (EditText) findViewById(R.id.text);
        Clear = (Button) findViewById(R.id.clear);
        Addition= (Button) findViewById(R.id.addition);
        Subtraccion=(Button) findViewById(R.id.subtraccion);
        Division=(Button) findViewById(R.id.divition);
        Multiplication= (Button) findViewById(R.id.multiplication);
        Point=(Button) findViewById(R.id.point);
        Result=(Button) findViewById(R.id.result);
        Btn0 = (Button) findViewById(R.id.btn0);
        Btn1 = (Button) findViewById(R.id.btn1);
        Btn2 = (Button) findViewById(R.id.btn2);
        Btn3 = (Button) findViewById(R.id.btn3);
        Btn4 = (Button) findViewById(R.id.btn4);
        Btn5 = (Button) findViewById(R.id.btn5);
        Btn6 = (Button) findViewById(R.id.btn6);
        Btn7 = (Button) findViewById(R.id.btn7);
        Btn8 = (Button) findViewById(R.id.btn8);
        Btn9 = (Button) findViewById(R.id.btn9);

//        Values
        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "0");
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "1");
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "2");
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "3");
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "4");
            }
        });

        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "5");
            }
        });

        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "6");
            }
        });

        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "7");
            }
        });

        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "8");
            }
        });

        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText(Text.getText() + "9");
            }
        });

//        Addition

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inputValue=Double.parseDouble(Text.getText().toString());
                if (Text.getText().toString()==""){
                    Cant=Cant + inputValue;
                }else{
                    Text.setText("");
                    Cant = Cant + inputValue;
                }

                Text.setText(Double.toString(Cant));
            }
        });

//        Subtraccion

        Subtraccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inputValue=Double.parseDouble(Text.getText().toString());
                if (Text.getText().toString()==""){
                    Cant=Cant - inputValue;
                }else{
                    Text.setText("");
                    Cant = Cant - inputValue;
                }

                Text.setText(Double.toString(Cant));
            }
        });

//        Multiplication

        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inputValue=Double.parseDouble(Text.getText().toString());
                if (Text.getText().toString()==""){
                    Cant=Cant * inputValue;
                }else{
                    Text.setText("");
                    Cant = Cant * inputValue;
                }

                Text.setText(Double.toString(Cant));
            }
        });

//        Division

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inputValue=Double.parseDouble(Text.getText().toString());
                if (Text.getText().toString()==""){
                    Cant=Cant / inputValue;
                }else{
                    Text.setText("");
                    Cant = Cant / inputValue;
                }

                Text.setText(Double.toString(Cant));
            }
        });

//        Result

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText("");
                Text.setText(Double.toString(Cant));
                Cant=0;
            }
        });

//        Clear

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text.setText("");
                Cant=0;
            }
        });

//        Point.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (Text.getText().toString().indexOf(".")==-1){
//                    Text.setText(Text.getText()+".");
//                }
//
//            }
//        });


    }

}
