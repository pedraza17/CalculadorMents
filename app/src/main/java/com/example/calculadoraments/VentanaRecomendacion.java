package com.example.calculadoraments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class VentanaRecomendacion extends AppCompatActivity {

    private TextView recomendacion, titulorecomendacion;
    private int resultadofinal, limiteinferior, limitesuperior;
    private ImageView imagenrecomendacion;
    private Button inicioButton, atrasButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_recomendacion);

        resultadofinal= Integer.parseInt(DataSingleton.getInstance().getValorfinal());
        limiteinferior= Integer.parseInt(DataSingleton.getInstance().getIntervalomenor());

        recomendacion = findViewById(R.id.recomendacion);
        imagenrecomendacion = findViewById(R.id.imagenrecomendacion);
        titulorecomendacion = findViewById(R.id.titulorecomendacion);

        if(resultadofinal == limiteinferior){
            recomendacion.setText("Se debe reservar la capacidad de las salas de operaciones para " +
                    "casos urgentes.");
            titulorecomendacion.setText("Procedimiento En Revisión");
            imagenrecomendacion.setImageResource(R.drawable.maso);
        }
        else if(resultadofinal < limiteinferior){
            recomendacion.setText("Este caso está asociado con un bajo riesgo quirúrgico para el " +
                    "paciente, un bajo riesgo de transmisión de COVID-19 para el personal médico y " +
                    "los pacientes, y un uso favorable de recursos.");
            titulorecomendacion.setText("Procedimiento Justificado");
            imagenrecomendacion.setImageResource(R.drawable.feliz);
        }
        else{
            recomendacion.setText("Este caso está asociado con un alto riesgo quirúrgico para el " +
                    "paciente, un alto riesgo de transmisión de COVID-19 para el personal médico y " +
                    "los pacientes, y un uso excesivo de recursos.");
            titulorecomendacion.setText("Procedimiento No Justificado");
            imagenrecomendacion.setImageResource(R.drawable.trista);
        }

        inicioButton = findViewById(R.id.botonInicioRecomendacion);
        inicioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaA= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ventanaA);
            }
        });

        atrasButton = findViewById(R.id.botonAtrasRecomendacion);
        atrasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ventanaB= new Intent(getApplicationContext(), VentanaFinal.class);
                startActivity(ventanaB);
            }
        });
    }
}