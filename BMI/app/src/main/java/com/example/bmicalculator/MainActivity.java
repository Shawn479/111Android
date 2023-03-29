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

    private Button clearButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heightEditText = findViewById(R.id.editTextNumber);
        weightEditText = findViewById(R.id.editTextNumber2);
        calculateButton = findViewById(R.id.button2);
        resultTextView = findViewById(R.id.textView);
        clearButton = findViewById(R.id.button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightString = heightEditText.getText().toString();
                String weightString = weightEditText.getText().toString();

                double height = Double.parseDouble(heightString);
                double weight = Double.parseDouble(weightString);

                double bmi = weight / ((height / 100) * (height / 100));
                String bmiString = String.format("%.2f", bmi);
                resultTextView.setText("Your BMI is " + bmiString);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heightEditText.setText("");
                weightEditText.setText("");
                resultTextView.setText("");
            }
        });
    }
}