<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body style="text-align: center;">
	<h3>Seja bem vindo a tela de login !</h3>
	<hr>
	<div
		style="width: 100vw; height: 100vh; background: #6C7A89; display: flex; flex-direction: row; justify-content: center; align-items: center;">
		<form action="SeleveteValidar" method="POST">
		
			<input id="url" name="url" value="<%= request.getParameter("url")%>">
			
			<table
				style="border: solid 1px; width: 30vw; height: 50vh; border-radius: 15px;">
				<tr>
					<td>Login de Autenticação</td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Entre com Usuario"
						id="usuario" name="usuario"></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Entre com Senha"
						id="senha" name="senha"></td>
				</tr>
				<tr>
					<td><a href="pages/Painel.jsp"><button>enviar</button> </a></td>
				</tr>
			</table>
		</form>
	</div>
	<hr>
</body>
</html>