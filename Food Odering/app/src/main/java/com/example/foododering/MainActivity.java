package com.example.foododering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view){

        String str = "你點選的是..." + "\n";

        CheckBox pizza = (CheckBox)findViewById(R.id.checkBox);

        if(pizza.isChecked())
            str += pizza.getText() + "\n";

        CheckBox chicken = (CheckBox)findViewById(R.id.checkBox2);

        if(chicken.isChecked())
            str += chicken.getText() + "\n";

        CheckBox hamburger = (CheckBox)findViewById(R.id.checkBox3);

        if(hamburger.isChecked())
            str += hamburger.getText() + "\n";

        CheckBox coke = (CheckBox)findViewById(R.id.checkBox4);

        if(coke.isChecked())
            str += coke.getText() + "\n";

        CheckBox sprite = (CheckBox)findViewById(R.id.checkBox5);

        if(sprite.isChecked())
            str += sprite.getText() + "\n";

        CheckBox coffee = (CheckBox)findViewById(R.id.checkBox6);

        if(coffee.isChecked())
            str += coffee.getText() + "\n";

        TextView output = (TextView) findViewById(R.id.lblOutput);
        output.setText(str);

    }
}
