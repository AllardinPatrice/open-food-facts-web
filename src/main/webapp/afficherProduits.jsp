<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList, fr.openfoodfacts.model.Produit"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produits</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script>
	function chargerMarques() {

	}
</script>

</head>

<body>
	<%
		List<Produit> listePro = (List<Produit>) request.getAttribute("produits");
	%>

	<form method="POST"
		action="http://localhost:8080/open-food-facts-web/produit/">
		<div class="form-group col-md-4">
			<label for="inputState">Produits</label>

			<table class="table">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Nom de produit</th>
						<th scope="col">Catégorie</th>
						<th scope="col">Marque</th>
						<th scope="col">Grade nutritionnel</th>
						<th scope="col">Energie</th>
						<th scope="col">Graisse</th>
					</tr>
				</thead>
				<tbody>


					<%
						for (Produit prod : listePro) {
					%>
					<tr>
						<td><%=prod.getId()%></td>
						<td><%=prod.getNom()%></td>
						<td><%=prod.getCategorie()%></td>
						<td><%=prod.getMarque()%></td>
						<td><%=prod.getGradeNutritionnnel()%></td>
						<td><%=prod.getEnergie()%></td>
						<td><%=prod.getGraisse()%></td>
					</tr>
					<%
						}
					%>

	</form>




</body>

</html>