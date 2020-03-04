<body bgcolor="grey"text="pink">
<h1>JAVA Bean Details:</h1>
<jsp:useBean id="b1" class="com.test.Product" scope="session" />
<jsp:setProperty property="productno" name="b1" param="a1"/>
<jsp:setProperty property="productname" name="b1" param="c1"/>
<h1>Pno:
<jsp:getProperty name="b1" property="productno" />//name is obj
</h1>
<h1>Pname:
<jsp:getProperty name="b1" property="productname" />
</h1>
<a href="Bean3.jsp">Next Page</a>
</body>
