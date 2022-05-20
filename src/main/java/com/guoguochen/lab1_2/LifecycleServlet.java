package com.guoguochen.lab1_2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LifecycleServlet", value = "/lifecycle")
public class LifecycleServlet extends HttpServlet {
    int i;
    public void init() throws ServletException{
        super.init();
        i = 0;
        System.out.println("I Am from default constructor");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String val="since loading ,this servlet has been accessed "+i+" times";
        ++i;
        request.setAttribute("val",val);
        request.getRequestDispatcher("lab1_2/lifecycle.jsp").forward(request,response);
    }
    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
