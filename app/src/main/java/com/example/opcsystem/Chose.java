package com.example.opcsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chose extends AppCompatActivity {
Button btnCalc;
Button btnRecept;
Button btnListDay;
Button btnListNight;
Button btnScript;

    Button btnCalctxt;
    Button btnRecepttxt;
    Button btnListDaytxt;
    Button btnListNighttxt;
    Button btnScripttxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);
        btnCalc = (Button)findViewById(R.id.btnCalc);
        btnRecept = (Button)findViewById(R.id.btnRecept);
        btnListDay = (Button)findViewById(R.id.btnListDay);
        btnListNight = (Button)findViewById(R.id.btnListNight);
        btnScript = (Button)findViewById(R.id.btnScript);

        btnCalctxt = (Button)findViewById(R.id.btnCalctxt);
        btnRecepttxt = (Button)findViewById(R.id.btnRecepttxt);
        btnListDaytxt = (Button)findViewById(R.id.btnListDaytxt);
        btnListNighttxt = (Button)findViewById(R.id.btnListNighttxt);
        btnScripttxt = (Button)findViewById(R.id.btnScripttxt);





        View.OnClickListener onclickCalc = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Chose.this, Calc.class);
                startActivity(act);
            }
        };
        btnCalc.setOnClickListener(onclickCalc);
        btnCalctxt.setOnClickListener(onclickCalc);

        View.OnClickListener onclickRecept = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Chose.this, Recept.class);
                startActivity(act);
            }
        };
        btnRecept.setOnClickListener(onclickRecept);
        btnRecepttxt.setOnClickListener(onclickRecept);

        View.OnClickListener onclickListDay = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Chose.this, ListDay.class);
                startActivity(act);
            }
        };
        btnListDay.setOnClickListener(onclickListDay);
        btnListDaytxt.setOnClickListener(onclickListDay);

        View.OnClickListener onclickLisnNight = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Chose.this, ListNight.class);
                startActivity(act);
            }
        };
        btnListNight.setOnClickListener(onclickLisnNight);
        btnListNighttxt.setOnClickListener(onclickLisnNight);

        View.OnClickListener onclickScript = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Chose.this, Script.class);
                startActivity(act);
            }
        };
        btnScript.setOnClickListener(onclickScript);
        btnScripttxt.setOnClickListener(onclickScript);


    }
}