/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.entidades.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author tomas
 */
public class Dao {
    
    protected EntityManager entityManager = (EntityManager) Persistence.createEntityManagerFactory("LibreriaJPAPU").createEntityManager();
    
}
