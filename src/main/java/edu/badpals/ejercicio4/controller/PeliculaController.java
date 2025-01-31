package edu.badpals.ejercicio4.controller;

import edu.badpals.ejercicio4.model.Pelicula;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PeliculaController {

    private final List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        peliculas.add(new Pelicula("Cadena Perpetua","cadenaperpetua.jpg"));
        peliculas.add(new Pelicula("Oppenheimer","oppenheimer.jpeg"));
        peliculas.add(new Pelicula("El Retorno del Rey","esdla.jpg"));
    }


    @GetMapping("/")
    public String peliculas (Model model){
        model.addAttribute("peliculas", peliculas);
        return "peliculas";
    }

    @RequestMapping("/like")
    public String votar(String nombrePelicula, Model model){
        for (Pelicula pelicula : peliculas){
            if(pelicula.getNombre().equals(nombrePelicula)){
                pelicula.incrementVotos();
                break;
            }
        }
        return "redirect:/";
    }


}
