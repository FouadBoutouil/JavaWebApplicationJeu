/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servelet;

import atos.shop.entity.Categorie;
import atos.shop.entity.Client;
import atos.shop.service.ClientService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ajouterClientServelet", urlPatterns = {"/ajouterClientServelet"})
public class ajouterClientServelet extends HttpServlet {
    ClientService service = new ClientService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Client c = new Client();
        c.setNom(req.getParameter("nom"));
        c.setPrenom(req.getParameter("prenom"));
        c.setAdresse(req.getParameter("adresse"));
        c.setNumRue(Integer.parseInt(req.getParameter("numRue")));
        c.setZip(Integer.parseInt(req.getParameter("ZIP")));
        c.setNom(req.getParameter("login"));
        c.setNom(req.getParameter("pwd"));
        service.ajouterClient(c);
        
        resp.sendRedirect("ListerClientServelet");
        

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajouter_client.jsp").forward(req, resp);
    }

}
