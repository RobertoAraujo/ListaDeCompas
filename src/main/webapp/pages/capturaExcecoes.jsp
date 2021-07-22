<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<input id="url" name="url" value="<%= request.getParameter("url")%>">

	<!-- Script de alerta -->
	<input type="text" placeholder="Digite um texto aqui" id="Alert">
	<input type="button" onclick="Captura();" value="Enviar">
	
	<script type="text/javascript">
		function Captura() {
			valorInformado = $('#Alert').val();
			
			$.ajax({
				method:"POST",
				url:"capturaExecoes", // PARA QUAL SERVELT?
				data:{valorParam : valorInformado}
			})
			.done(function (response) {// SEMPRE CAPTA O RETORNO
				alert("Sucesso: " + response);
			})
			.fail(function (xhr, status , errorThrown) {// SEMPRE CAPTA O RETORNO - algum problema
				alert("Opa Error:" + xhr.responseText);
			});
			
		}
	</script>
</body>
</html>