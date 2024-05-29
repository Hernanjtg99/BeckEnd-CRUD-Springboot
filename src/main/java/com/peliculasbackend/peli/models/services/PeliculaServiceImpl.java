package com.peliculasbackend.peli.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peliculasbackend.peli.models.Pelicula;
import com.peliculasbackend.peli.models.dao.IPeliculaDao;

import jakarta.transaction.Transactional;

@Service
public class PeliculaServiceImpl implements IServicePelicula{

    @Autowired
    private IPeliculaDao peliculaDao;

    @Override
    @Transactional
    public List<Pelicula> findAll() {
        return (List<Pelicula>) peliculaDao.findAll();
    }

    @Override
    @Transactional
    public Pelicula findById(Long id) {
        return peliculaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Pelicula save(Pelicula pelicula) {
         return peliculaDao.save(pelicula);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        peliculaDao.deleteById(id);
    }
    
}
