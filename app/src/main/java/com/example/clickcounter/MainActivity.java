package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonplus;
    private Button buttonminus;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                textView.setText(String.valueOf(counter));
                szinez();
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                textView.setText(String.valueOf(counter));
                szinez();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                textView.setText(String.valueOf(counter));
                szinez();
            }
        });

    }
    private void szinez(){
        if (counter > 0){
            textView.setTextColor(Color.rgb(0,255,0));
        }
        else if(counter < 0){
            textView.setTextColor(Color.rgb(255,0,0));
        }
        else{
            textView.setTextColor(Color.rgb(0,0,255));
        }
    }
    private void init(){
        textView = findViewById(R.id.textView);
        buttonplus = findViewById(R.id.button1);
        buttonminus = findViewById(R.id.button2);
    }
}