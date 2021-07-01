<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página de Bienvenida en JSP</title>
</head>
<body>
<f:view>
	<h3>BIENVENIDO #{user.nombre} A LA APPLICACIÓN WEB</h3>
	<h:form>
		<h:commandLink action="/index" value="Salir"/>
	</h:form>
</f:view>
</body>
</html>