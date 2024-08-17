/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author ravinduchathuranga
 */
public class SignUp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //storing data on variables as strings 
        String mobile = req.getParameter("mobile");
        String name = req.getParameter("name");
        String country = req.getParameter("country");
        
        //create new user object with encapsulation.
        User user = new User(mobile, name, country);

        ServletContext sc = req.getServletContext();
        //add user in to a array list by casting the data type and getting the attribute.
        ArrayList<User> userList = (ArrayList<User>) sc.getAttribute("userList");
        userList.add(user);
        //rederect to sign In page
        resp.sendRedirect("signIn.jsp");
    }

}
