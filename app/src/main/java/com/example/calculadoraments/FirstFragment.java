package com.example.calculadoraments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends AppCompatActivity {

    private Button ingresarButton;
    private String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_fragment);

        ingresarButton = findViewById(R.id.botonIngresar);
        ingresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondFragment.class);
                usuario = ((EditText)findViewById(R.id.EditName)).getText().toString();
                usuario = "Hola, " + usuario +", soy la calculadora MeNTS. A continuación deberás " +
                        "contestar una serie de preguntas que me ayudarán a determinar si realizar o " +
                        "no un procedimiento.";
                DataSingleton.getInstance().setUser(usuario);
                startActivity(intent);
            }
        });

    }
}