package com.example.studybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class fl extends AppCompatActivity {
    PDFView fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fl);
        fl=(PDFView)findViewById(R.id.pdffl);
        fl.fromAsset("Real Analysis by Bartle and Sherbert.pdf").load();
    }
}