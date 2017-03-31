<%--
  Created by IntelliJ IDEA.
  User: A.A
  Date: 9/29/2016
  Time: 18:04
  To change this template use File | Settings | File Templates.

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome to the System</title>
  </head>
  <body>
   Under Constrution
  </body>
</html>
---%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form method="POST" action="login">
  <h2 class="form-signin-heading"> Access System: </h2>
  <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus=""/>
  <input type="password" class="form-control" name="password" placeholder="Password" required=""/>
  <label class="checkbox">
    <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
  </label>
  <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
  <Br/>${error}
</form>