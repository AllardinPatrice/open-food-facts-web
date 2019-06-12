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
			<label for="inputState">Choisissez un produit</label> <select
				id="inputState" class="form-control" name="selectedProd">
				<%
				for (Produit prod : listePro) {
				%>

				<option value=<%=prod.getId()%>>
					<%=prod.getNom()%></option>

				<%
					}
				%>

			</select>
			<br>
			<button type="submit" class="btn btn-primary">Sélectionner</button>
	</form>
	
</body>

</html>