<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1><a href="${pageContext.request.contextPath}"> index</a></h1>


<h1>login.jsp</h1>
<c:choose>
  <c:when test="${not empty pageContext.request.userPrincipal}"> <p>
    USER ID : ${pageContext.request.userPrincipal.name}님 로그인중....<p>
    
     <form action="${pageContext.request.contextPath}/j_spring_security_logout" method="post">
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      <input type="submit" value="로그아웃">
     </form>
  </c:when>
  <c:otherwise>
     Log-Out 상태입니다. <p>
  </c:otherwise>
</c:choose>

<hr>



</body>
</html>


