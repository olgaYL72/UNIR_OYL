<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

 <!--  Copyright (C) 2016 Olga Yagüe López TFG UNIR Grado Informática -->
 
 <!-- 
    invenesWEB  is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

   invenesWEB is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
    along with invenesWEB.  If not, see <http://www.gnu.org/licenses/>.
 --> 
<html>   
	<head>
		<script type="text/javascript">
				function busquedaSimple(){
					window.location.href="simpleBusqueda.action";
				}
				function busquedaAvanzada(){
					window.location.href="avanzadaBusqueda.action";
				}
		</script>
	</head>
	
    <body>
 	<div class="tituloInformativo">
 	 	 <br>
 	 	 <strong>Los derechos de autor de la Clasificación Internacional de Patentes y los datos resultantes de las búsquedas realizadas en esta aplicación, pertenecen a la Oficina Española de Patentes (OEPM).</strong>
 	 	 <br>
 	</div>
 	<br><br>
 	<div class=texto_inicio>
 		
 	Desde la página oficial de la Oficina Española de patentes se ofrece el acceso a búsquedas de expedientes por diferentes criterios, pero <strong>no incluye la búsqueda mediante la Clasificación Internacional de Patentes</strong>.<br>
 	<br>
 	En esta aplicación se ha implementado la búsqueda de Patentes haciendo uso de dicha Clasificación, además de una  búsqueda avanzada en la que el usuario designa lo campos por los que realizar la búsqueda.
 	
 	
 	<div  class="bloque_botones">
 		<input id="btnBusqSimple" type="button"	value="Buscar por CIP"	onclick="busquedaSimple();" class="boton_submit" />
 		<input id="btnBusqSimple" type="button"	value="Buscar por Campos"	onclick="busquedaAvanzada();" class="boton_submit" />
 	</div>		
 	</div>
 	<br><br>
 	Los datos resultantes de la búsqueda se obtienen de la base de datos de INVENES (INvenciones ENESpañol), a la que se accede  a través de un <a href="http://www.oepm.es/es/invenciones/modelo_utilidad/tramites_linea/servicio_web_invenes/introduccionServiciosWeb.html" target="_blank">servicio web </a>que ofrece la OEPM , dentro la <a href="http://datos.gob.es/" target="_blank"> iniciativa Aporta y la reutilización de datos públicos</a>.
 	
    </body>
</html>