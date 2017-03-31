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
@WebServlet(urlPatterns = "/DisplayDataServlet")
public class DisplayDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String filename = "C:\\Users\\A.A\\Desktop\\Kea.Data.2016\\1.Kea.Semester\\Semester.2\\1.3.Technology 1\\1.Execrise And Assigment\\Uge.37.Blackexercise\\Webapptest\\1.test\\UserInfo.txt";
        String filename1 = "C:\\Users\\A.A\\Desktop\\Kea.Data.2016\\1.Kea.Semester\\Semester.2\\1.3.Technology 1\\1.Execrise And Assigment\\Uge.37.Blackexercise\\Webapptest\\1.test\\testUser.txt";

        Scanner input = new Scanner(new File(filename));
        PrintStream output  = new PrintStream(filename1);

        while(input.hasNextLine()) {
            output.println(input.nextLine());

        }
                output.println();
            String FirstName = request.getParameter("first");
            output.print("Name " + FirstName + " :");
            String LastName = request.getParameter("last");
            output.println(LastName);
            String email = request.getParameter("email");
            output.println("Email: " + email);
            String gender = request.getParameter("gender");
            output.println("Gender: " + gender);
            String Address = request.getParameter("Address");
            output.println("Address: " + Address);
            output.println();

            request.setAttribute("FirstName", FirstName);
            request.setAttribute("LastName", LastName);
            request.setAttribute("Address", Address);
            request.setAttribute("gender", gender);
            request.setAttribute("email", email);

            request.getRequestDispatcher("/DisplayData.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/FirstPage.jsp").forward(request, response);

    }
}
