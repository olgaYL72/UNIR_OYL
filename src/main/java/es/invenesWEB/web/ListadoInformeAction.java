package es.invenesWEB.web;

/**
 * Copyright (C) 2016 Olga Yagüe López TFG UNIR Grado Informática
 * 
 *   invenesWEB  is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
  *  (at your option) any later version.

  *  invenesWEB is distributed in the hope that it will be useful,
  *  but WITHOUT ANY WARRANTY; without even the implied warranty of
   * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   * GNU General Public License for more details.

    *You should have received a copy of the GNU General Public License
    *along with invenesWEB.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;

import org.apache.log4j.Logger;

import es.invenesWEB.model.Patente;
import es.invenesWEB.wsOEPM.AccesoInvenes;
import es.oracle.invenes.ws.InvenesSearch;
import es.oracle.invenes.ws.Reference;
import es.oracle.invenes.ws.SearchResult;
import es.invenesWEB.web.ParametrosProyecto;

public class ListadoInformeAction implements Serializable{

	 private static final long serialVersionUID = 1L;
	 
	 private static final String ERROR = "error";
	 private static final String SUCCESS = "generarInforme";
	  private static final String INPUT = "input";
			 
	 /** Logger */
	private Logger log = Logger.getLogger(ListadoInformeAction.class);
	//parametro del objeto
	private AccesoInvenes accesoInvenes;
	
	// campos de busqueda de los formularios
	private String idBase;
	private String idSeccion;
	private String idArea;
	private String idClase;
	private String idSubclase;
	private String camposSeleccionados;
	private String textoLibre;
	
	private List<Patente> elementos ;
	 
	//-------------------------------------------------------------------------------------------//
	//     CONSTANTES  DE FORMATOS                                                               //
	//-------------------------------------------------------------------------------------------//
		public static final String FORMATO_PDF = "pdf";
		public static final String FORMATO_DOC = "rtf";
		public static final String FORMATO_XLS = "xls";

		public static String CONTENT_TYPE_PDF="application/pdf";
		public static String CONTENT_TYPE_XSL="application/vnd.ms-excel";
		public static String CONTENT_TYPE_RTF="application/rtf";
		
		//-------------------------------------------------------------------------------------------//
		//    PARAMETROS JASPER                                                                      //
		//-------------------------------------------------------------------------------------------//	
		protected String dataSource; 
		private String fileName;

		//-------------------------------------------------------------------------------------------//
		//    PARAMETROS STREAM                                                                      //
		//-------------------------------------------------------------------------------------------//	
		protected String contentType;
		protected byte[] informeResult;
		//-------------------------------------------------------------------------------------------//
		//    PARAMETROS DE LISTADOS                                                                 //
		//-------------------------------------------------------------------------------------------//	
		private String tipoBusq;
		//sortname
		private String sidx;	
		//sortorder
		private String sord = "asc";
		//page
		private String page;
		//rows
		private String rows;
		

		

		public String exportarExcel() throws Exception{
			try {				
					return this.generarInformeExterno(FORMATO_XLS);				
			}catch(Exception e) {
				log.error("ERROR- Generacion Informe Excel "+ e.getMessage());		
				return ERROR;
			}
		}
		
		public String  exportarWord() throws Exception{
			try {				
				return this.generarInformeExterno(FORMATO_DOC);				
			}catch(Exception e) {
				log.error("ERROR- Generacion Informe Word "+ e.getMessage());	
				return ERROR;
			}
		}
		
		public String  exportarPdf() throws Exception{
			try {				
				return this.generarInformeExterno(FORMATO_PDF);				
			}catch(Exception e) {
				log.error("ERROR- Generacion Informe PDF "+ e.getMessage());		
				return ERROR;
			}
		}
		
		/**
		 * Genera un informe utilizando una plantilla externalizada
		 * 
		 * @return
		 * @throws Exception
		 */
		public String generarInformeExterno(String formato) throws Exception{
				
			String reportName = "ListadoPatentes.jasper";			
			this.setFileName("Listado Patentes."+formato);
			
			//ejecuta la busqueda y deja el resultado en elementos
			this.obtenerResultados(this.tipoBusq);	
				
			if (elementos!=null && !elementos.isEmpty())
				{
					try {
							JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(elementos);				
							JasperPrint informe = JasperFillManager.fillReport(this.getJasperRuta()+reportName, this.getMapaParametros(), dataSource);
				
							this.informeResult = this.exportReport(informe, formato);
				
							if(FORMATO_PDF.equals(formato)){
									this.contentType = CONTENT_TYPE_PDF;					
							}else if(FORMATO_XLS.equals(formato)){
									this.contentType = CONTENT_TYPE_XSL;					
							}else if(FORMATO_DOC.equals(formato)){
									this.contentType = CONTENT_TYPE_RTF;	
							}
					}catch(Exception e) {
						log.error("ERROR- Generacion Informe "+ e.getMessage());
						return  INPUT;	
					}
					return SUCCESS;
				} else{
					//En caso de no existir resultados se ha producido un error
					// en el formulario se comprueba si existen resultados para exportar de manera que no llegaría a este punto de la ejecución
					return ERROR;
				}
		}

		private void obtenerResultados(String tipoBusq) throws Exception {
			
			SearchResult res= new SearchResult();
			String paramBusq = "";			
			Integer registros=Integer.parseInt( this.getRows());
			Integer inicio ;
			
			if (Integer.parseInt(this.getPage())>1){
					inicio=Integer.parseInt(this.getPage()) * registros;
			} else{
				inicio=Integer.parseInt(this.getPage());
			}
			
			// Comprobar reconexion		
			if (accesoInvenes.getInvenesServicio() == null) {
				accesoInvenes.reconectar();
			}

			InvenesSearch invenesBusq = accesoInvenes.getInvenesServicio();

			if (invenesBusq != null) {
				
				if ("campos".equals(tipoBusq)){
					
					// Se comprueba que se ha introducido una cadena de busqueda, mas bien que se recoge, porque se valida en jsp
					if (this.getTextoLibre()!=null && !"".equals(this.getTextoLibre())){
						paramBusq=this.getTextoLibre();
					}				
					if (this.getCamposSeleccionados()!= null
							&& !"".equals(this.getCamposSeleccionados()))
						paramBusq =paramBusq + "/"+this.getCamposSeleccionados();
					else if (this.getIdClase() != null && !"".equals(this.getIdClase()))
						paramBusq =paramBusq + "/"+ "/TIRE";
					
					if (!"".equals(paramBusq)) {
						res = invenesBusq.doSearch(
										accesoInvenes.getIdConexion(),
										new Integer(this.getIdBase()),
										paramBusq,
										"TITULO,INVENTOR,SOLICITUD,CLAINT,CPC,SOLICITANTE,DIRE,OTRAS,PRIORIDAD",
										this.getSidx(),this.getSord(), inicio,registros);					
							}
					
				} else if ("cip".equals(tipoBusq)){
					
					if (this.getIdSubclase() != null
							&& !"".equals(this.getIdSubclase()))
						paramBusq = this.getIdSubclase() + "/CLASIF";
					else if (this.getIdClase() != null && !"".equals(this.getIdClase()))
						paramBusq = this.getIdClase() + "/CLASIF";

					if (!"".equals(paramBusq)) {						
							 res = invenesBusq.doSearch(
											accesoInvenes.getIdConexion(),
											new Integer(this.getIdBase()),
											paramBusq,
											"TITULO,INVENTOR,SOLICITUD,CLAINT,CPC,SOLICITANTE,DIRE,OTRAS,PRIORIDAD",
											this.getSidx(),this.getSord(), inicio,registros);
									}
					}
				
				if (res.getTotalResults() > 0) {
					
					List<Reference> referencias = res.getReferences();
					List<Patente> lsResultado = new ArrayList<Patente>();

					for (int i = 0; i < registros; i++) {
						Reference reference = referencias.get(i);
						Patente patente = new Patente(reference);
						lsResultado.add(patente);
					}
					this.setElementos(lsResultado);
			}
	}	//invenesBusq!=null
}
		
		
		/**
		 * Exporta el informe en el formato indicado
		 * 
		 * @param informe Informe ya rellenado
		 * @param formato Formato a exportar {@link #FORMATO_PDF}, {@link #FORMATO_DOC} o {@link #FORMATO_XLS}
		 * @return Un array de byte con el fichero generado o null si no se reconoce el formato
		 * @throws JRException Si
		 */
		private byte[] exportReport(JasperPrint informe, String formato)throws JRException{
			if(FORMATO_PDF.equals(formato)){
				return JasperExportManager.exportReportToPdf(informe);
			}else if(FORMATO_XLS.equals(formato)){
				JRXlsExporter exporter = new JRXlsExporter();
	            ByteArrayOutputStream  xlsReport = new ByteArrayOutputStream();
	            exporter.setParameter(JRExporterParameter.JASPER_PRINT, informe);
	            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, xlsReport);            
	            exporter.exportReport();
	            return xlsReport.toByteArray();
				
			}else if(FORMATO_DOC.equals(formato)){
				JRRtfExporter exporter = new JRRtfExporter();
				ByteArrayOutputStream  rtfReport = new ByteArrayOutputStream();
	            exporter.setParameter(JRExporterParameter.JASPER_PRINT, informe);
	            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, rtfReport);            
	            exporter.exportReport();
	            return rtfReport.toByteArray();
			}
			return null;
		}
		
		/**
		 * Para obtener la ruta donde encontrar los jasper
		 * @return ruta donde encontrar los jasper
		 */
		public String getJasperRuta(){			
			String jasperPath = ParametrosProyecto.rutaFicherosJasper;
								
			return jasperPath;
		}
		
		/**
		 * Devuelve los parametros a incluir en el informe, por defecto es un Map vacio.</br>
		 * Si el informe usa parametros se debe redefinir este metodo
		 * 
		 * @return
		 */
		public Map<String, Object> getMapaParametros(){
			return new HashMap<String, Object>();
		}
		// ------------------ GETTER & SETTER-------------------------------

		/**
		 * @return the dataSource
		 */
		public String getDataSource() {
			return dataSource;
		}


		/**
		 * @param dataSource the dataSource to set
		 */
		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		

		/**
		 * @return the contentType
		 */
		public String getContentType() {
			return contentType;
		}


		/**
		 * @param contentType the contentType to set
		 */
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		/**
		 * Devuelve el resultado en un InputStream
		 * @return el resultado en un InputStream
		 */
		public InputStream getInformeInputStream() {
			InputStream informe = new ByteArrayInputStream(getInformeResult());
			return informe;
		}
		

		/**
		 * @return the informeResult
		 */
		public byte[] getInformeResult() {
			return informeResult;
		}


		/**
		 * @param informeResult the informeResult to set
		 */
		public void setInformeResult(byte[] informeResult) {
			this.informeResult = informeResult;
		}


		/**
		 * @return the sord
		 */
		public String getSord() {
			return sord;
		}


		/**
		 * @param sord the sord to set
		 */
		public void setSord(String sord) {
			this.sord = sord;
		}


		/**
		 * @return the sidx
		 */
		public String getSidx() {
			return sidx;
		}


		/**
		 * @param sidx the sidx to set
		 */
		public void setSidx(String sidx) {
			this.sidx = sidx;
		}

		
		
		/**
		 * @return the idBase
		 */
		public String getIdBase() {
			return idBase;
		}

		/**
		 * @param idBase the idBase to set
		 */
		public void setIdBase(String idBase) {
			this.idBase = idBase;
		}

		/**
		 * @return the idSeccion
		 */
		public String getIdSeccion() {
			return idSeccion;
		}

		/**
		 * @param idSeccion the idSeccion to set
		 */
		public void setIdSeccion(String idSeccion) {
			this.idSeccion = idSeccion;
		}

		/**
		 * @return the idArea
		 */
		public String getIdArea() {
			return idArea;
		}

		/**
		 * @param idArea the idArea to set
		 */
		public void setIdArea(String idArea) {
			this.idArea = idArea;
		}

		/**
		 * @return the idClase
		 */
		public String getIdClase() {
			return idClase;
		}

		/**
		 * @param idClase the idClase to set
		 */
		public void setIdClase(String idClase) {
			this.idClase = idClase;
		}

		/**
		 * @return the idSubclase
		 */
		public String getIdSubclase() {
			return idSubclase;
		}

		/**
		 * @param idSubclase the idSubclase to set
		 */
		public void setIdSubclase(String idSubclase) {
			this.idSubclase = idSubclase;
		}

		/**
		 * @return the camposSeleccionados
		 */
		public String getCamposSeleccionados() {
			return camposSeleccionados;
		}

		/**
		 * @param camposSeleccionados the camposSeleccionados to set
		 */
		public void setCamposSeleccionados(String camposSeleccionados) {
			this.camposSeleccionados = camposSeleccionados;
		}

		/**
		 * @return the textoLibre
		 */
		public String getTextoLibre() {
			return textoLibre;
		}

		/**
		 * @param textoLibre the textoLibre to set
		 */
		public void setTextoLibre(String textoLibre) {
			this.textoLibre = textoLibre;
		}

		/**
		 * @return the tipoBusq
		 */
		public String getTipoBusq() {
			return tipoBusq;
		}

		/**
		 * @param tipoBusq the tipoBusq to set
		 */
		public void setTipoBusq(String tipoBusq) {
			this.tipoBusq = tipoBusq;
		}

		/**
		 * @return the accesoInvenes
		 */
		public AccesoInvenes getAccesoInvenes() {
			return accesoInvenes;
		}

		/**
		 * @param accesoInvenes the accesoInvenes to set
		 */
		public void setAccesoInvenes(AccesoInvenes accesoInvenes) {
			this.accesoInvenes = accesoInvenes;
		}

		/**
		 * @return the page
		 */
		public String getPage() {
			return page;
		}

		/**
		 * @param page the page to set
		 */
		public void setPage(String page) {
			this.page = page;
		}

		/**
		 * @return the rows
		 */
		public String getRows() {
			return rows;
		}

		/**
		 * @param rows the rows to set
		 */
		public void setRows(String rows) {
			this.rows = rows;
		}

		/**
	 * @return the elementos
	 */
	public List<Patente> getElementos() {
		return elementos;
	}

	/**
	 * @param elementos the elementos to set
	 */
	public void setElementos(List<Patente> elementos) {
		this.elementos = elementos;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	 
}
