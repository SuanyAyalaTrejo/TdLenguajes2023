package com.example.tdlenguajes2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText txtNombre, txtApellido;
    Button btnMostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText)  findViewById(R.id.txtNombre);
        txtApellido = (EditText) findViewById(R.id.txtApellido);
        btnMostrar = (Button) findViewById(R.id.btnMostrar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, txtNombre.getText()+" "+txtApellido.getText(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}