/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.service;

import atos.shop.dao.CategorieDao;
import atos.shop.entity.Categorie;
import java.util.List;


public class CategorieService {

    private CategorieDao dao = new CategorieDao();
    public void ajouter(Categorie cat) {
            dao.ajouter(cat);   
    }
    
    public List<Categorie> recuperer() {
            return dao.recuperer();   
    }
    public void Suprimer(Long id){
        dao.suprimer(id);
    }
}
