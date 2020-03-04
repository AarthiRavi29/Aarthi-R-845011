package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task2
 */
@WebServlet("/Task2")
public class Task2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		 pw.println("<h1 align=center>Number of user Registered</h1>");
		  pw.println("<hr color=black>");
		  pw.println("<table border=6 bgcolor=MEDIUMSEAGREEN "
		  		+ "align=center bordercolor=red>"
		  		+ "<tr><th>Name</th><th>Dept</th>"
		  		+ "<th>Languages</th></tr>");
		Connection cons;
		try{
			String name=request.getParameter("n1");
			String dept=request.getParameter("d1");
			String lang=request.getParameter("c1");
			
			
		ServletContext con1 = getServletContext();
		String url=con1.getInitParameter("url");
		String user=con1.getInitParameter("user");
		String pwd=con1.getInitParameter("password");
		Class.forName("com.mysql.jdbc.Driver");//if we didnt give this it shows that url doesnt match driver
		cons=DriverManager.getConnection(url,user,pwd);
		  PreparedStatement s = cons.prepareStatement
				  ("insert into emp(name,dept,lang)values(?,?,?)");
		  s.setString(1, name);
		  s.setString(2, dept);
		  
			  s.setString(3, lang);
		
		  
			 ResultSet rs=s.executeQuery("select * from user");
			 pw.println("<br>");
			   while(rs.next())
		 	    {
		 	    pw.println("<tr>");
		 	    pw.println("<td>"+rs.getString(1));
		 	    pw.println("<td>"+rs.getString(2));	
		 	   pw.println("<td>"+rs.getString(3));	
		 	    pw.println("</tr>"); 	 	
		 	    }
			//  pw.println("</table>");
		 	    rs.close();
		 	    s.close();
		 	    cons.close(); 	 	 

	}
		 catch(Exception e)
        {
            pw.println(e);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
