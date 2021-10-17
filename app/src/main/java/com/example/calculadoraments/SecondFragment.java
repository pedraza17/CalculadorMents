package com.example.calculadoraments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondFragment extends AppCompatActivity {

    private Button regresarButton;
    private Button comenzarButton;
    private String usuario;
    private TextView usuarioTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_fragment);

        usuario = DataSingleton.getInstance().getUser();
        usuarioTexto = findViewById(R.id.usuarioTexto);
        usuarioTexto.setText(usuario);

        regresarButton = findViewById(R.id.botonRegresar);
        regresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstFragment.class);
                startActivity(intent);
            }
        }
        );

        comenzarButton = findViewById(R.id.botonEmpezar);
        comenzarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(getApplicationContext(), ThirdFragment.class);
                startActivity(intent2);
            }
        }
        );
    }
}