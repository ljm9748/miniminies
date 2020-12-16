<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setAttribute("userName", "손흥민"); /* 요청을 할 때 생성 */
	application.setAttribute("userId", "1111"); /* 실행 할 때 생성 */
	session.setAttribute("nickName", "Son"); /* 접속했을 때 생성 */
	pageContext.setAttribute("age", 27); /* 현재 페이지가 요청될 때 생성 */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= request.getAttribute("userName")%>,
	<%= application.getAttribute("userId")%>,
	<%= session.getAttribute("nickName") %>,
	<%= pageContext.getAttribute("age") %>
</body>
</html>