<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList, fr.openfoodfacts.model.Categorie"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recherche</title>

<script>
function chargerMarques() {
	
}
</script>

</head>

<body>
	<%
		List<Categorie> listeCat = (List<Categorie>) request.getAttribute("cat1");
	
	%>
	<form method="POST" action="http://localhost:8080/open-food-facts-web/rechercher/">
	Choisissez une catégorie
	<select onchange="/chargerMarques()" name="selectedCateg">
		<%
			for (Categorie categ : listeCat) {
		%>

		<option value=<%=categ.getId()%>>
			<%=categ.getNom()%></option>

		<%
			}
		%>

	</select>
	<input type="submit" value="Rechercher" name="Rechercher">
	</form>
	
	
</body>

</html>