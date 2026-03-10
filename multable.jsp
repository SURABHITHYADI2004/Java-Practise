<%@ page language="java" %>

<jsp:useBean id="t" class="com.demo.bean.TableBean"/>

<%
int number = Integer.parseInt(request.getParameter("num"));
t.setNum(number);
%>

<!DOCTYPE html>
<html>
<head>
<title>Table Result</title>
<link rel="stylesheet" href="table.css">
</head>

<body>

<h2>Multiplication Table</h2>

<table>

<tr>
<th>Expression</th>
<th>Result</th>
</tr>

<%
for(int i=1;i<=10;i++){
%>

<tr>
<td><%= t.getNum() %> x <%= i %></td>
<td><%= t.getResult(i) %></td>
</tr>

<%
}
%>

</table>

<br>
<a href="multable.html">Back</a>

</body>
</html>