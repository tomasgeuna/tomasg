/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.entidades.dao;

import java.util.List;
import libreriajpa.entidades.Libro;

/**
 *
 * @author tomas
 */
public class LibroDao extends Dao {
    public Libro crearLibro(Libro libro){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(libro);
            entityManager.getTransaction().commit();
        
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return libro;
    }
    
    public Libro modificarLibro(Libro libro){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(libro);
            entityManager.getTransaction().commit();
        
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return libro;
    }
    
    public Libro eliminarLibro(Libro libro){
        try {
            
            entityManager.getTransaction().begin();
            entityManager.persist(libro);
            entityManager.getTransaction().commit();
        
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return libro;
    }
    
    public List<Libro>FindAll(){
      return entityManager.createQuery("select a from Libro a").getResultList();  
    }
    
    public Libro findByISBN(Libro libro) {
      return entityManager.find(Libro.class, libro.getIsbn());
    }
    
}
