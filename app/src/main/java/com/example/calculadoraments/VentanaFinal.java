package com.example.calculadoraments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class VentanaFinal extends AppCompatActivity {

    private Button inicioButton, recomendacionBoton;
    private int pro1,pro2, pro3, pro4, pro5, pro6, pro7, d1, d2, d3, d4, d5, d6, p1, p2, p3, p4, p5,
            p6, p7, p8, sumaprocedimiento;
    private String inferior;
    private TextView respuestaFinal;
    private NumberPicker limiteinferior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_final);

        limiteinferior = findViewById(R.id.numberPicker);
        limiteinferior.setMinValue(21);
        limiteinferior.setMaxValue(105);
        limiteinferior.setValue(55);
        inferior = Integer.toString(55);

        limiteinferior.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                inferior = Integer.toString(limiteinferior.getValue());
            }
        });

        pro1= Integer.parseInt(DataSingleton.getInstance().getProcedimientop1());
        pro2= Integer.parseInt(DataSingleton.getInstance().getProcedimientop2());
        pro3= Integer.parseInt(DataSingleton.getInstance().getProcedimientop3());
        pro4= Integer.parseInt(DataSingleton.getInstance().getProcedimientop4());
        pro5= Integer.parseInt(DataSingleton.getInstance().getProcedimientop5());
        pro6= Integer.parseInt(DataSingleton.getInstance().getProcedimientop6());
        pro7= Integer.parseInt(DataSingleton.getInstance().getProcedimientop7());
        d1 = Integer.parseInt(DataSingleton.getInstance().getD1());
        d2 = Integer.parseInt(DataSingleton.getInstance().getD2());
        d3 = Integer.parseInt(DataSingleton.getInstance().getD3());
        d4 = Integer.parseInt(DataSingleton.getInstance().getD4());
        d5 = Integer.parseInt(DataSingleton.getInstance().getD5());
        d6 = Integer.parseInt(DataSingleton.getInstance().getD6());
        p1 = Integer.parseInt(DataSingleton.getInstance().getP1());
        p2 = Integer.parseInt(DataSingleton.getInstance().getP2());
        p3 = Integer.parseInt(DataSingleton.getInstance().getP3());
        p4 = Integer.parseInt(DataSingleton.getInstance().getP4());
        p5 = Integer.parseInt(DataSingleton.getInstance().getP5());
        p6 = Integer.parseInt(DataSingleton.getInstance().getP6());
        p7=Integer.parseInt(DataSingleton.getInstance().getP7());
        p8=Integer.parseInt(DataSingleton.getInstance().getP8());


        sumaprocedimiento = pro1 + pro2 + pro3 + pro4 + pro5 + pro6 + pro7 + d1 + d2 + d3 + d4 + d5
                + d6 + p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8;

        respuestaFinal = findViewById(R.id.respuestaFinal);
        respuestaFinal.setText(Integer.toString(sumaprocedimiento));

        inicioButton = findViewById(R.id.botonAtrasCalculo);
        inicioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaA= new Intent(getApplicationContext(), FiveFragment.class);
                startActivity(ventanaA);
            }
        });

        recomendacionBoton = findViewById(R.id.botonRecomendación);
        recomendacionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaB= new Intent(getApplicationContext(), VentanaRecomendacion.class);

                DataSingleton.getInstance().setIntervalomenor(inferior);
                DataSingleton.getInstance().setValorfinal(Integer.toString(sumaprocedimiento));

                startActivity(ventanaB);
            }
        });
    }
}