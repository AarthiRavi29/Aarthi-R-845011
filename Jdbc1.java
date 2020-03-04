

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jdbc1
 */
public class Jdbc1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jdbc1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			 PrintWriter pw = response.getWriter();
			 pw.println("<h1 align=center>Viewing "
			    		+ "the Records</h1>");
			  pw.println("<hr color=red>");
			  pw.println("<table border=6 bgcolor=pink "
			  		+ "align=center bordercolor=red>"
			  		+ "<tr><th>Eno</th><th>Name</th>"
			  		+ "<th>Salary</th></tr>");
			  try
		 	  {
		 		  Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/test","root","chillers@12");
		 	     Statement s = con.createStatement();
		 ResultSet rs=s.executeQuery("select * from emp1");
		   while(rs.next())
	 	    {
	 	    pw.println("<tr>");
	 	    pw.println("<td>"+rs.getString(1));
	 	    pw.println("<td>"+rs.getString(2));
	 	    pw.println("<td>"+rs.getString(3)); 	  
	 	    pw.println("</tr>"); 	 	
	 	    }
		  pw.println("</table>");
	 	    rs.close();
	 	    s.close();
	 	    con.close(); 	 	 

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
		doGet(request, response);
	}

}
