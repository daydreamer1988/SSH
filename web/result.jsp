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
    <title>Result</title>
  </head>
  <body>
  <h3>注册成功</h3>
  名字:<s:property value="user.name"/><br>
  密码:<s:property value="user.pwd"/><br>

  <s:property value="result"/>


  </body>
</html>
