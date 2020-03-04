<body bgcolor=yellow>
<jsp:declaration>
int a1=100;
int add(int n,int m)
{
	return n+m;
}
</jsp:declaration>
<h1>
<jsp:scriptlet>
out.println("Inside Scriplets Add: "+add(10,10));
</jsp:scriptlet>
</h1>
<br>
<h1>
<jsp:expression>
"ADD :"+add(10,20)</jsp:expression>
</h1>
</body>