<%--
  Created by IntelliJ IDEA.
  User: xiangang
  Date: 16/11/17
  Time: 上午10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息管理系统</title>
</head>
<body>
  <div>
      <form action="user" method="post">
          <table>
              <tr>
                  <td>用户名:</td>
                  <td><input type="text" name="userName" /></td>
              </tr>
              <tr>
                  <td>密  码:</td>
                  <td><input type="password" name="password" /></td>
              </tr>
              <tr>
                  <td><input type="submit" value="提交" /></td>
                  <td><input type="reset" value="重置" /></td>
              </tr>
          </table>
      </form>
      <a href="registation.jsp">注册!</a>
  </div>
</body>
</html>
