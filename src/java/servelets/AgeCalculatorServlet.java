package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age=request.getParameter("age");
        request.setAttribute("age",age);
        
        if(age == null || age.equals("")){
            request.setAttribute("msg", "You must enter a number ");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }
        
        try{
            int newAge= Integer.parseInt(age);
            newAge++;
            request.setAttribute("msg", "Your next birthday will be "+newAge);
        }
        catch(NumberFormatException e){
           request.setAttribute("msg", "You must give your current age ");
            
            
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        
    }

}
