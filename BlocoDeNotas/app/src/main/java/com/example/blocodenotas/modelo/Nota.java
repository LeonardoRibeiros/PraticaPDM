package com.example.blocodenotas.modelo;

public class Nota {
    Integer id;
    String texto,titulo;

    public Nota(Integer id, String texto, String titulo) {
        this.id = id;
        this.texto = texto;
        this.titulo = titulo;
    }

    public Nota(String texto, String titulo) {
        this.texto = texto;
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
