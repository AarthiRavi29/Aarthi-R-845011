<%
String username=(String)
session.getAttribute("SessionUser");
String password=(String)session.getAttribute("SessionPassword");
out.println("<h1>Welcome"+username);
out.println("<h1>Your password:" +password);
session.invalidate();
out.println("<a href=Form.html>Back</a>");
%>

