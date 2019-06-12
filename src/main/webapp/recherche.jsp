<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList, fr.openfoodfacts.model.Categorie, fr.openfoodfacts.model.Marque"%>
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
		document.location.href = "http://localhost:8080/open-food-facts-web/refreshMarques?idCateg="
				+ document.forms[0].selectedCateg.value;
	}
</script>

</head>

<body>
	<%
		List<Categorie> listeCat = (List<Categorie>) request.getAttribute("cat1");
		List<Marque> listeMarque = (List<Marque>) request.getAttribute("mar1");
		Integer selectedCat = (Integer) request.getAttribute("selectedCat");
		Boolean affMarques = (Boolean) request.getAttribute("affMarques");
	%>
	<script>console.log(<%=selectedCat%>);</script>
	<form method="POST"
		action="http://localhost:8080/open-food-facts-web/rechercher/">
		<div class="form-group col-md-4">
			<label for="inputState">Choisissez une catégorie</label> <select
				id="selectedCateg" class="form-control" onchange="chargerMarques()"
				name="selectedCateg">
				<%
					for (Categorie categ : listeCat) {
						if (selectedCat!=null && selectedCat==categ.getId()) {
							%>
				<option value=<%=categ.getId()%> selected>
							<%=categ.getNom()%></option>
							<%
						} else {
				%>
				<option value=<%=categ.getId()%>>
					<%=categ.getNom()%></option>


				<%
						}
					}
				%>

			</select> <br>

			<%
				if (affMarques) {
					%>
			<label for="marqueState">Choisissez une marque</label> <select
				id="selectedMarque" class="form-control" onchange="" name="selectedMarque">
				<%
					for (Marque marq : listeMarque) {
				%>

				<option value=<%=marq.getId()%>>
					<%=marq.getNom()%></option>

				<%
					}
				%>

			</select>


			<%
					
				}
			%>

			<br>
			<button type="submit" class="btn btn-primary">Rechercher</button>
	</form>


</body>

</html>