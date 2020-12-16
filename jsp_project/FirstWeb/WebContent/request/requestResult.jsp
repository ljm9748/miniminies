<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Result</title>
</head>
<body>

	<h1>Request Result</h1>
	<hr>

	<table>
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("userName") %></td>
			<!-- 유효성 검사가 필요할 경우 id를 필수로 설정해야 한다. -->
		</tr>
		<tr>
			<td>직업</td>
			<td><%= request.getParameter("job") %></td>
		</tr>
		<tr>
			<td>관심사</td>
			<td>
				<%
					String[] interests = request.getParameterValues("interest");
					
					for(int i=0; i<interests.length; i++){
						out.println(interests[i]+"<br>");
					}
				%> <!--여러개(배열)로 값을 받아와야 할 경우 -> getParameterValues(name)  -->
			</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
	</table>

</body>
</html>