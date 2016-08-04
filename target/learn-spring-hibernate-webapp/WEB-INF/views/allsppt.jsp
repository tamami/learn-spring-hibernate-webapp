<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset="utf-8">
    <title>Sppt Terhutang</title>
    <style>
      tr:first-child {
        font-weight: bold;
        background-color: #C6C9C4;
      }
    </style>
  </head>
  <body>
    <h2>Daftar SPPT</h2>
    <table>
      <tr>
        <td>NOP</td>
        <td>TAHUN PAJAK</td>
        <td>NAMA WP</td>
        <td>ALAMAT OP</td>
        <td>POKOK</td>
        <td>DENDA</td>
        <td>
      </tr>
      <c:forEach items="${daftarSppt}" var="sppt">
        <tr>
          <td>${sppt.pk.nop}</td>
          <td>${sppt.pk.thn}</td>
          <td>${sppt.nama}</td>
          <td>${sppt.alamatOp}</td>
          <td>${sppt.pokok}</td>
          <td>${sppt.denda}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
