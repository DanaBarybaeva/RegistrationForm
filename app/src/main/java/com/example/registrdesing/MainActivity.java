package com.example.registrdesing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText number1, number2;
    Button btnPlus;
    Button btnMinus;
    Button btnMulti;
    Button btnDivide;
    TextView getResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.edit_firstnum);
        number2 = findViewById(R.id.edit_scndnum);

        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMulti = findViewById(R.id.btn_mult);
        btnDivide = findViewById(R.id.btn_div);

        getResults = findViewById(R.id.textView);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMulti.setOnClickListener(this);


    }
    public void onClick(View view){
        int res = 0;

        if(view.getId() == R.id.btn_plus){
            res = Integer.parseInt(number1.getText().toString())
                    + Integer.parseInt(number2.getText().toString());
        }
        else if(view.getId() == R.id.btn_minus){
            res = Integer.parseInt(number1.getText().toString())
                    - Integer.parseInt(number2.getText().toString());
        }
        else if(view.getId() == R.id.btn_mult){
            res = Integer.parseInt(number1.getText().toString())
                    * Integer.parseInt(number2.getText().toString());
        }
        else{
            res = Integer.parseInt(number1.getText().toString())
                    / Integer.parseInt(number2.getText().toString());

        }





        getResults.setText("Result: " + res);
    }
}