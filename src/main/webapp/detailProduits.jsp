<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList, fr.openfoodfacts.model.Produit, fr.openfoodfacts.model.Ingredient"%>
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
		List<Ingredient> listeIng = (List<Ingredient>) request.getAttribute("ingredients");
	
	%>

	<form method="POST"
		action="http://localhost:8080/open-food-facts-web/produit/">
		<div class="form-group col-md-4">
			<label for="inputState">Produit sélectionné</label> <ul>
				<%
				for (Produit prod : listePro) {
				%>

				<li>ID :  <%=prod.getId()%></li>
				<li>Nom : <%=prod.getNom()%></li>
				<li>Catégorie : <%=prod.getCategorie()%></li>
				<li>Marque : <%=prod.getMarque()%></li>
				<li>Grade nutritionnel :  <%=prod.getGradeNutritionnnel()%></li>
				<li>Energie :  <%=prod.getEnergie()%></li>
				<li>Graisse :  <%=prod.getGraisse()%></li>

				<%
					}
				%>

			</ul>
			<br>
		</div>
		
		<div class="form-group col-md-4">
			<label for="inputState">Ingrédients</label> <ul>
				<%
				for (Ingredient ingr : listeIng) {
				%>

					<li><%=ingr.getNom()%></li>
				
				<%
					}
				%>

			</ul>
			<br>
		</div>

		
	</form>
	
</body>

</html>