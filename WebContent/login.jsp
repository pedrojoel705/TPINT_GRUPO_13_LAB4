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
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	margin: 0;
	padding: 0;
}

.full-height-container {
	display: flex;
	justify-content: center;
	align-items: center;
	height: calc(100vh - 70px); /* resta la altura del menú */
}

.container {
	display: flex;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	overflow: hidden;
	width: 1500px;
	height: 800px;
}

.left-panel {
	flex: 1;
	background-image: url('img/fondoLogin.jpg');
	background-size: cover;
	background-position: center;
	position: relative;
}

.texto-superpuesto {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: black;
	text-align: center;
}

.right-panel {
	flex: 1;
	padding: 10px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

h2 {
	margin-bottom: 30px;
	font-size: 2em;
	color: #333;
	text-align: center;
}

.form-group {
	margin-bottom: 20px;
	width: 100%;
}

.form-group label {
	display: block;
	margin-bottom: 8px;
	font-weight: bold;
	color: #555;
}

.form-group input[type="text"], .form-group input[type="password"] {
	width: 100%;
	padding: 12px 10px;
	border: 2px solid #6a0dad;
	border-radius: 5px;
	font-size: 1em;
	box-sizing: border-box;
}

button {
	width: 100%;
	padding: 15px;
	background-color: #6a0dad;
	color: white;
	border: none;
	border-radius: 5px;
	font-size: 1.1em;
	cursor: pointer;
	transition: background-color 0.3s ease;
	margin-bottom: 20px;
}

button:hover {
	background-color: #5a099a;
}
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
				<form action="login" method="post">
					<div class="form-group"
						style="display: flex; align-items: center; gap: 5px;">
						<label for="usuario"
							style="white-space: nowrap; width: 150px; text-align: right;">Usuario</label>
						<input type="text" id="usuario" name="usuario" required
							style="flex: 1;">
					</div>

					<div class="form-group"
						style="display: flex; align-items: center; gap: 5px;">
						<label for="contrasena"
							style="white-space: nowrap; width: 150px; text-align: right;">Contraseña</label>
						<input type="password" id="contrasena" name="contrasena" required
							style="flex: 1;">
					</div>

					<button type="submit">Iniciar Sesión</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>

