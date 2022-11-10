package com.example.opcsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListDay extends AppCompatActivity {

    Button btnBackToList4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_day);
        btnBackToList4 = (Button) findViewById(R.id.btnBackToList4);
        View.OnClickListener CLickToList = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(ListDay.this, Chose.class);
                startActivity(act);
            }
        };
        btnBackToList4.setOnClickListener(CLickToList);
    }
}