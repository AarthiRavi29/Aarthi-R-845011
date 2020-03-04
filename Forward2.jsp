<%
if((request.getParameter("a1")).equals("Aarthi"))
{
%>
<jsp:forward page="For1.jsp">
<jsp:param value="**Welcome**" name="user"></jsp:param>
</jsp:forward>
<%
}
else
{
%>
<jsp:forward page="For2.jsp">
<jsp:param value="Invalid User" name="user1"/>
</jsp:forward>
<%
}
%>