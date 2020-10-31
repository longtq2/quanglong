<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
		td, th, tr {
			border: solid 1px black;
		}
	</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>No.</th>
				<th>id</th>
				<th>name</th>
				<th>price</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var= "element" items ="${list}" varStatus="status">
				<tr>
					<td>
						<c:out value ="${status.count}"/>
					</td>
					<td>
						<c:out value ="${element.id}"/>
					</td>
					<td>
						<c:out value ="${element.name}"/>
					</td>
					<td>
						<c:out value ="${element.price}"/>
					</td>
					<td><a href="#">Edit</a> <a href="#">Delete</a></td>
				</tr>
				
			</c:forEach>
		</tbody>
	</table>
</body>
</html>