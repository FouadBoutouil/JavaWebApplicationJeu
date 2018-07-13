/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao;

import atos.shop.entity.Categorie;
import atos.shop.entity.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class CategorieDao {
    public void ajouter(Categorie c) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }

    public List<Categorie> recuperer() {
        EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query req = em.createQuery("SELECT c FROM Categorie c ORDER BY c.nom");
        return req.getResultList();
    }    

    public void suprimer(Long id) {
         EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query req = em.createQuery("DELETE c FROM Categie c WHERE c.id=id");
        
        em.getTransaction().begin();
        em.remove(em.find(Client.class, id));
        em.getTransaction().commit();
           }
}
