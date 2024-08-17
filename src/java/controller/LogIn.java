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

public class LogIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mobile = req.getParameter("mobile");

        ServletContext scc = req.getServletContext();
        ArrayList<User> userList = (ArrayList<User>) scc.getAttribute("userList");
        boolean userFound = false;
        for (User user : userList) {
            if (user.getMobile().equals(mobile)) {
                userFound = true;
                resp.sendRedirect("home.jsp");
                break;
            }
        }
        if(!userFound){
        resp.sendRedirect("signUp.jsp");
        }
    }

}
