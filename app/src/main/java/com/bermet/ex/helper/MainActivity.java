package com.bermet.ex.helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.Calculator);
        button3 = (Button) findViewById(R.id.theoryButton);
        button4 = (Button) findViewById(R.id.exerciseButton);
        button5 = (Button) findViewById(R.id.quizButton);
        button6 = (Button) findViewById(R.id.glossaryButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalculatorActivity();


            }




        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheoryActivity();


            }




        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseActivity();


            }




        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();


            }




        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGlossaryActivity();


            }




        });
    }
    public void openGlossaryActivity(){
        Intent intent = new Intent(this, GlossaryActivity.class);
        startActivity(intent);
    }

    public void openTheoryActivity(){
        Intent intent = new Intent(this, TheoryActivity.class);
        startActivity(intent);
}
    public void openExerciseActivity(){
        Intent intent = new Intent(this, ExerciseActivity.class);
        startActivity(intent);}
    public void openQuizActivity(){
        Intent intent = new Intent(this, StartingScreenActivity.class);
        startActivity(intent);}
    public void openCalculatorActivity(){
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);}}




