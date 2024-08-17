package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

public class LogIn extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mobile = req.getParameter("mobile");
        //checking the mobile via servlet context scope.
        ServletContext scc = req.getServletContext();
        ArrayList<User> userList = (ArrayList<User>) scc.getAttribute("userList");
        boolean userFound = false;
        for (User user : userList) {
            if (user.getMobile().equals(mobile)) {
                userFound = true;
                //setting session to handle multiple users
                HttpSession session = req.getSession();
                session.setAttribute("user", user);
                
                resp.sendRedirect("home.jsp");
                break;
            }
        }
        if (!userFound) {
            //sending attribute to dispatcher to handle the error msg.
            req.setAttribute("error", "Invalid details");
            req.getRequestDispatcher("signIn.jsp").forward(req, resp);
            //resp.sendRedirect("signIn.jsp?error=Invalid Details");
        }
    }
    
}
