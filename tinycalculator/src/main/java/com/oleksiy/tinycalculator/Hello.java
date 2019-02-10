package com.oleksiy.tinycalculator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Hello", urlPatterns = {"/Hello"})
public class Hello extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hello JSF Page</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Hello at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo(){
        return "Hello Servlet Description";
    }

}