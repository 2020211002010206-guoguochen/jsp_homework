
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>i am MyJsp.jsp</h4>
<form method="post" action="<%=request.getContextPath()%>/lab2">
    name<input type="text" name="name">
    class<input type="text" name="class">
    ID<input type="text" name="id">
    <input type="submit"  value="Send data to the server">
</form>
</body>
</html>
