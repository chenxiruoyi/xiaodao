<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
    <a href="/user/toAddUser.do"> <span style="color: cadetblue; font-size:24px">添加</span> </a> <br /><br />
    <%-- 查询所有的用户数据--%>
    <table border="1" width="60%" cellpadding="0" cellspacing="0" >
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>生日</td>
            <td>性别</td>
            <td>地址</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.userId}</td>
                <td>${user.userUsername}</td>
                <td>${user.userBirthday}</td>
                <td>${user.userSex}</td>
                <td>${user.userAddress}</td>
                <td>
                    <a href="/user/deleteUser.do?id=${user.userId}"><span style="color: deeppink; font-size:16px"> 删除 </span></a>&nbsp;&nbsp;
                    <a href="/user/toUpdate.do?id=${user.userId}"><span style="color: lightblue; font-size:16px"> 修改 </span></a>
                </td>
            </tr>
        </c:forEach>

    </table>

    </body>
</html>
