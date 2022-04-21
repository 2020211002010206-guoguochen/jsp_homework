<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 4/5/2021
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp"%>
<h1> Login</h1>
<%
    if(!(request.getAttribute("message")==null)){

        //error
        out.println(request.getAttribute("message"));
    }
%>

<%
    Cookie[] allCookies = request.getCookies();
    String username = "",password = "",rememberMeval = "";
    if(allCookies!=null){
        for(Cookie c:allCookies){
            if(c.getName().equals("cUsername")){
                username = c.getValue();
            }
            if(c.getName().equals("cPassword")){
                password = c.getValue();
            }
            if(c.getName().equals("cRememberMe")){
                rememberMeval = c.getValue();
            }
        }
    }
%>

<form method="post" action="login"><!-- go to controller -->
    Username : <input type="text" name="username" value="<%=username%>"><br/>
    Password : <input type="password" name="password" value="<%=password%>"><br/>
    <input type="checkbox" naem="rememberMe" value="1" <%=rememberMeval.equals("1")?"checked":""%>checked/>RememberMe<br/>
    <input type="submit" value="Submit"/>
</form>
<%@include file="footer.jsp"%>