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


import java.util.List;

import es.invenesWEB.model.CIPArea;
import es.invenesWEB.model.CIPClase;
import es.invenesWEB.model.CIPSeccion;
import es.invenesWEB.model.InvenesBase;
import es.invenesWEB.model.InvenesCampo;
import es.invenesWEB.model.InvenesCampoValor;
import es.invenesWEB.services.CIPBBDDService;
import es.invenesWEB.services.InvenesBBDDService;

public class BusquedaAction {
	private static final long serialVersionUID = 1L;
	
	private static final String CANCELAR = "cancelar";
	private static final String BUSCAR = "inputSimple";
	private static final String BUSCAR_PLUS= "inputAvanzada";
		
	
	//SERVICIOS	
	private CIPBBDDService CIPService;
	private InvenesBBDDService invenesBBDDService;
	
	// Listas Clasificacion Internacional Patentes
	private List<CIPSeccion> lsCIPSecciones;
	private List<CIPArea> lsAreas;
	private List<CIPClase> lsClases;
	
	//Listas busquedas Invenes
	private List<InvenesBase> lsBases;
	private List<InvenesCampo> lsInvenesCampos;
	private List<InvenesCampoValor> lsCampoValores;
	
	// Para la paginación del grid
	private Integer rows =JsonInvenesAction.NUMERO_REGISTROS_POR_DEFECTO;
	private Integer page =JsonInvenesAction.NUMERO_PRIMERA_PAGINA_POR_DEFECTO;
	private String sord =JsonInvenesAction. ORDENACION_POR_DEFECTO;
	private String sidx;
	private Integer records;
	
	public String simple() throws Exception {    
		
		this.setLsBases(invenesBBDDService.obtenerBases());
		
		//En la base de datos de Diseños no se está guardando el dato de CIP
		this.lsBases.remove(2);
		
		return BUSCAR;
	}
	
	
	public String avanzada() throws Exception {    
		
		this.setLsBases(invenesBBDDService.obtenerBases());

		return BUSCAR_PLUS;
	}
	
	public boolean tieneResultados(){
		if(this.getRecords()!=null && this.getRecords()>0)
			return true;
		else
			return false;
	}
	
	/**
	 * Metodo que cancela la operacion  y retorna a la pagina inicial
	 * @return String
	 */
  public String cancelar() {
  	  	return CANCELAR;
  }

   

	// ------------------ GETTER & SETTER-------------------------------
	
  /**
	 * @return the cIPService
	 */
	public CIPBBDDService getCIPService() {
		return CIPService;
	}


	/**
	 * @param cIPService the cIPService to set
	 */
	public void setCIPService(CIPBBDDService cIPService) {
		CIPService = cIPService;
	}
	
	
	
	


	/**
	 * @return the invenesBBDDService
	 */
	public InvenesBBDDService getInvenesBBDDService() {
		return invenesBBDDService;
	}


	/**
	 * @param invenesBBDDService the invenesBBDDService to set
	 */
	public void setInvenesBBDDService(InvenesBBDDService invenesBBDDService) {
		this.invenesBBDDService = invenesBBDDService;
	}


	/**
	 * @return the lsCIPSecciones
	 */
	public List<CIPSeccion> getLsCIPSecciones() {
		return lsCIPSecciones;
	}
	
	/**
	 * @param lsCIPSecciones the lsCIPSecciones to set
	 */
	public void setLsCIPSecciones(List<CIPSeccion> lsCIPSecciones) {
		this.lsCIPSecciones = lsCIPSecciones;
	}
	/**
	 * @return the lsAreas
	 */
	public List<CIPArea> getLsAreas() {
		return lsAreas;
	}
	/**
	 * @param lsAreas the lsAreas to set
	 */
	public void setLsAreas(List<CIPArea> lsAreas) {
		this.lsAreas = lsAreas;
	}
	/**
	 * @return the lsClases
	 */
	public List<CIPClase> getLsClases() {
		return lsClases;
	}
	/**
	 * @param lsClases the lsClases to set
	 */
	public void setLsClases(List<CIPClase> lsClases) {
		this.lsClases = lsClases;
	}
	/**
	 * @return the lsBases
	 */
	public List<InvenesBase> getLsBases() {
		return lsBases;
	}
	/**
	 * @param lsBases the lsBases to set
	 */
	public void setLsBases(List<InvenesBase> lsBases) {
		this.lsBases = lsBases;
	}
		
	
	/**
	 * @return the lsInvenesCampos
	 */
	public List<InvenesCampo> getLsInvenesCampos() {
		return lsInvenesCampos;
	}


	/**
	 * @param lsInvenesCampos the lsInvenesCampos to set
	 */
	public void setLsInvenesCampos(List<InvenesCampo> lsInvenesCampos) {
		this.lsInvenesCampos = lsInvenesCampos;
	}


	/**
	 * @return the lsCampoValores
	 */
	public List<InvenesCampoValor> getLsCampoValores() {
		return lsCampoValores;
	}
	/**
	 * @param lsCampoValores the lsCampoValores to set
	 */
	public void setLsCampoValores(List<InvenesCampoValor> lsCampoValores) {
		this.lsCampoValores = lsCampoValores;
	}


	/**
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}


	/**
	 * @param rows the rows to set
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
	 * @param page the page to set
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
	 * @return the records
	 */
	public Integer getRecords() {
		return records;
	}


	/**
	 * @param records the records to set
	 */
	public void setRecords(Integer records) {
		this.records = records;
	}
	
	   
	
}
