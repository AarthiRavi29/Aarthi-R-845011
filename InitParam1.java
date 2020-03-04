

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParam1
 */
public class InitParam1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.print("<h1>InitParameters Names are:");
		Enumeration enumeration = getServletContext().getInitParameterNames();//enumeration is like legacy
		while(enumeration.hasMoreElements()){
			out.print(enumeration.nextElement());
		}
		ServletContext con1 = getServletContext();//con1 is refernce variable 
		out.println("<h1>Company:"+con1.getInitParameter("Company"));
		out.println("Venue:"+con1.getInitParameter("Venue"));
		out.println("Training:"+con1.getInitParameter("Training"));
		
		out.println("<h1>Company:"+getServletContext().getInitParameter("Company"));
		out.println("Venue:"+getServletContext().getInitParameter("Venue"));
		out.println("Training:"+getServletContext().getInitParameter("Training"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
