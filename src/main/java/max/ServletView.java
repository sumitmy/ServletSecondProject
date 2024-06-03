package max;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/view")
public class ServletView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   PrintWriter out = response.getWriter();
    	   //html in java
    	   EmpDAO empDAO=new EmpDAO();
    	   List<EmpDTO> list = empDAO.vieww();
    	   
    	   out.println("<html><body><table border='3' bgcolor='yellow'>");
    	   out.println("<tr><td>EID</td><td>Name</td><td>Address</td><td>Phone</td></tr>");
	
    	     for(EmpDTO p:list)
    	     {
    	    	 out.println("<tr><td>"+p.getEid()+"</td><td>"+p.getName()+"</td><td>"+p.getAdd()+"</td><td>"+p.getPhone()+"</td></tr>");
    	     }
       
       }

}
