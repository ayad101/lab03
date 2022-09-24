/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * age next year
 * @author ayad
 */
public class AgeCalculatorServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

                String ageInput = request.getParameter("age");
                String message = "";
            if (ageInput != null){
                try {

                int age= Integer.parseInt(ageInput);

                age++;
                message = String.format("Next year you are %d ", age);

                } catch(Exception ex){
                message = "Enter your age.";
                }

            } else{

                message = "Please input a number.";

                }

                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

    }
}