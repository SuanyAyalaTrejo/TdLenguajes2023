package com.example.tdlenguajes2023.configuracion;

public class Transacciones {
    public static final String NameDatabase = "TLENG";

    public static final String tablaperson = "personas";

    public static  String id = "id";
    public static String  NOMBRES = "NOMBRES";
    public static String APELLIDOS= "APELLIDOS";
    public static String EDAD= "EDAD";
    public static String CORREO= "CORREO";

    public static String CreateTBPersonas = "CREATE TABLE personas (id INTEGER PRIMARY KEY AUTOINCREMENT)" +
            "NOMBRES TEXT, APELLIDOS TEXT, EDAD INTEGER, CORREO TEXT )";

    public static String DropTBPersonas = "DROP TABLE IF EXISTS personas";
}

