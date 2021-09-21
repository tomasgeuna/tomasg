/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.entidades.dao;

import java.util.List;
import libreriajpa.entidades.Autor;

/**
 *
 * @author tomas
 */
public class AutorDao extends Dao {
    
    public Autor crearAutor(Autor autor){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(autor);
            entityManager.getTransaction().commit();
        
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return autor;
    }
    
    public Autor modificarAutor(Autor autor) {
    try {
      entityManager.getTransaction().begin();
      entityManager.merge(autor);
      entityManager.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
      entityManager.getTransaction().rollback();
    }
    return autor;
    }
    
    public Autor eliminarAutor(Autor autor) {
    try {
      autor = entityManager.find(Autor.class,autor.getId());
      entityManager.getTransaction().begin();
      entityManager.remove(autor);
      entityManager.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
      entityManager.getTransaction().rollback();
    }
    return autor;
    }
    
    
    public List<Autor>FindAll(){
      return entityManager.createQuery("select a from Autor a").getResultList();  
    }
    
    public Autor findByID(Autor autor) {
      return entityManager.find(Autor.class, autor.getId());
    }
}
