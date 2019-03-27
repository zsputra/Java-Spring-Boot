<html>
    <head>
    <title>
        Users
    </title>
    </head>

    <body>
        <table>
        <thead>
            <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pengguna}" var = "user">
                <tr>
                    <td>${user.id}<td>
                    <td>${user.name}<td>
                    <td>${user.email}<td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>