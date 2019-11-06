<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키 확인</h1>
	<hr>

	${cookie }
	<br> ${cookie.ID }
	<br> ${cookie.ID.value }
	<br>
	<hr>

	<%
		Cookie[] arr = request.getCookies();
		for (int i = 0; i < arr.length; i++) {
	%>
	<%=arr[i].getName()%>
	=
	<%=arr[i].getValue()%><br>
	<%
		}
	%>
	<hr>


	<c:if test="${cookie.showPopup.value ne false }">
		<div>팝업 띄우기</div>
	</c:if>

	<hr>

	<a href="./create"><button>쿠키 생성</button></a><br>
	<a href="./update"><button>쿠키 수정</button></a><br>
	<a href="./delete"><button>쿠키 삭제</button></a><br>
</body>
</html>