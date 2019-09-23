<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center">
<h1>Adicionar Pokemon</h1>
	<form action='addPokemon' method='post'>
		<b>Nome:</b> 
		<input name='nome' required><br />
		<b>CP: </b>
		<input name='cp' type='number' required><br />
		<b>Ataque: </b>
		<input type='number' name='ataque' required><br />
		<b>Defesa: </b>
		<input type='number' name='defesa' required><br />
		<b>Vida: </b>
		<input type='number' name='vida' required><br />
		<b>Tem Evolução: </b>
		<input type='checkbox' name='temevolucao'><br />
		<input type='submit'>
	</form>
</body>
</html>