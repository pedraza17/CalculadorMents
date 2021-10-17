package com.example.calculadoraments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;


public class FiveFragment extends AppCompatActivity {
    private Button BotonSiguiente, BotonAtras;
    private RadioGroup rg1, rg2, rg3, rg4, rg5, rg6;
    private Switch switchI;
    private RadioGroup rg8 = null;
    private String p1Pac = "1";
    private String p2Pac = "1";
    private String p3Pac = "1";
    private String p4Pac = "1";
    private String p5Pac = "1";
    private String p6Pac = "1";
    private String p7Pac = "1";
    private String p8Pac = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_fragment);
        rg1 = findViewById(R.id.r1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.r11:
                        p1Pac= "1";
                        break;
                    case R.id.r12:
                        p1Pac = "2";
                        break;
                    case R.id.r13:
                        p1Pac = "3";
                        break;
                    case R.id.r14:
                        p1Pac = "4";
                        break;
                    case R.id.r15:
                        p1Pac = "5";
                        break;
                }
            }
        });
        rg2 = findViewById(R.id.r2);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.r21:
                        p2Pac= "1";
                        break;
                    case R.id.r22:
                        p2Pac = "4";
                        break;
                    case R.id.r23:
                        p2Pac = "5";
                        break;
                }
            }
        });

        rg3 = findViewById(R.id.r3);
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.r31:
                        p3Pac= "1";
                        break;
                    case R.id.r32:
                        p3Pac = "4";
                        break;
                    case R.id.r33:
                        p3Pac = "5";
                        break;
                }
            }
        });

        rg4 = findViewById(R.id.r4);
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.r41:
                        p4Pac= "1";
                        break;
                    case R.id.r42:
                        p4Pac = "2";
                        break;
                    case R.id.r43:
                        p4Pac = "3";
                        break;
                    case R.id.r44:
                        p4Pac = "4";
                        break;
                    case R.id.r45:
                        p4Pac = "5";
                        break;
                }
            }
        });
        rg5 = findViewById(R.id.r5);
        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.r51:
                        p5Pac= "1";
                        break;
                    case R.id.r52:
                        p5Pac = "3";
                        break;
                    case R.id.r53:
                        p5Pac = "4";
                        break;
                    case R.id.r54:
                        p5Pac = "5";
                        break;

                }
            }
        });

        rg6 = findViewById(R.id.r6);
        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.r61:
                        p6Pac= "1";
                        break;
                    case R.id.r62:
                        p6Pac = "4";
                        break;
                    case R.id.r63:
                        p6Pac = "5";
                        break;
                }
            }
        });
        switchI=findViewById(R.id.switch1);
        switchI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()== R.id.switch1){
                    if(switchI.isChecked()){
                        p7Pac="5";
                    }
                    else{
                        p7Pac="1";
                    }
                }
            }
        });

        rg8 = findViewById(R.id.r8);
        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rg8, int i) {
                switch (i){
                    case R.id.r81:
                        p8Pac= "1";
                        break;
                    case R.id.r82:
                        p8Pac = "2";
                        break;
                    case R.id.r83:
                        p8Pac = "3";
                        break;
                    case R.id.r84:
                        p8Pac = "4";
                        break;
                    case R.id.r85:
                        p8Pac = "5";
                        break;
                }
            }
        });

        BotonSiguiente= findViewById(R.id.BotonSiguientef5);
        BotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaS= new Intent(getApplicationContext(), VentanaFinal.class);
                DataSingleton.getInstance().setP1(p1Pac);
                DataSingleton.getInstance().setP2(p2Pac);
                DataSingleton.getInstance().setP3(p3Pac);
                DataSingleton.getInstance().setP4(p4Pac);
                DataSingleton.getInstance().setP5(p5Pac);
                DataSingleton.getInstance().setP6(p6Pac);
                DataSingleton.getInstance().setP7(p7Pac);
                DataSingleton.getInstance().setP8(p8Pac);
                startActivity(ventanaS);
            }
        });

        BotonAtras= findViewById(R.id.BotonAtrasf5);
        BotonAtras.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent ventanaA= new Intent(getApplicationContext(), FourFragmentActivity.class);
                startActivity(ventanaA);
            }
        });
    }
}