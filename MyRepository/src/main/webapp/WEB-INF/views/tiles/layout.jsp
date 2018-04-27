<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
   #header{height : 100px; background-color:yellow}
   #content{height : 400px; background-color:gray}
   #footer{height : 100px; background-color:tomato}
</style>
</head>
<body>

<!-- id는 css에서 구분하려고! -->

<div id="header">
   <tiles:insertAttribute name="header"/><!-- 여기에 name은 tilse.xml이랑 매핑임! 위에 id랑은 관계X -->
</div>
<div id="content">
   <tiles:insertAttribute name="content"/>
</div>
<div id="footer">
   <tiles:insertAttribute name="footer"/>
</div>
<!-- 여기까지는 화면 배치만! 그래서 여기에 들어갈 jsp문서이름을 name으로 찾는것! tiles.xml가서 마무리!-->

</body>
</html>