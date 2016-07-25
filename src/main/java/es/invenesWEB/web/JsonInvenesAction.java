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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import es.invenesWEB.model.InvenesCampo;
import es.invenesWEB.model.Patente;
import es.invenesWEB.services.PageState;
import es.invenesWEB.wsOEPM.AccesoInvenes;
import es.oracle.invenes.ws.InvenesSearch;
import es.oracle.invenes.ws.Reference;
import es.oracle.invenes.ws.SearchResult;

public class JsonInvenesAction implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String ERROR = "error";
	private static final String BUSQUEDA_CIP = "busquedaCIP";
	private static final String BUSQUEDA_CAMPOS = "busquedaCampos";

	// Número de registros que se mostrarán por defecto por cada página del
	// grid.
	public static final int NUMERO_REGISTROS_POR_DEFECTO = 10;
	// Número de registros 20 que se mostrarán por cada página del grid.
	public static final int NUMERO_REGISTROS_20 = 20;
	// Número que tendrá la primerá página de registros del grid.
	public static final int NUMERO_PRIMERA_PAGINA_POR_DEFECTO = 0;
	// Tipo de ordenación por defecto que se aplicará en el grid.
	public static final String ORDENACION_POR_DEFECTO = "asc";

	private AccesoInvenes accesoInvenes;
	private List<Patente> lsResultado;
	private List<InvenesCampo> lsCampos;

	private String idBase;
	private String idSeccion;
	private String idArea;
	private String idClase;
	private String idSubclase;
	private String camposSeleccionados;
	private String textoLibre;
	
	// VARIABLES PARA EL LISTADO
	// Número de filas que queremos en el Grid. Atributo rowNum del grid
	protected Integer rows = 10;
	// Obtiene la página solicitada. Por defecto el grid la pone a 1
	protected Integer page = 0;
	// Ordenación asc o desc
	protected String sord = ORDENACION_POR_DEFECTO;
	// Indice de la fila, por ejemplo cuando el usuario hace click al ordenar
	protected String sidx;
	// Numero de páginas
	protected Integer total = 0;
	// Número de registros
	protected Integer records = 0;
	// Almacen para los datos de paginacíon
	protected PageState paginado;

	/** Logger */
	private Logger log = Logger.getLogger(JsonInvenesAction.class);

	public JsonInvenesAction() {
		super();
		paginado = new PageState(NUMERO_REGISTROS_POR_DEFECTO);
	}

	/**
	 * 
	 * @return
	 */
	public String getJSON() {
		return execute();
	}

	
	public String execute() {
		return "success";
	}

	//funcion para Busqueda por CIP desde pagina busquedaSimple
	public String busquedaCIP() throws Exception {
		log.debug("JsonInvenesAction.listado() ================================================>");

		// recogemos los nuevos valores de la paginación.
		if (this.page==0) this.setPage(1);
		this.paginado.setPageSize(this.rows);
		this.paginado.setPage(this.page);
		this.paginado.setMax(this.records);
		this.paginado.setOrderBy(this.sidx);
		this.paginado.setOrderType(this.sord);

		String ordenA;
		Integer inicio;
		if (this.page==1) inicio=1;
		else inicio=this.page * this.rows;
		if("".equals(this.sidx) || this.sidx=="asc")
			ordenA="A";
		 else
			ordenA="D";
		

		// Comprobar reconexion		
		if (accesoInvenes.getInvenesServicio() == null) {
			accesoInvenes.reconectar();
		}

		InvenesSearch invenesBusq = accesoInvenes.getInvenesServicio();

		if (invenesBusq != null) {

			// La búsqueda se podrá realizar sobre una clase o subclase, si no
			// se informa la subclase los resultados de la búsqueda
			// serán más extensos y los resultados del web service más lentos
			String paramBusq = "";

			if (this.getIdSubclase() != null
					&& !"".equals(this.getIdSubclase()))
				paramBusq = this.getIdSubclase() + "/CLASIF";
			else if (this.getIdClase() != null && !"".equals(this.getIdClase()))
				paramBusq = this.getIdClase() + "/CLASIF";

			if (!"".equals(paramBusq)) {
				SearchResult res = invenesBusq
						.doSearch(
								accesoInvenes.getIdConexion(),
								new Integer(this.getIdBase()),
								paramBusq,
								"TITULO,INVENTOR,SOLICITUD,CLAINT,CPC,SOLICITANTE,DIRE,OTRAS,PRIORIDAD",
								paginado.getOrderBy(), ordenA, inicio,
								this.rows);
		
				if (!"0".equals(res.getErrorCod())) {
					// error devuelto por servicio Invenes
					// res.getErrorDesc()
					return ERROR;
				}

				if (res.getTotalResults() > 0) {
					List<Reference> referencias = res.getReferences();

					paginado.setListSize(res.getTotalResults());

					List<Patente> lsResultado = new ArrayList();

					for (int i = 0; i < this.rows; i++) {
						Reference reference = referencias.get(i);
						Patente patente = new Patente(reference);
						lsResultado.add(patente);
					}

					this.setLsResultado(lsResultado);

				}// si existen resultados

			} // si paramBusq no esta vacio
		} 

		setRecords(this.paginado.getListSize());
		setRows(this.paginado.getPageSize());
		setTotal((int) Math.ceil((double) getRecords() / (double) getRows()));

		return BUSQUEDA_CIP;
	}

	
	//funcion para Busqueda por Campos
		public String busquedaCampos() throws Exception {
			log.debug("JsonInvenesAction.listado() ================================================>");
			// recogemos los nuevos valores de la paginación.
			if (this.page==0) this.setPage(1);			
			this.paginado.setPageSize(this.rows);
			this.paginado.setPage(this.page);
			this.paginado.setMax(this.records);
			this.paginado.setOrderBy(this.sidx);
			this.paginado.setOrderType(this.sord);

			String ordenA;
			Integer inicio;
			if (this.page==1) inicio=1;
			else inicio=this.page * this.rows;
						
			if("".equals(this.sidx) || this.sidx=="asc")
				ordenA="A";
			 else
				ordenA="D";
			

			// Comprobar reconexion		
			if (accesoInvenes.getInvenesServicio() == null) {
				accesoInvenes.reconectar();
			}

			InvenesSearch invenesBusq = accesoInvenes.getInvenesServicio();

			if (invenesBusq != null) {

				String paramBusq = "";
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
					SearchResult res = invenesBusq
							.doSearch(
									accesoInvenes.getIdConexion(),
									new Integer(this.getIdBase()),
									paramBusq,
									"TITULO,INVENTOR,SOLICITUD,CLAINT,CPC,SOLICITANTE,DIRE,OTRAS,PRIORIDAD",
									paginado.getOrderBy(), ordenA, inicio,
									this.rows);
					
					if (!"0".equals(res.getErrorCod())) {
						// error devuelto por servicio Invenes
						// res.getErrorDesc()
						return ERROR;
					}

					if (res.getTotalResults() > 0) {
						List<Reference> referencias = res.getReferences();
						

						paginado.setListSize(res.getTotalResults());

						List<Patente> lsResultado = new ArrayList<Patente>();
												
						for (int i = 0; i <referencias.size(); i++) {
							Reference reference = referencias.get(i);							
							Patente patente = new Patente(reference);
							lsResultado.add(patente);
						}

						this.setLsResultado(lsResultado);

					}// si existen resultados

				} // si paramBusq no esta vacio
			} 

			setRecords(this.paginado.getListSize());
			setRows(this.paginado.getPageSize());
			setTotal((int) Math.ceil((double) getRecords() / (double) getRows()));
			
			
			return BUSQUEDA_CAMPOS;
		}
		
			
	// ------------------ GETTER & SETTER-------------------------------

	/**
	 * @return the accesoInvenes
	 */
	public AccesoInvenes getAccesoInvenes() {
		return accesoInvenes;
	}

	/**
	 * @param accesoInvenes
	 *            the accesoInvenes to set
	 */
	public void setAccesoInvenes(AccesoInvenes accesoInvenes) {
		this.accesoInvenes = accesoInvenes;
	}

	/**
	 * @return the lsResultado
	 */
	public List<Patente> getLsResultado() {
		return lsResultado;
	}

	/**
	 * @param lsResultado
	 *            the lsResultado to set
	 */
	public void setLsResultado(List<Patente> lsResultado) {
		this.lsResultado = lsResultado;
	}

	
	

	/**
	 * @return the lsCampos
	 */
	public List<InvenesCampo> getLsCampos() {
		return lsCampos;
	}

	/**
	 * @param lsCampos the lsCampos to set
	 */
	public void setLsCampos(List<InvenesCampo> lsCampos) {
		this.lsCampos = lsCampos;
	}

	/**
	 * @return the idBase
	 */
	public String getIdBase() {
		return idBase;
	}

	/**
	 * @param idBase
	 *            the idBase to set
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
	 * @param idSeccion
	 *            the idSeccion to set
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
	 * @param idArea
	 *            the idArea to set
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
	 * @param idClase
	 *            the idClase to set
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
	 * @param idSubclase
	 *            the idSubclase to set
	 */
	public void setIdSubclase(String idSubclase) {
		this.idSubclase = idSubclase;
	}

	/**
	 * @return the log
	 */
	public Logger getLog() {
		return log;
	}

	/**
	 * @param log
	 *            the log to set
	 */
	public void setLog(Logger log) {
		this.log = log;
	}

	/**
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            the rows to set
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}

	/**
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}

	/**
	 * @param page
	 *            the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * @return the sord
	 */
	public String getSord() {
		return sord;
	}

	/**
	 * @param sord
	 *            the sord to set
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
	 * @param sidx
	 *            the sidx to set
	 */
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}


	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * @return the records
	 */
	public Integer getRecords() {
		return records;
	}

	/**
	 * @param records
	 *            the records to set
	 */
	public void setRecords(Integer records) {
		this.records = records;
	}

	/**
	 * @return the paginado
	 */
	public PageState getPaginado() {
		return paginado;
	}

	/**
	 * @param paginado
	 *            the paginado to set
	 */
	public void setPaginado(PageState paginado) {
		this.paginado = paginado;
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

}
