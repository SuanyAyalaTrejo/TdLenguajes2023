package com.example.tdlenguajes2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tdlenguajes2023.configuracion.SQLiteConexion;
import com.example.tdlenguajes2023.configuracion.Transacciones;

public class ActivityIngresar extends AppCompatActivity {

    EditText codigo,Nombre,Apellidos, Edad, Correo;
    Button btnagregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        codigo = (EditText) findViewById(R.id.txtcodigo);
        Nombre = (EditText) findViewById(R.id.txtNombres);
        Apellidos = (EditText) findViewById(R.id.txtApellidos);
        Edad = (EditText) findViewById(R.id.txtEdad);
        Correo = (EditText) findViewById(R.id.txtCorreo);

        btnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AgregarPersonas();
            }
        });


    }

    private void AgregarPersonas() {
        SQLiteConexion conexion = new SQLiteConexion(this,
                Transacciones.NameDatabase,
                null,
                1);

        SQLiteDatabase db = conexion.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(Transacciones.NOMBRES, Nombre.getText().toString());
        valores.put(Transacciones.APELLIDOS, Apellidos.getText().toString());
        valores.put(Transacciones.EDAD, Edad.getText().toString());
        valores.put(Transacciones.CORREO, Correo.getText().toString());

        long resultado = db.insert(Transacciones.tablaperson, Transacciones.id, valores);
        Toast.makeText(this, "Ingresado con exito", Toast.LENGTH_SHORT).show();
        cleanPantalla();
    }

    private void cleanPantalla() {
        Nombre.setText("");
        Apellidos.setText("");
        Edad.setText("");
        Correo.setText("");
    }
}