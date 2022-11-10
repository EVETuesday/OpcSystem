package com.example.opcsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class Recept extends AppCompatActivity {

    Button btnWinter;
    Button btnSpring;
    Button btnSummer;
    Button btnAutumn;
    Button btnToList;

    ScrollView svWinter;
    ScrollView svSpring;
    ScrollView svSummer;
    ScrollView svAutumn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recept);
        btnWinter =(Button)findViewById(R.id.btnWinter);
        btnSpring =(Button)findViewById(R.id.btnSpring);
        btnSummer =(Button)findViewById(R.id.btnSummer);
        btnAutumn =(Button)findViewById(R.id.btnAutumn);
        btnToList =(Button)findViewById(R.id.btnBackToList3);

        svWinter=(ScrollView)findViewById(R.id.svWinter);
        svSpring=(ScrollView)findViewById(R.id.svSpring);
        svSummer=(ScrollView)findViewById(R.id.svSummer);
        svAutumn=(ScrollView)findViewById(R.id.svAutumn);

        View.OnClickListener ClickbtnWinter = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svWinter.setVisibility(View.VISIBLE);
                svSpring.setVisibility(View.INVISIBLE);
                svSummer.setVisibility(View.INVISIBLE);
                svAutumn.setVisibility(View.INVISIBLE);
            }
        };
        View.OnClickListener ClickbtnSpring = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svWinter.setVisibility(View.INVISIBLE);
                svSpring.setVisibility(View.VISIBLE);
                svSummer.setVisibility(View.INVISIBLE);
                svAutumn.setVisibility(View.INVISIBLE);
            }
        };
        View.OnClickListener ClickbtnSummer = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svWinter.setVisibility(View.INVISIBLE);
                svSpring.setVisibility(View.INVISIBLE);
                svSummer.setVisibility(View.VISIBLE);
                svAutumn.setVisibility(View.INVISIBLE);
            }
        };
        View.OnClickListener ClickbtnAutumn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svWinter.setVisibility(View.INVISIBLE);
                svSpring.setVisibility(View.INVISIBLE);
                svSummer.setVisibility(View.INVISIBLE);
                svAutumn.setVisibility(View.VISIBLE);
            }
        };
        View.OnClickListener CLickToList = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Recept.this, Chose.class);
                startActivity(act);
            }
        };
        btnWinter.setOnClickListener(ClickbtnWinter);
        btnSpring.setOnClickListener(ClickbtnSpring);
        btnSummer.setOnClickListener(ClickbtnSummer);
        btnAutumn.setOnClickListener(ClickbtnAutumn);
        btnToList.setOnClickListener(CLickToList);
    }
}