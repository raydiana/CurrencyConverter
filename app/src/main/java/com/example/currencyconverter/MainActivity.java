package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void ClickFunction(View view){
        EditText amount=findViewById(R.id.amount);
        String convert=amount.getText().toString();
        double convertDouble= Double.parseDouble(convert);
        double convertToDollar=convertDouble*1.32;
        String dollarRound=String.format("%.2f", convertToDollar);
        Toast.makeText(this, dollarRound, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}