package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText heightEditText;
    private EditText weightEditText;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heightEditText = findViewById(R.id.editTextNumber);
        weightEditText = findViewById(R.id.editTextNumber2);
        calculateButton = findViewById(R.id.button2);
        resultTextView = findViewById(R.id.textView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightString = heightEditText.getText().toString();
                String weightString = weightEditText.getText().toString();

                double height = Double.parseDouble(heightString);
                double weight = Double.parseDouble(weightString);

                double bmi = weight / (height / 100) * (height / 100);
                resultTextView.setText("Your BMI is " + bmi);
            }
        });
    }
}