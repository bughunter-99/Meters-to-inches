package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    * 1m = 39.3701in
    */

    private Button convertButton;
    private TextView result;
    private EditText metersEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertButton = (Button) findViewById(R.id.covertId);
        result = (TextView) findViewById(R.id.resultId);
        metersEditText = (EditText) findViewById(R.id.metersEditText);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplyer = 39.3701;
                double resultInches = 0.0;

                if(metersEditText.getText().toString().isEmpty()){
                    result.setText(R.string.error_message);
                    result.setTextColor(Color.RED);
                }
                else{
                    double meterValue = Double.parseDouble(metersEditText.getText().toString());
                    resultInches = multiplyer*meterValue;
                    result.setText(String.format("%.2f",resultInches)+" Inches");
                    result.setTextColor(Color.GRAY);
                }

            }
        });
    }
}