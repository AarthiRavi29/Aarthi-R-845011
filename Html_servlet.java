

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Html_servlet
 */
public class Html_servlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Html_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	String name=request.getParameter("name");
	String password=request.getParameter("pwd");
	String[] lang=request.getParameterValues("c1");
	out.println("<h1> Name:"+name);
	//out.println("<h1>" +password);
	out.println("<h1> Language: ");
	for(int i=0;i<lang.length;i++){
		out.println(lang[i]);
	}
	out.println("<h1> Qualification: ");
	String[] qualify=request.getParameterValues("s1");
	for(int i=0;i<qualify.length;i++){
		out.println(qualify[i]);
	}
	}

}
