package com.example.tdlenguajes2023;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import com.example.tdlenguajes2023.configuracion.SQLiteConexion;
import com.example.tdlenguajes2023.configuracion.Transacciones;
import com.example.tdlenguajes2023.tablas.Personas;

import java.util.ArrayList;

public class ActivitList extends AppCompatActivity
{
    SQLiteConexion conexion;
    ListView listapersonas;
    ArrayList <Personas> lista;
    ArrayList <String> ArregloPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activit_list);

        conexion = new SQLiteConexion(this, Transacciones.NameDatabase, null, 1);
        listapersonas =(ListView) findViewById(R.id.listapersonas);
        ObtenerListaPersonas();

    }

    private void ObtenerListaPersonas()
    {
     SQLiteDatabase db = conexion.getReadableDatabase();
     Personas person= null;
     lista = new ArrayList<Personas>();

        Cursor cursor = db.rawQuery("SELECT * FROM" + Transacciones.tablaperson, null);
        while (cursor.moveToNext()){
            person= new Personas();
            person.setId (cursor.getInt(0));
            person.setNOMBRES(cursor.getString(1));
            person.setAPELLIDOS(cursor.getString(2));
            person.setEDAD(cursor.getInt(3));
            person.setCORREO(cursor.getString(4));

            lista.add(person);

        }
            cursor.close();
        filllist();
    }

    private void filllist()
    {
        ArregloPersonas = new ArrayList<String>();

        for (i = 0; i< lista.size(); i++)
        {
            ArregloPersonas.add(lista.get(i).getId() + "|" +
                                lista.get(i).getNOMBRES() + "|" +
                                lista.get(i).getId()+ "|");
    }
}