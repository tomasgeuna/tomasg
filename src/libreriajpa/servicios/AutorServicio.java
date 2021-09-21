/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import java.util.List;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.dao.AutorDao;

/**
 *
 * @author tomas
 */
public class AutorServicio {
    private AutorDao autorDao = new AutorDao();
    
    public void crearAutor(Autor autor){
        autorDao.crearAutor(autor);
    }
    
    public void modificarAutor(Autor autor) throws Exception {
        if (autorDao.findByID(autor) == null) {
            throw new Exception("No existe la autor en la base de datos");
        }
        autorDao.modificarAutor(autor);
    }

    public void eliminarAutor(Autor autor) {
        autorDao.eliminarAutor(autor);
    }
    
    public List<Autor> findAll(){
        List<Autor> personas = autorDao.FindAll();
        mostrarLista(personas);
        return personas;
    }
    
    public void mostrarLista(List<Autor> autor){
        for (Autor autor1 : autor) {
            System.out.println(autor1.toString());
        }
    }
    
}
