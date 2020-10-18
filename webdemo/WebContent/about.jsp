<%@page import="java.util.List"%>
<%@page import="com.vn.entities.NhanVien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hello
	<% 
    List<NhanVien> list = (List<NhanVien>)request.getAttribute("name");
    out.print("<html>");
    out.print("<body>");
    out.print("<a href='http://google.com'>Google.com</a>");
    for(NhanVien nhanVien : list){
    	  out.print("<p href='http://google.com'>"+ nhanVien.getTenNhanVien() +"</a>");
    }
    out.print("</body>");
    out.print("</html>");
    
		
		request.setAttribute("msgList", list);
    %>
</body>
</html>