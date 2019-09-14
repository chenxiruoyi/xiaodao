<%--
  Created by IntelliJ IDEA.
  User: mingxinwang
  Date: 2019/7/5
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>

    <body>
        <h3>修改用户</h3>
        <form action="/user/updateUser.do" method="post">
            <table border="1" width="60%" cellpadding="0" cellspacing="0" >
                <tr>
                    <td>id</td>
                    <td>姓名</td>
                    <td>生日</td>
                    <td>性别</td>
                    <td>地址</td>
                </tr>

                <tr>
                    <td> <input type="text" name="id" value="${user.userId}" readonly></td>
                    <td> <input type="text" name="username" value="${user.userUsername}"></td>
                    <td> <input type="text" name="birthday" value="${user.userBirthday}"></td>
                    <td> <input type="text" name="sex" value="${user.userSex}"></td>
                    <td> <input type="text" name="address" value="${user.userAddress}"></td>
                </tr>

                <tr>
                    <td colspan="5" align="center">
                        <input type="submit" value="曹尼玛曹尼玛曹尼玛">
                    </td>
                </tr>

            </table>
        </form>
    </body>
</html>
