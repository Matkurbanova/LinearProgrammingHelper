package com.bermet.ex.helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheoryActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private  Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        button1 = (Button) findViewById(R.id.theoSimplex);
        button2 = (Button) findViewById(R.id.theoDual);
        button = (Button) findViewById(R.id.theoLinear);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheoActivity();


            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheo2Activity();


            }


        });

    button.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        openlinearActivity();


    }


    });}

    public void openlinearActivity() {
        Intent intent = new Intent(this, linearActivity.class);
        startActivity(intent);


    }




    public void openTheoActivity() {
        Intent intent = new Intent(this, TheoActivity.class);
        startActivity(intent);


    }
    public void openTheo2Activity() {
        Intent intent = new Intent(this, Theo2Activity.class);
        startActivity(intent);


    }}
