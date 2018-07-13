/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao;

import atos.shop.entity.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class ClientDao {

    public void ajouter(Client c) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }

    public List<Client> recuperer() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query req = em.createQuery("SELECT c FROM Client c ORDER BY c.nom");
        return req.getResultList();
    }

    public void sprClient() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query req = em.createQuery("DELETE c FROM Clint c ORDER BY c.nom");
    }

    public void suprimer(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query req = em.createQuery("DELETE FROM Categorie c WHERE c.id=:id");
        req.setParameter("id", id);
        req.executeUpdate();
        // em.remove(em.find(Client.class, id));
        em.getTransaction().commit();
    }

    public Client verifi(String pseudo, String password) {
        try {
            EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
            // on chek si le client exsiste dans la base de donnée 

            return (Client) em.createQuery("SELECT c FROM Client c WHERE c.login= :log AND c.mdp= :pwd")
                    .setParameter("pwd", password).setParameter("log", pseudo).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
