package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    RadioGroup unit;
    EditText value;
    int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runLogin(View view) {

        DecimalFormat nf = new DecimalFormat("0.00");
        float f;
        EditText temp =(EditText) findViewById(R.id.value);
        double Temperature = Double.parseDouble(temp.getText().toString());

        TextView textView3 = findViewById(R.id.textView3);


        if(x == 0){
            Temperature = ((9 * Temperature) / 5) + 32;
            TextView result = (TextView)findViewById(R.id.value);
            result.setText(nf.format(Temperature));
            textView3.setText("華氏溫度");

            x = 1;
        }

        else if(x == 1){
            Temperature = ((Temperature - 32) * 5) / 9 ;
            TextView result = (TextView)findViewById(R.id.value);
            result.setText(nf.format(Temperature));
            textView3.setText("攝氏溫度");
            x = 0;
        }





    }
}