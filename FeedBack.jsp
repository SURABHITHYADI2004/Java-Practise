<jsp:useBean id="f" class="com.demo.bean.FeedBackBean"/>

<jsp:setProperty name="f" property="*"/>

<html>
<head>
<title>Feedback Result</title>
<link rel="stylesheet" href="FeedBack.css">
</head>

<body>

<div class="container">

<h2>Student Feedback Submitted</h2>

<p><b>Name:</b> <jsp:getProperty name="f" property="name"/></p>

<p><b>Roll Number:</b> <jsp:getProperty name="f" property="roll"/></p>

<p><b>Department:</b> <jsp:getProperty name="f" property="department"/></p>

<p><b>Gender:</b> <jsp:getProperty name="f" property="gender"/></p>

<p><b>Teaching Quality:</b> <jsp:getProperty name="f" property="teaching"/></p>

<p><b>Comments:</b> <jsp:getProperty name="f" property="comments"/></p>

</div>

</body>
</html>