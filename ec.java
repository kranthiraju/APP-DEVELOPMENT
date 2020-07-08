package com.example.studybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ec extends AppCompatActivity {
    PDFView ec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec);
        ec=(PDFView)findViewById(R.id.pdfec);
        ec.fromAsset("EC.pdf").load();
    }
}