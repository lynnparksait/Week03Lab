package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AritheticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("result", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstInt = request.getParameter("fstint");
        String secondInt = request.getParameter("secint");
        
        request.setAttribute("firstInt",firstInt);
        request.setAttribute("secInt",secondInt);
        
        if(firstInt==null || firstInt.equals("")||secondInt==null||secondInt.equals("")){
            request.setAttribute("result","Invalid");
        }
        else{
            
            int firstNum= Integer.parseInt(firstInt);
            int secNum= Integer.parseInt(secondInt);
            int result=0;
            switch(request.getParameter("submit")){
                case"+":
                   result=firstNum+secNum;
                break;
                case"-":
                    result=firstNum-secNum;
                break;
                case"*":
                    result=firstNum*secNum;
                break;
                case"%":
                    result=firstNum/secNum;
                break;
            }
            
            request.setAttribute("result", result);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

 

}
