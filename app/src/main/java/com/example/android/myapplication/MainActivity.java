package com.example.android.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buyCoffee(View view){
        numberOfCoffees++;
        display(numberOfCoffees);
    }

    public void display(int number){
        TextView numberOfCoffees_textview = findViewById(R.id.numberOfCoffees_textview);
        numberOfCoffees_textview.setText(""+number);
    }

}
