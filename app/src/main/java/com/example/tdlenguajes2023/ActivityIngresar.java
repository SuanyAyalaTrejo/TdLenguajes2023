package com.example.tdlenguajes2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActivityIngresar extends AppCompatActivity {

    EditText codigo,Nombre,Apellidos, Edad, Correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        codigo = (EditText) findViewById(R.id.txtcodigo);
        Nombre = (EditText) findViewById(R.id.txtNombres);
        Apellidos = (EditText) findViewById(R.id.txtApellidos);
        Edad = (EditText) findViewById(R.id.txtEdad);
        Correo = (EditText) findViewById(R.id.txtCorreo);


    }
}