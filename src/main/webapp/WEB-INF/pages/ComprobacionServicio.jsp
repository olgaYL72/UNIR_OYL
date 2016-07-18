<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>


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
				function volver(){
							window.location.href="Main.action";
					}
		</script>
	</head>
	
    <body>
 
            <h1>¡ Conexión al Servicio Invenes de la OEPM realizada !</h1>
            </br>            
            <div class="subtitulo">Listado de Campos devueltos por método 'getSearchFields'</div>
            </br>
            <div class="bloqueTabla">				
					<table class="tabla campos" >
						<tr>
							<th width="auto">Etiqueta</th>
					      	<th width="auto">Valor</th>					      							      
					  	</tr>	
					   
						<s:iterator value="listaCampos" id="iterador" >					
						<tr>		
							<td align="left"><s:property value="label"/></td>
				   		 	<td align="center"><s:property value="value"/></td>				   		 	
						</tr>
						
				   	</s:iterator>
         		</table>
			
		</div> <!-- bloqueTabla -->
             
				
            
            </br>
            </br>
            <div  class="bloque_botones">
         			<input id="btnvolver" type="button"	value="Volver"	onclick="volver();" class="boton_submit" />								
	     	</div>
    </body>
</html>