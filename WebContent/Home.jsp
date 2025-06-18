<<<<<<< HEAD
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
<<<<<<< HEAD
_
<title>Home</title>

</head>
<body>--
=======

<title>Home</title>

</head>
<body>

>>>>>>> 3028d39 (ultimos cambios)
<jsp:include page="Menu.html"></jsp:include>

<div class="encabezado"></div>

<<<<<<< HEAD
<div class="d-none d-lg-block bg-dark text-white position-fixed h-100" style="width: 250px;">
  <h4 class="p-3">BancoApp</h4>
  <div class="list-group list-group-flush">
  

    <a class="list-group-item list-group-item-action bg-dark text-white" data-bs-toggle="collapse" href="#submenu2">
      <i class="fa fa-user me-2"></i> Mi Cuenta
    </a>
    <div class="collapse" id="submenu2">
      <a href="login.jsp" class="list-group-item list-group-item-action bg-secondary text-white">Iniciar sesión</a>
      <a href="perfil.jsp" class="list-group-item list-group-item-action bg-secondary text-white">Mi perfil</a>
      <a href="cerrarSesion.jsp" class="list-group-item list-group-item-action bg-secondary text-white">Cerrar sesión</a>
    </div>

    <a href="prestamos.jsp" class="list-group-item list-group-item-action bg-dark text-white">
      <i class="fa fa-money-bill me-2"></i> Préstamos
    </a>
    <a href="transferencias.jsp" class="list-group-item list-group-item-action bg-dark text-white">
      <i class="fa fa-exchange-alt me-2"></i> Transferencias
    </a>
    <a href="contacto.jsp" class="list-group-item list-group-item-action bg-dark text-white">
      <i class="fa fa-phone me-2"></i> Contacto
    </a>
  </div>
</div>
<div class="container-fluid" style="margin-left: 250px; padding: 20px;">


<jsp:include page="VistaCliente.jsp"></jsp:include>
=======
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
>>>>>>> 3028d39 (ultimos cambios)

</div>

</body>
=======
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
>>>>>>> f4eb14a (agregando vista cliente completa)
</html>