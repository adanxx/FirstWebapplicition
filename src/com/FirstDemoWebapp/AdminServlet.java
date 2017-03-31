package com.FirstDemoWebapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;
/**
 * Created by A.A on 9/30/2016.
 */
@WebServlet(urlPatterns = "/AdminServlet")
public class AdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,FileNotFoundException {

           response.getWriter().println("Administration Main System ");
           response.getWriter().println();
           response.getWriter().println("UserList:");

        String filename = "C:\\Users\\A.A\\Desktop\\Kea.Data.2016\\1.Kea.Semester\\Semester.2\\1.3.Technology 1\\1.Execrise And Assigment\\Uge.37.Blackexercise\\Webapptest\\1.test\\testUser.txt";
           Scanner output = new Scanner(new File(filename));
            while (output.hasNextLine()) {
                response.getWriter().println(output.nextLine());
            }

    }
}
