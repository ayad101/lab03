/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author ayad
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name = "ArithCalcServlet", urlPatterns = {"/arithmetic"})
public class ArithCalcServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = "-";
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/ArithCalc.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String firstInput= request.getParameter("first");
                String secondInput= request.getParameter("second");
                String result = "--";

                 if(firstInput != null && secondInput != null){

            try {

                int first= Integer.parseInt(firstInput);
                int second= Integer.parseInt(secondInput);
                
                if(request.getParameter("add") != null) {
                result = Integer.toString(first + second);
                }

                else if(request.getParameter("subtract") != null) {
                result = Integer.toString(first - second);
                }

                else if(request.getParameter("multiply") != null) {
                result = Integer.toString(first * second);
                }

                else if(request.getParameter("divide") != null) {
                result = Integer.toString(first / second);
                }

                } catch(Exception ex){
                result = "invalid";
                }
            } else{
                result = "invalid";
                }

                request.setAttribute("result", result);

                getServletContext().getRequestDispatcher("/WEB-INF/ArithCalc.jsp").forward(request, response);
    }


}