package com.example.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bt extends AppCompatActivity {

    PDFView bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt);
        bt=(PDFView)findViewById(R.id.pdfbt);
        bt.fromAsset("Binary Search Tree.pdf").load();
    }
}