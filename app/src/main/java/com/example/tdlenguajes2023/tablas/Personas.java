package com.example.tdlenguajes2023.tablas;


public class Personas {
    private Integer id;
    private String NOMBRES;
    private String APELLIDOS;
    private  Integer EDAD;
    private String CORREO;


    public Personas(Integer id, String NOMBRES, String APELLIDOS, Integer EDAD, String CORREO) {
        this.id = id;
        this.NOMBRES = NOMBRES;
        this.APELLIDOS = APELLIDOS;
        this.EDAD = EDAD;
        this.CORREO = CORREO;
    }

    public Personas() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public Integer getEDAD() {
        return EDAD;
    }

    public void setEDAD(Integer EDAD) {
        this.EDAD = EDAD;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }
}



