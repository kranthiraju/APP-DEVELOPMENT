package com.example.studybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class gl extends AppCompatActivity {
    PDFView gl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl);
        gl=(PDFView)findViewById(R.id.pdfgl);
        gl.fromAsset("2019BCS0116(IMA121 ASSIGNMENT-11).pdf").load();
    }
}