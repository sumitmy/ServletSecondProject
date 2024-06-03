package max;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ok")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	String n=request.getParameter("name");
	String ad=request.getParameter("add");
	String p=request.getParameter("phone");
	EmpBean e= new EmpBean();
	e.setAdd(ad);
	e.setName(n);
	e.setPhone(p);
	 if(new EmpBO().getEmp(e))
	{
		out.println("success");
	}
  else
  {
	  out.println("Fail"); 
  }
	}

}
