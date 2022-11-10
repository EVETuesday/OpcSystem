package com.example.opcsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Script extends AppCompatActivity {

    Button btnBackToList6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script);
        btnBackToList6 = (Button) findViewById(R.id.btnBackToList6);
        View.OnClickListener CLickToList = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Script.this, Chose.class);
                startActivity(act);
            }
        };
        btnBackToList6.setOnClickListener(CLickToList);
    }
}