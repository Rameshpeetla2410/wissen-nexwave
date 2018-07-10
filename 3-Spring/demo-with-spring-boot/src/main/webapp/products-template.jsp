<!DOCTYPE html >
<%@page import="com.example.demo.model.Product"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>products</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body class="container">

	<hr />
	<h1>JSP - HTML - UI</h1>
	<hr />

	<table class="table table-sm table-bordered">
		<%
			List<Product> products = (List<Product>) request.getAttribute("allProducts");
			for (Product product : products) {
		%>

		<tr>
			<td><%=product.getName()%></td>
			<td><%=product.getPrice()%></td>
		<tr>

			<%
				}
			%>
		
	</table>

</body>
</html>