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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ChangerStyleServelet", urlPatterns = {"/changerStyle"})
public class ChangerStyleServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String mdp = req.getParameter("drapeau");
        Cookie c = new Cookie("style",mdp);
        c.setMaxAge(60*60*24*30);
        resp.addCookie(c);
        resp.sendRedirect("_THEME.jsp");
    }

}
