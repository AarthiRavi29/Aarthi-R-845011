<%@page
import="java.sql.*,java.util.*"
language="java"
info="Simple JSP Page"
buffer="1kb" autoFlush="false" 
contentType="text/html"%>

<jsp:directive.page import="com.test.Product"/>

<%
out.println("<h1>Date:"+new java.util.Date());
out.println("<h1>Sqrt(25): "+Math.sqrt(25));
Product obj=new Product();
obj.setProductno(1001);
obj.setProductname("Dell Laptop");
out.println("View:"+obj.getProductno()
+ " "+obj.getProductname());
%>