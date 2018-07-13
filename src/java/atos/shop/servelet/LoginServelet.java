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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "LoginServelet", urlPatterns = {"/LoginServelet"})
public class LoginServelet extends HttpServlet {

    ClientService serviceC = new ClientService();
    // redirigiger ou afficher numero de sesssion et le login 

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // recuperer les champs rentrer par l'utilisateur
        String pseudo = req.getParameter("login");
        String password = req.getParameter("mdp");
        // faire une fonction( un controleur| une servelet )  qui verifi dans la base de donnée l'exsistance
        // servelet --> service --> dao du coup on dois injecter un  service ici
        Client cobay = serviceC.verifi(pseudo,password);
        // on utilise un forward ou un redirect selon 
        // Correctio du prof 
        // 1-connection  2-redirect
        if (cobay==null) {
            throw new RuntimeException("Erreur de connectio !!");
            //resp.sendRedirect("");
        }else{
            // l'enregistrer le client ( objet dans session
            req.getSession().invalidate();
            req.getSession().setAttribute("clientConnecte", cobay);
            resp.sendRedirect("HomePage");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
        
    }
}

// le client clic sur login ----> doget ----- on change rien du coup forward 
// le client clik sur submit ---->dopost ----- on fais comme on veut