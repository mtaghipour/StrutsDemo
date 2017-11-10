<%--
  Created by IntelliJ IDEA.
  User: mtaghipour
  Date: 11/9/17
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Protein Page</title>
</head>
<body>

<h1>Enter Struts</h1>

<s:form>
    <s:textfield name="enteredProtein"/>
    <s:submit value="Enter"/>
</s:form>

<div>
    Last amount entered : <s:property value="enteredProtein"/>
</div>

<div>
    <%-- This will search for getGoalText method --%>
    <s:property value="goalText"/>
</div>

</body>
</html>
