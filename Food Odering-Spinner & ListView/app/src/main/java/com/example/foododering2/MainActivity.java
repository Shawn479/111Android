package com.example.foododering2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp1, sp2, sp3;
    private String[] desserts;

    private String[] drink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String[] courses = {"美式漢堡", "特選牛排", "牛肉飯", "義大利麵"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> a1 = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, courses);
        sp1.setAdapter(a1);

        desserts = getResources(). getStringArray(R.array.dessert);
        sp2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> a2 = new ArrayAdapter<>( this,
        android.R.layout.simple_spinner_dropdown_item, desserts);
        sp2.setAdapter(a2);

        drink = getResources(). getStringArray(R.array.drink);
        sp3 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<String> a3 = new ArrayAdapter<>( this,
                android.R.layout.simple_spinner_dropdown_item, drink);
        sp3.setAdapter(a3);
    }

    public void button_Click(View view) {

        String main = sp1.getSelectedItem(). toString();
        String dessert = sp2.getSelectedItem(). toString();
        String drink = sp3.getSelectedItem(). toString();
        TextView output = (TextView)findViewById(R.id.textView4);
        output.setText("主餐："+ main + "\n甜甘點："+ dessert + "\n飲料："+ drink);
    }
}