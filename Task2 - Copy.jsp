<body bgcolor="MEDIUMSEAGREEN" >

<% 
out.println("Session Object: "+session);
String name=request.getParameter("n1");
String dept=request.getParameter("d1");
out.println("<h1> Name:"+name);
out.println("<h1> Dept:"+dept);
out.println("<h1> Language: ");
String[] lang=request.getParameterValues("c1");
for(int i=0;i<lang.length;i++){
	out.println(lang[i]);
}
%>
<input type="submit" value="Database">
</body>