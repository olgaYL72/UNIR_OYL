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
				function volver(){
							window.location.href="Main.action";
					}		
						
				function buscar(){
					if($("#textoLibre").val()!=""){
						$("#bloque_resultados").show();	
						$("#bloque_campos").show();								
						reloadGrid();				
					}else{
					 alert("Debe introducir un término sobre el cual realizar la búsqueda.");
					}
					
					
				}	
				
				window.onload=function(){	
					//se oculta el bloque de resultados la primera vez que se accede a la página
						$("#bloque_resultados").hide();								
					//ocultar la cabecera del jgrid con el nombre de los campos de las distintas bases de dadtos
						var grid = $("#gridCampos"); 
						var gview = grid.parents("div.ui-jqgrid-view");
						gview.children("div.ui-jqgrid-hdiv").hide();	 
									
				}
							
				//Recargar combo de campos
				function actualizarCamposSel() {					
						$.publish('recargarCampos');		
				}				
				
								
				$.subscribe('posicionarResultados', function(event, data) {			
					if($("#bloque_resultados").is(":visible") ){						
							$('html,body').animate({
					   			 scrollTop: $("#bloque_finResultados").offset().top
								}, 2000);
					}
				});
				
												
				function reloadGrid() {			
					$('html,body').animate({
					    scrollTop: $("#bloque_resultados").offset().top
					}, 2000);
										
					$.publish('reloadListaGrid');	
					return false;
				}		
				
				
				function checkboxFormatter(cellvalue, options, rowObject) {		
					var id = cellvalue;
					cellvalue="<input type=\"checkbox\" name=\"campoSel\"   value=\""+id+"\" onchange=\"seleccionar()\" > ";
					return cellvalue;					
					}
			

				function seleccionar(){							
				
				$("#camposSeleccionados").val("");
				 //var ids_sel=$('input[type=checkbox]:checked').map(function() {
				var ids_sel=$('input:checkbox[name^=\'campoSel\']:checked').map(function() { 
					 return $(this).attr('value');
				 }).get();
				
				$("#camposSeleccionados").val(ids_sel.join('/'));
				}
				
				function htmlFormatter(cellValue, opts, rowObject) {					
					var id = cellValue;
					cellValue=	"<img src='<%=pageContext.getServletContext().getContextPath()%>/static/img/ico_carpeta.jpg' title='<s:text name='boton.consulta'/>' width='16' style='cursor:pointer;' onclick=\"window.open('"	+ id + "','Pestaña Nueva','width=800, heigth=600, scrollbars=yes');\"  > ";
					return cellValue;
				}
				
				function htmlFormatterNumPub(cellValue, opts, rowObject) {
					if(cellValue!="")
						return "ES"+cellValue;
					else return cellValue;
			
					
				}
				
				function exportar(formato) {					
				
					sidx = $("#gridtable").jqGrid('getGridParam', 'sortname');
					if (sidx=="") sidx="titulo";
					sord = $("#gridtable").jqGrid('getGridParam', 'sortorder');	
					page=$("#gridtable").jqGrid('getGridParam', 'page');
					rows=$("#gridtable").jqGrid('getGridParam', 'rowNum');
					
					
					if (formato == 'pdf') {
						document.getElementById("formularioBusqueda").action = "exportarPdfListadoInformeAction.action?tipoBusq=campos&sidx=" + sidx + "&sord=" + sord+"&page=" +page+"&rows=" + rows;				
					} else if (formato == 'xls') {
						document.getElementById("formularioBusqueda").action = "exportarExcelListadoInformeAction.action?tipoBusq=campos&sidx=" + sidx + "&sord=" + sord+"&page=" +page+"&rows=" + rows;						
					} else {
						document.getElementById("formularioBusqueda").action = "exportarWordListadoInformeAction.action?tipoBusq=campos&sidx=" + sidx + "&sord=" + sord+"&page=" +page+"&rows=" + rows;						
						}
				
					$('#aviso').fadeIn('slow');
					setTimeout(ocultarAviso, 5000);
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
 			<s:text name="busqueda.SeccionBuscarCampos" />
 		</div>
 </div>
	<fieldset>
	<div class="bloque_form">					
   	<s:form id="formularioBusqueda" validate="false" Acceptcharset="UTF-8" method="POST">   			
			<!-- CAMPOS OCULTOS -->
  		 	<s:hidden name="camposSeleccionados" id="camposSeleccionados" value="" />
  		 	
  		 	<s:select 
						key="busqueda.bases"
						id="idBase"
						name="idBase"
						list="lsBases"
				 		listKey="idBase" 
				 		listValue="descripcionBase" 
				 		required="true"									
						onselect="actualizarCamposSel();"
				 		onchange="actualizarCamposSel();"	
				 		headerValue="%{getText('combo.seleccionar')}" headerKey="-1"
    					formIds="formularioBusqueda"
    					rel="Descripcion Bases"  />   	
    		
    				<br>
    				<s:textfield key="busqueda.textoLibre" name="textoLibre"  id="textoLibre"/>
    		
    					
    		 <s:url id="comboCampos" action="obtenerCamposJsonInvenesBBDDAction" />
						<sjg:grid id="gridCampos" dataType="json" href="%{comboCampos}"
							pager="false" gridModel="lsInvenesCampos" rowList="2"
							rownumbers="false" ondblclick=""
							autowidth="true" formIds="formularioBusqueda"
							reloadTopics="recargarCampos"	
							 pagerPosition="center"
							viewrecords="true" altClass="ui-priority-secondary"
							altRows="true" viewsortcols="[true,'vertical',true]"	>							
							
							<sjg:gridColumn name="idCampo" index="idCampo" title="" align="center"
								width="2"	sortable="false"   hidden="false"  formatter="checkboxFormatter" /> 
							<sjg:gridColumn name="descripcionCampo" index="descripcionCampo"
								align="left" title="%{getText('busqueda.nombreCampo')}"
								width="150" sortable="true" />								
							</sjg:grid>   
                   
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
	<s:url id="remoteurl" action="busquedaCamposJsonInvenesAction" />
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
								width="35" sortable="true" formatter="htmlFormatterNumPub"/>
								
						 <sjg:gridColumn name="referencia" index="referencia"
								align="center" title="%{getText('patente.referencia')}"
								width="25" sortable="true" />
							
							 <sjg:gridColumn name="clasificacionInternacional" index="clasificacionInternacional"
										align="center" title="%{getText('patente.clasificacion')}"
										width="40" sortable="true" />
						
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