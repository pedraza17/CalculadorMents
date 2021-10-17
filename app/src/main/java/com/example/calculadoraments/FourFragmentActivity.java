package com.example.calculadoraments;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class FourFragmentActivity extends AppCompatActivity {

    private Button BotonSiguiente, BotonAtras;
    private String d1, d2, d3, d4, d5, d6;
    private SeekBar disease1, disease2, disease3, disease4, disease5, disease6;
    private TextView textView7, textView8, textView9, textView10, textView11, textView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_fragment);

        disease1 = findViewById(R.id.disease1);
        textView7= findViewById(R.id.textView7);
        disease2 = findViewById(R.id.disease2);
        textView8= findViewById(R.id.textView8);
        disease3 = findViewById(R.id.disease3);
        textView9= findViewById(R.id.textView9);
        disease4 = findViewById(R.id.disease4);
        textView10= findViewById(R.id.textView10);
        disease5 = findViewById(R.id.disease5);
        textView11= findViewById(R.id.textView11);
        disease6 = findViewById(R.id.disease6);
        textView12= findViewById(R.id.textView12);

        textView7.setText("<40 %");
        d1="2";
        disease1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar disease1, int i, boolean b) {
                if(i == 0){
                    textView7.setText("No viable");
                    d1="1";
                }
                else if(i == 1){
                    textView7.setText("<40 %");
                    d1="2";
                }
                else if(i == 2){
                    textView7.setText("40-60 %");
                    d1="3";
                }
                else if(i == 3){
                    textView7.setText("61-95 %");
                    d1="4";
                }
                else{
                    textView7.setText("Igual de efectivo");
                    d1="5";
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar disease1) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar disease1) {
            }
        });

        textView8.setText("Algo peor");
        d2="2";
        disease2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar disease2, int i, boolean b) {
                if(i == 0){
                    textView8.setText("Significativamente peor/no aplica");
                    d2="1";
                }
                else if(i == 1){
                    textView8.setText("Algo peor");
                    d2="2";
                }
                else if(i == 2){
                    textView8.setText("Equivalente");
                    d2="3";
                }
                else if(i == 3){
                    textView8.setText("Algo mejor");
                    d2="4";
                }
                else{
                    textView8.setText("Significativamente mejor");
                    d2="5";
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar disease2) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar disease2) {
            }
        });

        textView9.setText("Peor");
        d3="2";
        disease3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar disease3, int i, boolean b) {
                if(i == 0){
                    textView9.setText("Significativamente peor");
                    d3="1";
                }
                else if(i == 1){
                    textView9.setText("Peor");
                    d3="2";
                }
                else if(i == 2){
                    textView9.setText("Moderadamente peor");
                    d3="3";
                }
                else if(i == 3){
                    textView9.setText("Un poco peor");
                    d3="4";
                }
                else{
                    textView9.setText("No peor");
                    d3="5";
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar disease3) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar disease3) {
            }
        });

        textView10.setText("Peor");
        d4="2";
        disease4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar disease4, int i, boolean b) {
                if(i == 0){
                    textView10.setText("Significativamente peor");
                    d4="1";
                }
                else if(i == 1){
                    textView10.setText("Peor");
                    d4="2";
                }
                else if(i == 2){
                    textView10.setText("Moderadamente peor");
                    d4="3";
                }
                else if(i == 3){
                    textView10.setText("Un poco peor");
                    d4="4";
                }
                else{
                    textView10.setText("No peor");
                    d4="5";
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar disease4) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar disease4) {
            }
        });

        textView11.setText("Peor");
        d5="2";
        disease5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar disease2, int i, boolean b) {
                if(i == 0){
                    textView11.setText("Significativamente peor");
                    d5="1";
                }
                else if(i == 1){
                    textView11.setText("Peor");
                    d5="2";
                }
                else if(i == 2){
                    textView11.setText("Moderadamente peor");
                    d5="3";
                }
                else if(i == 3){
                    textView11.setText("Un poco peor");
                    d5="4";
                }
                else{
                    textView11.setText("No peor");
                    d5="5";
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar disease5) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar disease5) {
            }
        });

        textView12.setText("Peor");
        d6="2";
        disease6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar disease6, int i, boolean b) {
                if(i == 0){
                    textView12.setText("Significativamente peor");
                    d6="1";
                }
                else if(i == 1){
                    textView12.setText("Peor");
                    d6="2";
                }
                else if(i == 2){
                    textView12.setText("Moderadamente peor");
                    d6="3";
                }
                else if(i == 3){
                    textView12.setText("Un poco peor");
                    d6="4";
                }
                else{
                    textView12.setText("No peor");
                    d6="5";
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar disease6) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar disease6) {
            }
        });

        BotonSiguiente= findViewById(R.id.v2BotonSiguiente2);
        BotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaS= new Intent(getApplicationContext(), FiveFragment.class);

                DataSingleton.getInstance().setD1(d1);
                DataSingleton.getInstance().setD2(d2);
                DataSingleton.getInstance().setD3(d3);
                DataSingleton.getInstance().setD4(d4);
                DataSingleton.getInstance().setD5(d5);
                DataSingleton.getInstance().setD6(d6);

                startActivity(ventanaS);
            }
        });

        BotonAtras= findViewById(R.id.v2BotonAtras2);
        BotonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaA= new Intent(getApplicationContext(), ThirdFragment.class);
                startActivity(ventanaA);
            }
        });
    }
}