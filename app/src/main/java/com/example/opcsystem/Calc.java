package com.example.opcsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Calc extends AppCompatActivity {

    Button btnMultiplyn;
    Button btnOutCof;
    Button btnbtnBackToListt;
    Button btnbtnBackToListt2;
    Button btnRetCalcc;
    TextView CalcMCofInn;
    TextView CalcTimeInn;
    TextView CalcMDoneCofInn;
    TextView errorr;
    TextView txtOut;
    LinearLayout Llayout;
    LinearLayout Rlayout;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        Llayout =(LinearLayout)findViewById(R.id.linleyCalc);
        Rlayout =(LinearLayout)findViewById(R.id.linleyCalc2);
        CalcMCofInn =(TextView)findViewById(R.id.CalcMCofIn);
        CalcTimeInn =(TextView)findViewById(R.id.CalcTimeIn);
        CalcMDoneCofInn =(TextView)findViewById(R.id.CalcMDoneCofIn);
        errorr=(TextView)findViewById(R.id.error1);
        txtOut=(TextView)findViewById(R.id.txtOutRez);
        btnMultiplyn = (Button)findViewById(R.id.btnMultiply);
        btnOutCof = (Button)findViewById(R.id.btnOutCof);
        btnRetCalcc=(Button)findViewById(R.id.btnRetCalc);
        btnbtnBackToListt=(Button)findViewById(R.id.btnBackToList);
        btnbtnBackToListt2=(Button)findViewById(R.id.btnBackToList2);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        errorr.setText("");
        progressBar.setMax(6);
        progressBar.setMin(0);

        View.OnClickListener CLickbtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (CalcMCofInn.getText().toString().length()>0 && CalcTimeInn.getText().toString().length()>0 && CalcMDoneCofInn.getText().toString().length()>0) {
                    if (Double.parseDouble(CalcMCofInn.getText().toString())>=17 && Double.parseDouble(CalcMCofInn.getText().toString())<=17.5){
                        CalcMCofInn.setTextColor(Color.WHITE);
                        errorr.setText("");
                        if (Double.parseDouble(CalcTimeInn.getText().toString())>=23 && Double.parseDouble(CalcTimeInn.getText().toString())<=28){
                            CalcTimeInn.setTextColor(Color.WHITE);
                            errorr.setText("");
                            Llayout.setVisibility(View.INVISIBLE);
                            Rlayout.setVisibility(View.VISIBLE);
                            progressBar.setVisibility(View.VISIBLE);


                            Double a=Double.parseDouble(CalcMDoneCofInn.getText().toString())/Double.parseDouble(CalcMCofInn.getText().toString());
                            btnOutCof.setText(a.toString().substring(0,4));
                            if (a<1.6){
                                txtOut.setText("Коэфициент слишком мал"+"\n"+"Следует увеличить помол");
                                txtOut.setTextColor(Color.RED);

                                progressBar.setProgress(1);
                            }
                            else if (a>=1.6 && a<1.8){
                                txtOut.setText("Коэфициент слишком мал"+"\n"+"Следует увеличить время экстракции");
                                txtOut.setTextColor(Color.YELLOW);

                                progressBar.setProgress(2);
                            }
                            else if (a>=2.2 && a<2.4){
                                txtOut.setText("Коэфициент слишком велик"+"\n"+"Следует уменьшить время экстракции");
                                txtOut.setTextColor(Color.YELLOW);

                                progressBar.setProgress(4);
                            }
                            else if (a>2.4){
                                txtOut.setText("Коэфициент слишком велик"+"\n"+"Следует уменьшить помол");
                                txtOut.setTextColor(Color.RED);

                                progressBar.setProgress(5);
                            }
                            else {
                                txtOut.setText("Коэфициент идеален");
                                txtOut.setTextColor(Color.GREEN);

                                progressBar.setProgress(3);
                            }
                        }
                        else {
                            CalcTimeInn.setTextColor(Color.RED);
                            errorr.setText("Время экстракции должно быть между 23сек и 28сек");
                        }

                    }
                    else {
                        CalcMCofInn.setTextColor(Color.RED);
                        errorr.setText("Вес свежепомолотого эспрессо должен быть между 17.0mg и 17.5mg");
                    }
                }
                else {
                    errorr.setText("Все поля должны быть заполненными");
                }

            }
        };
        View.OnClickListener CLickRet = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Calc.this, Calc.class);
                startActivity(act);
            }
        };
        View.OnClickListener CLickToList = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Calc.this, Chose.class);
                startActivity(act);
            }
        };
        btnbtnBackToListt.setOnClickListener(CLickToList);
        btnbtnBackToListt2.setOnClickListener(CLickToList);
        btnRetCalcc.setOnClickListener(CLickRet);
        btnMultiplyn.setOnClickListener(CLickbtn);
    }
}