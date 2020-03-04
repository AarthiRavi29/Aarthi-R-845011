<body bgcolor="orange" text="brown">
<h1>Java bean Details:</h1>
<jsp:useBean id="b1" class="com.test.Product" scope="session" />
<jsp:setProperty name="b1" property="*"/>
<h1>
<jsp:getProperty property="productno" name="b1"/>
<jsp.getProperty property="productname" name="b1"/>
<h1>
Pno:
<%=b1.getProductno() %>
<%=b1.getProductname() %></h1>
</h1>
</body>
