package model;

import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listner_1 implements ServletContextListener {

    //listners to handle user checking purposes.
    @Override
    public void contextInitialized(ServletContextEvent sce) {                
        ArrayList<User> userList=new ArrayList<>();
        sce.getServletContext().setAttribute("userList", userList);        
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("hello contextDestroyed");

    }

}
