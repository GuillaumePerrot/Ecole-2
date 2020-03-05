<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Ecole/ajoutlieux" method="post">
<div>
<label> Entrez le numéro ID de la formation </label>
<input type="number" name="idLieu" placeholder="saisir l'Id de la formation">
</div>
<div>
<label> Entrez l'adresse de la formation </label>
<input type="text" name="adresse" placeholder="saisir l'adresse de la formation">
</div>
<div>
<label> Entrez la ville de la formation </label>
<input type="text" name="ville" placeholder="saisir la ville de la formation">
</div>
<div>
<input type="submit" value="valider">
</div>
</form>
</body>
</html>