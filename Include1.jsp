<body bgcolor="yellow" text="red">
<%@ include file="Samplejsp.jsp" %>
<jsp:include page="Inc1.jsp"/>
<jsp:include page="Inc1.jsp">
<jsp:param value="Cts" name="Company"/>
<jsp:param value="9.00A.M-6.00P.M" name="Time"/>
</jsp:include>
</body>