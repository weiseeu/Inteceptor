<%--
  Created by IntelliJ IDEA.
  User: xiangang
  Date: 16/11/18
  Time: 上午9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面!</title>
</head>
<body>
<div>
    <form action="register" method="post">
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
</div>

</body>
</html>
