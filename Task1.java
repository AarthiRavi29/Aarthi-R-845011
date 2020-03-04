package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task1
 */
@WebServlet("/Task1")
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Connection cons;
		try{
		ServletContext con1 = getServletContext();
		String url=con1.getInitParameter("url");
		String user=con1.getInitParameter("user");
		String pwd=con1.getInitParameter("password");
		Class.forName("com.mysql.jdbc.Driver");//if we didnt give this it shows that url doesnt match driver
		cons=DriverManager.getConnection(url,user,pwd);
		  Statement s = cons.createStatement();
			 ResultSet rs=s.executeQuery("select * from studet");
			   while(rs.next())
		 	    {
		 	    pw.println("<tr>");
		 	    pw.println("<td>"+rs.getString(1));
		 	    pw.println("<td>"+rs.getString(2));	  
		 	    pw.println("</tr>"); 	 	
		 	    }
			  pw.println("</table>");
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
