<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Formulaire</title>
</head>
<body>
<form action="/Ecole/ajoutformation" method="post">
<div>
<label> Entrez le numéro ID de la formation </label>
<input type="number" name="idFormation" placeholder="saisir l'Id de la formation">
</div>
<div>
<label> Entrez le thème formation </label>
<input type="text" name="theme" placeholder="saisir le thème de la formation">
</div>
<div>
<input type="submit" value="valider">
</div>
</form>
</body>
</html>