package com.example.opcsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListNight extends AppCompatActivity {

    Button btnBackToList5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_night);
        btnBackToList5 = (Button) findViewById(R.id.btnBackToList5);
        View.OnClickListener CLickToList = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(ListNight.this, Chose.class);
                startActivity(act);
            }
        };
        btnBackToList5.setOnClickListener(CLickToList);
    }
}