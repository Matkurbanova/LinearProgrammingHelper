package com.bermet.ex.helper;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;


import com.github.barteksc.pdfviewer.PDFView;

public class ExerciseActivity extends AppCompatActivity {

    PDFView pdfviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theo2);
        pdfviewer = (PDFView) findViewById(R.id.pdfviewer);
        pdfviewer.fromAsset("ExercisesOfApplication.pdf").load();
    }
}