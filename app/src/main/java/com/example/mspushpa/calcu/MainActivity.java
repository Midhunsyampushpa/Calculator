package com.example.mspushpa.calcu;

import android.content.pm.ProviderInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button clear;
    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private Button equal;
    private TextView info;
    private TextView result;
    private final char ADDITION='+';
    private final char SUBSTRACTION='-';
    private final char DIVISION='/';
    private final char EQU='0';
    private final char MULTIPLICATION='*';
    private double val1=Double.NaN;
    private double val2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"9");
            }
        });




    }
    }


    private void setUpView(){
        zero=(Button)findViewById(R.id.btn0);
        one=(Button)findViewById(R.id.btn1);
        two=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five=(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        eight=(Button)findViewById(R.id.btn8);
        nine=(Button)findViewById(R.id.btn9);
        clear=(Button)findViewById(R.id.btnclear);
        add=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        div=(Button)findViewById(R.id.btndiv);
        mul=(Button)findViewById(R.id.btnmul);
        info=(TextView)findViewById(R.id.tvcontrol);
        result=(TextView)findViewById(R.id.tvresult);


    }






}
