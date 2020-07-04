package com.example.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bh extends AppCompatActivity {

    PDFView bh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bh);
        bh=(PDFView)findViewById(R.id.pdfbh);
        bh.fromAsset("Binary Heaps.pdf").load();
    }
}