package com.example.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_btnbt;
    Button btn_btnbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_btnbt=(Button)findViewById(R.id.btnbt);
        btn_btnbh=(Button)findViewById(R.id.btnbh);
        btn_btnbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,bt.class);
                startActivity(i);
            }
        });
        btn_btnbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity.this,bh.class);
                startActivity(i2);
            }
        });
    }
}