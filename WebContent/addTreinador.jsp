<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Adicionar Treinador</h1>
	<form action='addTreinador' method='post'>
		<b>Nome:</b> 
		<input name='nome' required><br />
		<b>Cidade:</b>
		<input name='cidade' required><br />
		<b>Nivel: </b>
		<input type='number' name='nivel' required><br />
		<b>Mestre de Ginázio: </b>
		<input type='checkbox' name='mestreginasio'><br />
		<b>Quantidade de Insignia: </b>
		<input type='number' name='qntinsignia' required><br />
		<input type='submit'>
	</form>
</body>
</html>