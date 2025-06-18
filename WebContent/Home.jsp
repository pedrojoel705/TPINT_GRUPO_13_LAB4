<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
<style type="text/css">
	<jsp:include page="css\StyleSheet.css"></jsp:include>
</style>

<title>Home</title>

</head>
<body>

<jsp:include page="Menu.html"></jsp:include>

<div class="encabezado"></div>

<div class="parteIzq">

		<div class="menu">
					<ul>
						<li><a href="login.jsp">Iniciar sesión</a></li>
						<li><a href="Home.jsp?vista=cliente">Cliente</a></li>	
						<li><a href="Home.jsp?vista=prestamos">Prestamos</a></li>
						<li><a href="Home.jsp?vista=tranferencia">Tranferencias</a></li>
					</ul>
		</div>

</div>
<div class="parteDer"> 

<%
    String vista = request.getParameter("vista");
    if ("cliente".equals(vista)) {
%>
    <jsp:include page="Vistas\VistaCliente.jsp"></jsp:include>
<%
    } else if ("prestamos".equals(vista)) {
%>
    <jsp:include page="Vistas\VistaPrestamos.jsp"></jsp:include>
<%
    } else if ("tranferencia".equals(vista)) {
%>
    <jsp:include page="Vistas\VistaTranferencia.jsp"></jsp:include>
<%
    }else if (request.getParameter("vista") == null || request.getParameter("vista").isEmpty()) {
%>
     <h2> Bienvenido a tu banco, que te banca! </h2>
<%
     }
%>

</div>

</body>
</html>