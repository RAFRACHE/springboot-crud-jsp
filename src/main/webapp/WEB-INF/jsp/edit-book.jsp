<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <%@ page isELIgnored="false" %>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Book Library</title>
</head>
<body>
    <div>
        <h2>Edite Book</h2>
        <div>
            <div>
                <form:form action="${book.id}/update" modelAttribute="book" method="post">
                    <div>
                        <div>
                            Id: ${book.id}
                        </div>
                        <div>
                            <form:label path="author">Author</form:label>
                            <form:input type="text" id="author" path="author"/>
                            <form:errors path="author" />
                        </div>
                        <div>
                            <form:label path="name">Name</form:label>
                            <form:input type="text" id="name" path="name"/>
                            <form:errors path="name" />
                        </div>
                    </div>
                    <div>
                        <div>
                            <input type="submit" value="Update User">
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    </body>
</html>