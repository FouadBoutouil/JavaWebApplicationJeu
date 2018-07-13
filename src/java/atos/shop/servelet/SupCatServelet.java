/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servelet;

import atos.shop.entity.Client;
import atos.shop.service.ClientService;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SupCatServelet", urlPatterns = {"/supprimer-cat"})
public class SupCatServelet extends HttpServlet {
    ClientService service = new ClientService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
       //recuper l'id de la categorie de la categorie passer en param dans le lien
       Long id = Long.parseLong(req.getParameter("id"));
       service.suprimer(id);
       // lance fonc dans le service pour sup la categorie
       service.suprimer(id);
       // afficher la liste des categorie 
       resp.sendRedirect("Lister-Categories");
    }

    
    
}
