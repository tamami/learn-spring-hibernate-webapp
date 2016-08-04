<%@ page language="java" contentType="text/html; charset="utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Halaman Konfirmasi Registrasi</title>
</head>
<body>
  message : ${success}
  <br />
  <br />
  Go back to <a href="<c:url value='/list' />">Daftar SPPT</a>
</body>
</html>
