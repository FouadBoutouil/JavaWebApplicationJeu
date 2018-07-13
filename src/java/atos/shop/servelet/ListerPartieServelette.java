/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servelet;

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
@WebServlet(name = "ListerPartieServelette", urlPatterns = {"/Lister_Filme"})
public class ListerPartieServelette extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // definir un atribut de req titre
        req.setAttribute("titrePage", "liste_des_films");   // lister de films c'est le nom d'une variable requete
        // forward vers la jsp ----> la jsp c'est la vue
        req.getRequestDispatcher("Lister_film.jsp").forward(req, resp);
    }

    
}
