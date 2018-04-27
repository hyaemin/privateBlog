<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.1.1.min.js"></script>

<script type="text/javascript">
   $(function(){
	   $("#loadBtn").click(function(){
		   $("#display").load("../load");//인수 load는 요청정보(RequestMapping찾기)
	   });
	   
   });
 </script>
 
 
</head>
<body>
<h1>user의 board</h1>
<h1><a href="${pageContext.request.contextPath}"> index</a></h1>

<input type="button" value="load함수" id="loadBtn">
<input type="button" value="ajax함수" id="ajaxBtn">
<input type="button" value="json결과" id="jsonBtn">

<input type="button" value="jackson결과" id="jackson">
<input type="button" value="jackson결과(여러개)" id="jackson2">


<hr>
<div id="display"></div>




</body>
</html>