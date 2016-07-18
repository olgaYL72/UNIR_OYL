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
				function conexionInvenes(){
							window.location.href="Inicio.action";
					}
				
				function busquedaInvenes(){
					window.location.href="busquedaInicio.action";
				}
				function busquedaSimple(){
					window.location.href="simpleBusqueda.action";
				}
				function busquedaAvanzada(){
					window.location.href="avanzadaBusqueda.action";
				}
		</script>
	</head>
	
    <body>
 
            <h1>Acciones varias - se convertira en pagina acceso con enlaces y resumen de la funcionalidad</h1>
            </br>
            </br>
            <div  class="bloque_botones">            	
         			<input id="btnConexion" type="button"	value="Conexion con Invenes"	onclick="conexionInvenes();" class="boton_submit" />
         			<input id="btnBusqSimple" type="button"	value="Busqueda Simple"	onclick="busquedaSimple();" class="boton_submit" />								
         			<input id="btnBusqAvanzada" type="button"	value="Busqueda Avanzada"	onclick="busquedaAvanzada();" class="boton_submit" />
	     	</div>
    </body>
</html>