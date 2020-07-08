package com.example.studybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class py extends AppCompatActivity {
    PDFView py;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_py);
        py=(PDFView)findViewById(R.id.pdfpy);
        py.fromAsset("Robert A. Baron, Michael J. Kalsher-Psychology, 4th Edition-Allyn & Bacon (1997).pdf").load();
    }
}