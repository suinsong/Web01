<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@page import="kr.bit.mem.*"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>


	<!--  1~10������ ������ ���Ͽ� ����Ͻÿ� -->

	<%
		Helper h = new Helper();
	%>



	<table border=1>
		<tr>

			<th>1~100������ ������????</th>
			<th><%=h.hap()%></th>
		</tr>

	</table>
	<!--  ȣ���ϸ� �� -->
	<br>


</body>
</html>