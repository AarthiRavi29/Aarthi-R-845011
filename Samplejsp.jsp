<body bgcolor=yellow>
<%!
int a1=100;
int add(int n,int m)
{
	return n+m;
}
%>
<%!
int sub(int n, int m){
return n-m;
}
%>
<%
int a=200;
out.println("<h1>Hello JSP");
out.println("<br> a = "+a +" a1 = "+a1);
out.println("<br> Inside Scriplets Add: "+add(10,10));
%>
<%
out.println("<br> sub: "+sub(10,5));
%>
<h1>expression Tag</h1>
<br>
<h1>
Add:<%=12+12 %>
<br>
ADD Method:<%=add(10,50) %>
</h1>
<form>
Eno:<input type="text" name="e1"><br>
Name:<input type="text" name="n1"><br>
<input type="submit" value="SignIn">
</form>
</body>