package com.example.studybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class it extends AppCompatActivity {
    PDFView it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        it=(PDFView)findViewById(R.id.pdfit);
        it.fromAsset("edit_1-java Basics.pdf").load();
    }
}