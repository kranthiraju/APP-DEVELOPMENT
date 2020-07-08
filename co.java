package com.example.studybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class co extends AppCompatActivity {
    PDFView co;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co);
        co=(PDFView)findViewById(R.id.pdfco);
        co.fromAsset("Lecture1_1jan2020.pdf").load();
    }
}