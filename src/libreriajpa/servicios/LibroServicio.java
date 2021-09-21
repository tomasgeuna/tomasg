/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import java.util.List;
import libreriajpa.entidades.Libro;
import libreriajpa.entidades.dao.LibroDao;

/**
 *
 * @author tomas
 */
public class LibroServicio {
    private LibroDao libroDao = new LibroDao();

    public Libro crearLibro(Libro libro) {
        return libroDao.crearLibro(libro);
    }

    public List<Libro> findAll() {
        List<Libro> libroes = libroDao.FindAll();
        mostrarLista(libroes);
        return libroes;
    }

    public void modificarLibro(Libro libro) throws Exception {
        if (libroDao.findByISBN(libro) == null) {
            throw new Exception("No existe la libro en la base de datos");
        }
        libroDao.modificarLibro(libro);
    }

    public void eliminarLibro(Libro libro) {
        libroDao.eliminarLibro(libro);
    }

    private void mostrarLista(List<Libro> libroes) {
        for (Libro libro : libroes) {
            System.out.println(libro.toString());
        }
    }
}
