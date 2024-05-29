package com.peliculasbackend.peli.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculasbackend.peli.models.Pelicula;
import com.peliculasbackend.peli.models.services.IServicePelicula;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api")
public class PeliculaController {


    @Autowired
    IServicePelicula peliculaservicio;

    @GetMapping("/peliculas")
    public List<Pelicula> index() {
        return peliculaservicio.findAll();
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPelicula(@PathVariable Long id) {
        return peliculaservicio.findById(id);
    }


    @PostMapping("/peliculas")
    public Pelicula save(@RequestBody Pelicula pelicula) {
        return peliculaservicio.save(pelicula);
    }

    @PutMapping("peliculas/{id}")
    public Pelicula update(@PathVariable Long id, @RequestBody Pelicula pelicula) {
        Pelicula peliculaactual = peliculaservicio.findById(id);
         peliculaactual.setNombre(pelicula.getNombre());
         peliculaactual.setEstreno(pelicula.getEstreno());
         peliculaactual.setGenero(pelicula.getGenero());
         peliculaactual.setIdioma(pelicula.getIdioma());

        return peliculaservicio.save(peliculaactual);
    }

    @DeleteMapping("/peliculas/{id}")
    public void delete(@PathVariable Long id) {
        peliculaservicio.delete(id);
    }

    
    
    
    
}
