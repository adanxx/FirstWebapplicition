package com.FirstDemoWebapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@WebServlet(urlPatterns = "/login")
public class FirstServlet extends HttpServlet  {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, FileNotFoundException {


        String filename ="C:\\Users\\A.A\\Desktop\\Kea.Data.2016\\1.Kea.Semester\\Semester.2\\1.3.Technology 1\\1.Execrise And Assigment\\Uge.37.Blackexercise\\Webapptest\\1.test\\UserInfo.txt";

        Scanner console = new Scanner(new File(filename));
        Map<String,String> Database = new HashMap<String,String>();

        while(console.hasNextLine()) {
            String user = console.next().toLowerCase();
            String code = console.next().toLowerCase();
            Database.put(user, code);


            String email = request.getParameter("username").toLowerCase();
            String password = request.getParameter("password").toLowerCase();

            if (Database.containsKey(email) && Database.containsValue(password)) {
                request.getRequestDispatcher("/FirstPage.jsp").forward(request, response);
                break;

            } else if (email.equalsIgnoreCase("admin@hotmail.com") && password.equalsIgnoreCase("root")) {
                request.getRequestDispatcher("/AdminServlet").forward(request, response);
                break;

            } else {
                request.setAttribute("error", "Invalid Email or Password - Try Again");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        }

    }

}
