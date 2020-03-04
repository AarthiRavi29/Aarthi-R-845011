<body bgcolor="pink" text="blue">
<h1>Java bean Details</h1>
<jsp:useBean id="s1"
class="com.test.Product" scope="request"/>
<jsp:setProperty property="productno" name="s1" value="1001"/>
<jsp:setProperty property="productname" name="s1" value="Dell Laptop"/><h1>
Pno:<jsp:getProperty name="s1" property="productno"/>
Pname:<jsp:getProperty name="s1" property="productname"/></h1></body>