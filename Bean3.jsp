<body bgcolor="grey"text="pink">
<h1>JAVA Bean Details:</h1>
<jsp:useBean id="b1" class="com.test.Product" scope="session" />
<h1>
<jsp:getProperty name="b1" property="productno" />
<jsp:getProperty name="b1" property="productname" />
</h1>