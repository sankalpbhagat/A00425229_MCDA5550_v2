package com.example.sanka.proj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    public void calculate(View view){
    // get height

        EditText height = (EditText) findViewById(R.id.textHeight);
        String value = height.getText().toString();
        Double heightVal =  Double.parseDouble(value);
        System.out.println("Here is the height "+ heightVal);

     // Get Weight

        EditText weight = (EditText) findViewById(R.id.textWeight);
        String value2 = weight.getText().toString();
        Double weightVal =  Double.parseDouble(value2);
        System.out.println("Here is the Weight "+ weightVal);



     Double calc = (weightVal)/(heightVal * heightVal)   ;
     EditText result = (EditText) findViewById((R.id.resultText));

        result.setText(calc.toString());




    }
}
