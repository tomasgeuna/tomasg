/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.entidades.dao;

import java.util.List;
import libreriajpa.entidades.Editor;

/**
 *
 * @author tomas
 */
public class EditorDao extends Dao {
    public Editor crearEditor(Editor editor){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(editor);
            entityManager.getTransaction().commit();
        
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return editor;
    }
    
    public Editor modificarEditor(Editor editor) {
    try {
      entityManager.getTransaction().begin();
      entityManager.merge(editor);
      entityManager.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
      entityManager.getTransaction().rollback();
    }
    return editor;
    }
    
    public Editor eliminarEditor(Editor editor) {
    try {
      editor = entityManager.find(Editor.class,editor.getId());
      entityManager.getTransaction().begin();
      entityManager.remove(editor);
      entityManager.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
      entityManager.getTransaction().rollback();
    }
    return editor;
    }
    
    public List<Editor>FindAll(){
      return entityManager.createQuery("select a from Editor a").getResultList();  
    }
    
    public Editor findByID(Editor editor) {
      return entityManager.find(Editor.class, editor.getId());
    }
    
}
