<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Austin
  Date: 2018/7/19
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>MainPage</title>
  </head>
  <body>
  <s:form action="regist" method="POST" theme="simple" namespace="/">
    姓名:<input name="name" type="text"/><br>
    密码:<input name="pwd" type="password"/><br>
    <input type="submit" value="注册"/>
  </s:form>
  </body>
</html>
