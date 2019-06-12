<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"
	import="java.util.List, java.util.ArrayList, fr.openfoodfacts.model.Produit"%>
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
		List<Produit> listePro = (List<Produit>) request.getAttribute("produits");
	
	%>
	Choisissez un produit
	<select onchange="">
		<%
			for (Produit prod : listePro) {
		%>

		<option>
			<%=prod.getNom()%></option>

		<%
			}
		%>

	</select>
	
	
</body>

</html>