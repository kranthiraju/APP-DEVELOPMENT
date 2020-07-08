package com.example.studybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button btnds;
    Button btnco;
    Button btnit;
    Button btnca;
    Button btnec;
    Button btnpy;
    Button btngl;
    Button btnfl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnds=(Button)findViewById(R.id.ds);
        btnco=(Button)findViewById(R.id.co);
        btnit=(Button)findViewById(R.id.it);
        btnca=(Button)findViewById(R.id.ca);
        btnec=(Button)findViewById(R.id.ec);
        btnpy=(Button)findViewById(R.id.py);
        btngl=(Button)findViewById(R.id.gl);
        btnfl=(Button)findViewById(R.id.fl);
        btnds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(home.this,ds.class);
                startActivity(i1);
            }
        });
        btnco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(home.this,co.class);
                startActivity(i2);
            }
        });
        btnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(home.this,it.class);
                startActivity(i3);
            }
        });
        btnca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(home.this,ec.class);
                startActivity(i4);
            }
        });
        btnec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(home.this,ec.class);
                startActivity(i5);
            }
        });
        btnpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(home.this,py.class);
                startActivity(i6);
            }
        });
        btngl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(home.this,gl.class);
                startActivity(i7);
            }
        });
        btnfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8=new Intent(home.this,fl.class);
                startActivity(i8);
            }
        });
    }
}