package com.bermet.ex.helper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Quiz2Activity extends AppCompatActivity {
    Button button2,button3,button4,button5;

    ImageView iv_question;
    List<QuizItem> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);


        iv_question=(ImageView) findViewById(R.id.iv_question);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        list= new ArrayList<>();
        for(int i = 0; i< new Database().answers.length; i++){
            list.add(new QuizItem(new Database().answers[i], new Database().question[i]));
        }
        Collections.shuffle(list);
        final int[] turn = {1};
        newQuestion(turn[0]);
        button2.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   if(button2.getText().toString().equalsIgnoreCase(list.get(turn[0] - 1).getName())) {
                       Toast.makeText(Quiz2Activity.this, "Correct!", Toast.LENGTH_SHORT).show();
                       if(turn[0] <list.size()) {
                           turn[0]++;
                           newQuestion(turn[0]);
                       }else {
                           Toast.makeText(Quiz2Activity.this, "You finished the quiz!", Toast.LENGTH_SHORT).show();
                           finish();
                       }
                       }else{
                Toast.makeText(Quiz2Activity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                   }
            }
               });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(button3.getText().toString().equalsIgnoreCase(list.get(turn[0] - 1).getName())) {
                    Toast.makeText(Quiz2Activity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    if(turn[0] <list.size()) {
                        turn[0]++;
                        newQuestion(turn[0]);

                    }else {
                        Toast.makeText(Quiz2Activity.this, "You finished the quiz!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }else{
                    Toast.makeText(Quiz2Activity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
            }
            });

        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(button4.getText().toString().equalsIgnoreCase(list.get(turn[0] - 1).getName())) {
                    Toast.makeText(Quiz2Activity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    if(turn[0] <list.size()) {
                        turn[0]++;
                        newQuestion(turn[0]);

                    }else {
                        Toast.makeText(Quiz2Activity.this, "You finished the quiz!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }else{
                    Toast.makeText(Quiz2Activity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
            }


        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(button5.getText().toString().equalsIgnoreCase(list.get(turn[0] - 1).getName())) {
                    Toast.makeText(Quiz2Activity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    if(turn[0] <list.size()) {
                        turn[0]++;
                        newQuestion(turn[0]);

                    }else {
                        Toast.makeText(Quiz2Activity.this, "You finished the quiz!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }else{
                    Toast.makeText(Quiz2Activity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }


    }


        });


    }
    private void  newQuestion(int number){
        iv_question.setImageResource(list.get(number-1).getImage());



}



    }

