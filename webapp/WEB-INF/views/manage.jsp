<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="APP_PATH" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${APP_PATH }/static/bootstrap-3.3.7/css/bootstrap.min.css" />
</head>
<body>
	<button class="btn btn-success">MANAGE</button>
	<script type="text/javascript" src="${APP_PATH }/static/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${APP_PATH }/static/bootstrap-3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(function(){
			alert(1);
		});
	</script>
</body>
</html>