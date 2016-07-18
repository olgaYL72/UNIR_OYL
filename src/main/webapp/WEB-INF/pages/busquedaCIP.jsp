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
 
<script type="text/javascript">

				window.onload=function(){					
					$("#bloque_resultados").hide();				
				}
				function volver(){
							window.location.href="Main.action";
					}		
						
				function buscar(){
						
						if($("#idBase").val()==-1 ||$("#idSeccion").val()==-1 ||$("#idArea").val()==-1 || $("#idClase").val() ==-1)
						{
						alert('Para poder realizar la búsqueda deben cumplimentarse los datos de Base, Sección, Area y Clase. De otra forma la búsqueda en la mayoría de los casos sería imposible por el volumen de datos. Gracias.');
						}
					else {
						$("#bloque_resultados").show();	
						reloadGrid();
					}
				}	
				window.onload=function(){					
						$("#bloque_resultados").hide();		
					
				}
				$(document)	.ready(
						function() {		
						
						});
							
				//Limpiar combos de la clasificacion cuando se modifique la base de datos INVENES
				function limpiarSeleccion() {					
					$("#idSeccion").val("-1");
					$("#idArea").val("-1");
					$("#idClase").val("-1");
					$("#idSubclase").val("-1");
						
				}
				
				//Recargar combos dependientes de seccion
				function actualizarSeccionSel() {					
						$.publish('recargarAreas');	
						$.publish('recargarClases');	
						$.publish('recargarSubclases');	
						
				}				
				//Recargar combos dependientes de area
				function actualizarAreaSel() {											
						$.publish('recargarClases');	
						$.publish('recargarSubclases');	
						
				}									
				//Recargar combos dependientes de clase
				function actualizarClaseSel() {					
						$.publish('recargarSubclases');	
						
				}	
						
				function reloadGrid() {		
					$('html,body').animate({
					    scrollTop: $("#bloque_resultados").offset().top
					}, 2000);
					$.publish('reloadListaGrid');
					return false;
				}		
				
				$.subscribe('posicionarResultados', function(event, data) {			
					if($("#bloque_resultados").is(":visible") ){						
							$('html,body').animate({
					   			 scrollTop: $("#bloque_finResultados").offset().top
								}, 2000);
					}
				});
				
				function htmlFormatter(cellValue, opts, rowObject) {					
					var id = cellValue;	
					cellValue=	"<img src='<%=pageContext.getServletContext().getContextPath()%>/static/img/ico_carpeta.jpg' title='<s:text name='boton.consulta'/>' width='16' style='cursor:pointer;' onclick=\"window.open('"	+ id + "','Pestaña Nueva','width=800, heigth=600, scrollbars=yes');\"  > ";
					return cellValue;
				}
				
				function exportar(formato) {					
					
					idsRows=$("#gridtable").jqGrid('getDataIDs');
					if (idsRows.length==0)
						{
							alert("No existen resultados que exportar.")
							return;
						}
					
					sidx = $("#gridtable").jqGrid('getGridParam', 'sortname');
					if (sidx=="") sidx="titulo";
					sord = $("#gridtable").jqGrid('getGridParam', 'sortorder');	
					page=$("#gridtable").jqGrid('getGridParam', 'page');
					rows=$("#gridtable").jqGrid('getGridParam', 'rowNum');
					
					
					if (formato == 'pdf') {
						document.getElementById("formularioBusqueda").action = "exportarPdfListadoInformeAction.action?tipoBusq=cip&sidx=" + sidx + "&sord=" + sord+"&page=" +page+"&rows=" + rows;				
					} else if (formato == 'xls') {
						document.getElementById("formularioBusqueda").action = "exportarExcelListadoInformeAction.action?tipoBusq=cip&sidx=" + sidx + "&sord=" + sord+"&page=" +page+"&rows=" + rows;						
					} else {
						document.getElementById("formularioBusqueda").action = "exportarWordListadoInformeAction.action?tipoBusq=cip&sidx=" + sidx + "&sord=" + sord+"&page=" +page+"&rows=" + rows;						
						}
					
					$('#aviso').fadeIn('slow');
					setTimeout(ocultarAviso, 6000);
					document.getElementById("formularioBusqueda").submit();
				}
				
				function ocultarAviso() {
					if ($('#aviso') != null) {
						$('#aviso').fadeOut('slow', function() {
							$('#aviso').hide();
						});
					}
				}
	</script>
		

 <div id="bloqueBuscador">
 <div class="tituloSeccion">
 		<div class="texto_titulo">
 			<s:text name="busqueda.SeccionBuscarCIP" />
 		</div>
 </div>
	<fieldset>
	<div class="bloque_form">					
   	<s:form id="formularioBusqueda" validate="false" Acceptcharset="UTF-8" method="POST">   			
			<s:select 
						key="busqueda.bases"
						id="idBase"
						name="idBase"
						list="lsBases"
				 		listKey="idBase" 
				 		listValue="descripcionBase" 
				 		required="true"		
				 		onchange="limpiarSeleccion();"
				 		headerValue="%{getText('combo.seleccionar')}" headerKey="-1"
    					formIds="formularioBusqueda"
    					rel="Descripcion Bases"  />
   	  				 	
			 <s:url   action="obtenerSeccionesJsonCIPAction"	var="comboSecciones"/>
			<sj:select href="%{comboSecciones}" id="idSeccion"
										key="busqueda.seccion"
										name="idSeccion" list="lsSecciones"
										listKey="idSeccion" listValue="descripcionSeccion"
										required="true"		
										onselect="actualizarSeccionSel();"
				 						onchange="actualizarSeccionSel();"
				 						headerValue="%{getText('combo.seleccionar')}" headerKey="-1"
				 						 emptyOption="false"										
										rel="Descripcion Seccion" /> 										
										
    	 <s:url action="obtenerAreasJsonCIPAction"	var="comboAreas"/>     	 
			<sj:select href="%{comboAreas}" id="idArea"
										key="busqueda.area"
										name="idArea" list="lsAreas"
										listKey="idArea" listValue="descripcionArea" 
										required="true"				
										reloadTopics="recargarAreas"	
										onselect="actualizarAreaSel();"
				 						onchange="actualizarAreaSel();"						
										 emptyOption="false"
										headerValue="%{getText('combo.seleccionar')}" headerKey="-1"
										rel="Descripcion area" /> 
										
			<s:url action="obtenerClasesJsonCIPAction"	var="comboClases"/>     	 
			<sj:select href="%{comboClases}" id="idClase"
										key="busqueda.clase"
										name="idClase" list="lsClases"
										listKey="idClase" listValue="descripcionClase" 
										required="true"		
										reloadTopics="recargarClases"	
										onselect="actualizarClaseSel();"
				 						onchange="actualizarClaseSel();"								
										 emptyOption="false"
										headerValue="%{getText('combo.seleccionar')}" headerKey="-1"
										rel="Descripcion clase" /> 			
															
            <s:url action="obtenerSubclasesJsonCIPAction"	var="comboSubclases"/>     	 
			<sj:select href="%{comboSubclases}" id="idSubclase"
										key="busqueda.subclase"
										name="idSubclase" list="lsSubclases"
										listKey="idSubclase" listValue="descripcionSubclase" required="false"			
										reloadTopics="recargarSubclases"												
										 emptyOption="false"
										headerValue="%{getText('combo.seleccionar')}" headerKey="-1"
										rel="Descripcion subclase" /> 		
            </br>
            </br>           
	     	</s:form>
	    </div>
	    
	    <div class="bloque_acciones">
            <div class="bloque_botones">	
         			<input id="btnBuscar" type="button"	value="Buscar"	onclick="buscar();" class="boton_submit" /> 
         			<input id="btnvolver" type="button"	value="Cancelar"	onclick="volver();" class="boton_submit"/>
         			
        	</div>			
	 </div>
	  </fieldset>
 </div>
  
 
 <!-- RESULTADOS -->
 	
 	
	<div id="bloque_resultados">
	<div class="tituloResultado"> 	
		<div class="bloqueIzqda">			
 			<legend><s:text name="busqueda.SeccionResultados" /></legend>
 		</div>
 		<div class="bloqueDrcha">		
 						<a title="<s:text name="resultados.exportar.pdf"/>" href="#"><img
								src="static/img/ico_pdf.png" onclick="exportar('pdf');"></a>
							<a title="<s:text name="resultados.exportar.rtf"/>" href="#"><img
								src="static/img/ico_word.png" onclick="exportar('rtf');"></a>
							<a title="<s:text name="resultados.exportar.xls"/>" href="#"><img
								src="static/img/ico_excel.png" onclick="exportar('xls');"></a>
		</div>
 	 </div> 	 
	<fieldset>
	<div class="bloque_form">
	<s:form id="formularioResultados" validate="false" Acceptcharset="UTF-8">	
	<!--  campos ocultos -->
	<s:hidden name="records" id="registros" value="%{getRecords()}"/>	
	<div id="resultadoBusqueda">
	<s:url id="remoteurl" action="busquedaCIPJsonInvenesAction" />
						<sjg:grid id="gridtable" dataType="json" href="%{remoteurl}"
							pager="true" gridModel="lsResultado" rowList="10,20,30"
							rownumbers="false" onSelectRowTopics="rowselect" ondblclick=""
							autowidth="true" formIds="formularioBusqueda"
							reloadTopics="reloadListaGrid"  onGridCompleteTopics="posicionarResultados"  pagerPosition="center"
							viewrecords="true" altClass="ui-priority-secondary"
							altRows="true" viewsortcols="[true,'vertical',true]"
						 sortname="%{getSidx()}" sortorder="%{getSord()}"
							page="%{getPage()}" rowNum="%{getRows()}"> 
							
							
							<sjg:gridColumn name="titulo" index="titulo" align="left"
								title="%{getText('patente.titulo')}" width="150"
								sortable="true" />
								
							<sjg:gridColumn name="solicitante" index="solicitante"
								align="left" title="%{getText('patente.solicitante')}"
								width="100" sortable="true" />
								
							<sjg:gridColumn name="numPublicacion" index="numPublicacion"
								align="center" title="%{getText('patente.numPublicacion')}"
								width="35" sortable="true" />
								
						 <sjg:gridColumn name="referencia" index="referencia"
								align="center" title="%{getText('patente.referencia')}"
								width="30" sortable="true" />
							
						 <sjg:gridColumn name="clasificacionInternacional" index="clasificacionInternacional"
								align="center" title="%{getText('patente.clasificacion')}"
								width="35" sortable="true" />
						
						<sjg:gridColumn name="urlReference" index="" title=""
								align="center" sortable="false" width="25"
								formatter="htmlFormatter" />

						</sjg:grid>
	
	</div> <!-- resultadoBusqueda -->

	</s:form>
	</div>
	<div id="bloque_finResultados"></div>
	</fieldset>

	</div>
	
	<div id="aviso">
		<div class="texto-aviso">
			La generación del informe tardará unos segundos... <br><br>
			Mostrará un mensaje en el pie de página para abrir o descargar el archivo. 
		</div>
	</div>
	