<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList, fr.openfoodfacts.model.Categorie"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recherche</title>
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
		List<Categorie> listeCat = (List<Categorie>) request.getAttribute("cat1");
	%>
	<form method="POST"
		action="http://localhost:8080/open-food-facts-web/rechercher/">
		<div class="form-group col-md-4">
			<label for="inputState">Choisissez une catégorie</label> <select
				id="inputState" class="form-control" onchange="/chargerMarques()"
				name="selectedCateg">
				<%
					for (Categorie categ : listeCat) {
				%>

				<option value=<%=categ.getId()%>>
					<%=categ.getNom()%></option>

				<%
					}
				%>

			</select>
			<br>
			<button type="submit" class="btn btn-primary">Rechercher</button>
	</form>


</body>

</html>