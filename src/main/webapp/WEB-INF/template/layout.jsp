<!DOCTYPE html> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
 <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Cache-Control" content ="no-cache" />
<meta http-equiv="expires" content="-1" />
<meta http-equiv="Pragma" content="no-cache" /> 	
<meta name="description" content=""/>	
<meta name="keywords" content="TFG UNIR invenes"/>		
 <sj:head  locale="es" jqueryui="true" jquerytheme="redmond"/> 
 
 <link rel="shortcut icon" href="<%=pageContext.getServletContext().getContextPath()%>/static/img/favicon.ico">
 
 <!--  estilos de invenes -->
<link rel="stylesheet" href="<%=pageContext.getServletContext().getContextPath()%>/static/css/invenesWEB.css" type="text/css" media="screen"/>

</head>

<body>
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="body"/>
</body>

</html>
