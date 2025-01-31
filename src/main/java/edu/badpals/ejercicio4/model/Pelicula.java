package edu.badpals.ejercicio4.model;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class Pelicula {
    private String nombre;
    private String imagen;
    private int votos;

    public Pelicula(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.votos = 0;
    }

    public void incrementVotos() {
        this.votos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public String getImagen() {
        return imagen ; // Devuelve la ruta de la imagen
    }
}
