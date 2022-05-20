package com.guoguochen.lab1_2;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Lab2Servlet", value = "/lab2")
public class Lab2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("lab1_2/lab2.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String cla=request.getParameter("class");
        String id=request.getParameter("id");
        request.setAttribute("name",name);
        request.setAttribute("cla",cla);
        request.setAttribute("id",id);
        request.getRequestDispatcher("lab1_2/MyDear.jsp").forward(request,response);
    }
}
