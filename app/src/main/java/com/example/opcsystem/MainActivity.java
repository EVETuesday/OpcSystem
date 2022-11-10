package com.example.opcsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnNext1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext1 = (Button) findViewById(R.id.btnNext1);
        View.OnClickListener clickBtnNext1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sd = new Intent(MainActivity.this, Chose.class);
                startActivity(sd);
            }
        };
        btnNext1.setOnClickListener(clickBtnNext1);

    }
}