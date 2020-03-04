

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form1_another
 */
public class Form1_another extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form1_another() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("pwd");
		String[] lang=request.getParameterValues("c1");
		out.println("<h1> Name:"+name);
		//out.println("<h1>" +password);
		out.println("<h1> Language: ");
		for(int i=0;i<lang.length;i++){
			out.println(lang[i]+ String.join(","));
		}
		out.println("<h1> Qualification: ");
		String[] qualify=request.getParameterValues("s1");
		for(int i=0;i<qualify.length;i++){
			out.println(qualify[i]+String.join(","));
		}
		}
	}


