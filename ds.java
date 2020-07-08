package com.example.studybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ds extends AppCompatActivity {
    PDFView ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);
        ds=(PDFView)findViewById(R.id.pdfds);
        ds.fromAsset("Introduction to DS.pdf").load();
    }
}