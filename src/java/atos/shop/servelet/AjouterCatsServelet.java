/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servelet;

import atos.shop.entity.Categorie;
import atos.shop.service.CategorieService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "AjouterCatsServelet", urlPatterns = {"/Ajouter-cat"})
public class AjouterCatsServelet extends HttpServlet {

    private CategorieService service = new CategorieService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        Categorie cat = new Categorie();
        cat.setNom(nom);
        service. ajouter(cat);
        
        
        // demander au navigateur de faire une requete get vers la route de listerCatService
        resp.sendRedirect("Lister-Categories");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajouter-cat.jsp").forward(req, resp);
        
    }

}
