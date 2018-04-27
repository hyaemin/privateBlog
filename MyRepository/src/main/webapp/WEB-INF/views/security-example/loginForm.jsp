<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1> My Login Form</h1>


<h1>로그인 하기</h1>
<c:if test="${param.ng!=null}">
     Login NG!<br>
       <c:if test="${SPRING_SECURITY_LAST_EXCEPTION!=NULL}">
          message: ${SPRING_SECURITY_LAST_EXCEPTION.message}
       </c:if>
   </c:if>
   
   <p>
<form action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
  ID : <input type="text" name="username"><br>  <!-- 약속된 키워드 : j_username  , j_password  -->
  PWD : <input type="password" name="password" ><br> 
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
  <input type="submit" value="로그인">
  <input type="reset" value="취소">
</form>


</body>
</html>







