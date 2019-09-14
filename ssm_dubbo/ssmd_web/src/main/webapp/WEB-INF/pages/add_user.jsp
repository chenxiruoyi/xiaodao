<%--
  Created by IntelliJ IDEA.
  User: mingxinwang
  Date: 2019/7/4
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>添加用户</title>
    </head>

    <body>
        <h3>添加用户</h3>
        <form action="/user/addUser.do" method="post">
            <table border="1" width="60%" cellpadding="0" cellspacing="0" >
                <tr>
                    <td>姓名</td>
                    <td>生日</td>
                    <td>性别</td>
                    <td>地址</td>
                </tr>

                <tr>
                    <td> <input type="text" name="userUsername"> </td>
                    <td> <input type="text" name="userBirthday"> </td>
                    <td> <input type="text" name="userSex"> </td>
                    <td> <input type="text" name="userAddress"> </td>
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
