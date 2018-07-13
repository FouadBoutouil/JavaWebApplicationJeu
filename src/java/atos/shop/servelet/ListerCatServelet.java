/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servelet;

import atos.shop.dao.CategorieDao;
import atos.shop.entity.Categorie;
import atos.shop.service.CategorieService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ListerCatServelet", urlPatterns = {"/Lister-Categories"})
public class ListerCatServelet extends HttpServlet {
    
    private CategorieService service = new CategorieService();
    private CategorieDao dao = new CategorieDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // recuperer la liste des cat en base de donnée 
        List<Categorie> liste = service.recuperer();
        // set attribute requ avec liste de categorie 
        req.setAttribute("listeCategorie", liste);
        //forward vers vue 
        req.getRequestDispatcher("lister-cat.jsp").forward(req, resp);
                
    }
    
}
