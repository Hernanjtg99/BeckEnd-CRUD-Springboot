package com.peliculasbackend.peli.models.services;

import java.util.List;

import com.peliculasbackend.peli.models.Pelicula;

public interface IServicePelicula {
    
    public List<Pelicula>findAll();

    public Pelicula findById(Long id);

    public Pelicula save(Pelicula pelicula);

    public void delete(Long id);

}
