package com.example.myapp.entidades;

public class comidas {

    private Integer id;
    private String Nombre;
    private String precio;

    public comidas(Integer id, String nombre, String precio) {
        this.id = id;
        Nombre = nombre;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
