/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.service;

import atos.shop.dao.ClientDao;
import atos.shop.entity.Client;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class ClientService {
    
    ClientDao dao = new ClientDao();
    public void ajouterClient(Client c){
        dao.ajouter(c);
        
        
    }

    public List<Client> recuperer() {
      return dao.recuperer();
    }

    

    public void suprimer(Long id) {
       dao.suprimer(id);
    }
    // dans les service vaut mieux appeler la fonction par son metier comme ici elle devrait sappeler Find Client
    public Client verifi(String pseudo, String password) {
        Client c = dao.verifi(pseudo,password);
        return c;
    }
    
}
