package com.example.tacademy.homework_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (TextView)findViewById(R.id.txt_result);


        btn = (Button) findViewById(R.id.btn_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("1");
            }
        });


        btn = (Button) findViewById(R.id.btn_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("2");
            }
        });

        btn = (Button) findViewById(R.id.btn_3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("3");
            }
        });

        btn = (Button) findViewById(R.id.btn_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("4");
            }
        });

        btn = (Button) findViewById(R.id.btn_5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("5");
            }
        });

        btn = (Button) findViewById(R.id.btn_6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("6");
            }
        });

        btn = (Button) findViewById(R.id.btn_7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("7");
            }
        });

        btn = (Button) findViewById(R.id.btn_8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("8");
            }
        });

        btn = (Button) findViewById(R.id.btn_9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("9");
            }
        });

        btn = (Button) findViewById(R.id.btn_0);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("0");
            }
        });

        btn = (Button) findViewById(R.id.btn_e);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("=");
            }
        });

        btn = (Button) findViewById(R.id.btn_p);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("+");
            }
        });

        btn = (Button) findViewById(R.id.btn_m);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("-");
            }
        });

        btn = (Button) findViewById(R.id.btn_g);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("*");
            }
        });

        btn = (Button) findViewById(R.id.btn_C);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText("");
            }
        });
    }

}
