package com.example.calculadoraments;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ThirdFragment extends AppCompatActivity {

    private Button BotonSiguiente, BotonAtras;
    private String p1Procedimiento, p2Procedimiento, p3Procedimiento, p4Procedimiento,
            p5Procedimiento, p6Procedimiento, p7Procedimiento;
    private Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_fragment);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        spinner5 = findViewById(R.id.spinner5);
        spinner6 = findViewById(R.id.spinner6);
        spinner7 = findViewById(R.id.spinner7);

        String [] opcionesspinner1 = {"<30 min", "31-60 min", "61-120 min", "121-180 min",
                "≥181 min"};
        ArrayAdapter <CharSequence> adapterspinner1 = new ArrayAdapter<>(this,
                R.layout.spinne_item_ian, opcionesspinner1);
        spinner1.setAdapter(adapterspinner1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    p1Procedimiento="1";
                }
                else if(i == 1){
                    p1Procedimiento="2";
                }
                else if(i == 2){
                    p1Procedimiento="3";
                }
                else if(i == 3){
                    p1Procedimiento="4";
                }
                else{
                    p1Procedimiento="5";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        String hola = DataSingleton.getInstance().getProcedimientop1();
        if (!hola.isEmpty()){
            selectSpinnerItemByValue(spinner1, (new Integer(hola)).longValue());
        }

        String [] opcionesspinner2 = {"Ambulatorio", "<23 h>", "24-48 h", "2-3 d", "≥4 d"};
        ArrayAdapter <CharSequence> adapterspinner2 = new ArrayAdapter<>(this,
                R.layout.spinne_item_ian, opcionesspinner2);
        spinner2.setAdapter(adapterspinner2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    p2Procedimiento="1";
                }
                else if(i == 1){
                    p2Procedimiento="2";
                }
                else if(i == 2){
                    p2Procedimiento="3";
                }
                else if(i == 3){
                    p2Procedimiento="4";
                }
                else{
                    p2Procedimiento="5";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        String hola2 = DataSingleton.getInstance().getProcedimientop2();
        if (!hola2.isEmpty()){
            selectSpinnerItemByValue(spinner2, (new Integer(hola2)).longValue());
        }

        String [] opcionesspinner3 = {"Poco probable", "<5 %", "5-10 %", "11-25 %", ">25 %"};
        ArrayAdapter <CharSequence> adapterspinner3 = new ArrayAdapter<>(this,
                R.layout.spinne_item_ian, opcionesspinner3);
        spinner3.setAdapter(adapterspinner3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    p3Procedimiento="1";
                }
                else if(i == 1){
                    p3Procedimiento="2";
                }
                else if(i == 2){
                    p3Procedimiento="3";
                }
                else if(i == 3){
                    p3Procedimiento="4";
                }
                else{
                    p3Procedimiento="5";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        String hola3 = DataSingleton.getInstance().getProcedimientop3();
        if (!hola3.isEmpty()){
            selectSpinnerItemByValue(spinner3, (new Integer(hola3)).longValue());
        }

        String [] opcionesspinner4 = {"<100 mL", "100-250 mL", "250-500 mL", "500-750 mL",
                "≥751 mL"};
        ArrayAdapter <CharSequence> adapterspinner4 = new ArrayAdapter<>(this,
                R.layout.spinne_item_ian, opcionesspinner4);
        spinner4.setAdapter(adapterspinner4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    p4Procedimiento="1";
                }
                else if(i == 1){
                    p4Procedimiento="2";
                }
                else if(i == 2){
                    p4Procedimiento="3";
                }
                else if(i == 3){
                    p4Procedimiento="4";
                }
                else{
                    p4Procedimiento="5";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        String hola4 = DataSingleton.getInstance().getProcedimientop4();
        if (!hola4.isEmpty()){
            selectSpinnerItemByValue(spinner4, (new Integer(hola4)).longValue());
        }

        String [] opcionesspinner5 = {"1 persona", "2 personas", "3 personas", "4 personas",
                ">4 personas"};
        ArrayAdapter <CharSequence> adapterspinner5 = new ArrayAdapter<>(this,
                R.layout.spinne_item_ian, opcionesspinner5);
        spinner5.setAdapter(adapterspinner5);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    p5Procedimiento="1";
                }
                else if(i == 1){
                    p5Procedimiento="2";
                }
                else if(i == 2){
                    p5Procedimiento="3";
                }
                else if(i == 3){
                    p5Procedimiento="4";
                }
                else{
                    p5Procedimiento="5";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        String hola5 = DataSingleton.getInstance().getProcedimientop5();
        if (!hola5.isEmpty()){
            selectSpinnerItemByValue(spinner5, (new Integer(hola5)).longValue());
        }

        String [] opcionesspinner6 = {"≤1 %", "1-5 %", "6-10 %", "11-25 %", ">25 %"};
        ArrayAdapter <CharSequence> adapterspinner6 = new ArrayAdapter<>(this,
                R.layout.spinne_item_ian, opcionesspinner6);
        spinner6.setAdapter(adapterspinner6);
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    p6Procedimiento="1";
                }
                else if(i == 1){
                    p6Procedimiento="2";
                }
                else if(i == 2){
                    p6Procedimiento="3";
                }
                else if(i == 3){
                    p6Procedimiento="4";
                }
                else{
                    p6Procedimiento="5";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        String hola6 = DataSingleton.getInstance().getProcedimientop6();
        if (!hola6.isEmpty()){
            selectSpinnerItemByValue(spinner6, (new Integer(hola6)).longValue());
        }

        String [] opcionesspinner7 = {"Ninguno de los siguientes",
                "Cirugía abdominopélvica mínimamente invasiva", "Cirugía abdominopélvica " +
                "infraumbilical abierta", "Cirugía abdominopélvica supraumbilical abierta",
                "Cirugía otorrinolaringológica de cabeza y cuello o gastrointestinal"};
        ArrayAdapter <CharSequence> adapterspinner7 = new ArrayAdapter<>(this,
                R.layout.spinne_item_ian, opcionesspinner7);
        spinner7.setAdapter(adapterspinner7);
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    p7Procedimiento="1";
                }
                else if(i == 1){
                    p7Procedimiento="2";
                }
                else if(i == 2){
                    p7Procedimiento="3";
                }
                else if(i == 3){
                    p7Procedimiento="4";
                }
                else{
                    p7Procedimiento="5";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        String hola7 = DataSingleton.getInstance().getProcedimientop7();
        if (!hola7.isEmpty()){
            selectSpinnerItemByValue(spinner7, (new Integer(hola7)).longValue());
        }

        BotonSiguiente= findViewById(R.id.v2BotonSiguiente);
        BotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaS= new Intent(getApplicationContext(), FourFragmentActivity.class);

                DataSingleton.getInstance().setProcedimientop1(p1Procedimiento);
                DataSingleton.getInstance().setProcedimientop2(p2Procedimiento);
                DataSingleton.getInstance().setProcedimientop3(p3Procedimiento);
                DataSingleton.getInstance().setProcedimientop4(p4Procedimiento);
                DataSingleton.getInstance().setProcedimientop5(p5Procedimiento);
                DataSingleton.getInstance().setProcedimientop6(p6Procedimiento);
                DataSingleton.getInstance().setProcedimientop7(p7Procedimiento);

                startActivity(ventanaS);
            }

        });

        BotonAtras= findViewById(R.id.v2BotonAtras);
        BotonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaA= new Intent(getApplicationContext(), SecondFragment.class);
                startActivity(ventanaA);
            }
        });
    }

    public static void selectSpinnerItemByValue(Spinner spnr, long value) {
        ArrayAdapter adapter = (ArrayAdapter) spnr.getAdapter();
        for (int position = 0; position < adapter.getCount(); position++) {
            if(adapter.getItemId(position) == value - 1) {
                spnr.setSelection(position);
                return;
            }
        }
    }
}