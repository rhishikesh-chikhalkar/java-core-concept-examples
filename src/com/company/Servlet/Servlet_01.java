package Servlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Servlet_01 extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1 + num2;
        System.out.print("Addition = \t" + result);
    }
}