<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
	<jsp:include page="css\StyleSheetLogin.css"></jsp:include>
</style>

</head>
<body>

	<jsp:include page="Menu.html"></jsp:include>

	<div class="full-height-container">
		<div class="container">
			<div class="left-panel">
				<div class="texto-superpuesto">
					<h1 class="text-6xl font-bold">Bienvenido</h1>
				</div>
			</div>
			<div class="right-panel">
				<h2>Inicie sesión</h2>
				<form action="ServletLogin" method="post">
					<div class="form-group"
						style="display: flex; align-items: center; gap: 5px;">
						<label for="usuario"
							style="white-space: nowrap; width: 150px; text-align: right;">Usuario</label>
						<input type="text" id="usuario" name="usuario" required value="<%= request.getParameter("usuario") != null ? request.getParameter("usuario") : "" %>"
							style="flex: 1;">
					</div>

					<div class="form-group"
						style="display: flex; align-items: center; gap: 5px;">
						<label for="contrasena"
							style="white-space: nowrap; width: 150px; text-align: right;">Contraseña</label>
						<input type="password" id="contrasena" name="contrasena" required
							style="flex: 1;">
						<%
							String mensaje = "";
							if (request.getAttribute("mensajeError")!=null){
								mensaje = request.getAttribute("mensajeError").toString();
							}	 
						%>
						
					</div>
					<label style="text-align: right;" class="error-message"><%=mensaje%></label>
					<button type="submit" name="btnIniciarSesion">Iniciar Sesión</button>

				</form>
			</div>
		</div>
	</div>

</body>
</html>

