package com.peliculasbackend.peli.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.peliculasbackend.peli.models.Pelicula;

public interface IPeliculaDao extends CrudRepository<Pelicula,Long> {
    
}
