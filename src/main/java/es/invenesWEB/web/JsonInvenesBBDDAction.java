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
import java.util.List;

import es.invenesWEB.model.InvenesBase;
import es.invenesWEB.model.InvenesCampo;
import es.invenesWEB.model.InvenesCampoValor;
import es.invenesWEB.services.InvenesBBDDService;

public class JsonInvenesBBDDAction implements Serializable{

	 private static final long serialVersionUID = 1L;
	 
	 /**
		 * Resultado de la búsqueda
		 */
		private List<InvenesBase> lsInvenesBases;
		private List<InvenesCampo> lsInvenesCampos;
		private List<InvenesCampoValor> lsInvenesCampoValores;
				
		//servicios
		private InvenesBBDDService  invenesBBDDService;
		
		//parametros  busqueda
		
		private String idBase;
		
		//-------------------------------------------------------------------------------------------//
		//     METODOS PRIVADOS                                                                               //
		//-------------------------------------------------------------------------------------------//	
				
		public void obtenerBases() throws Exception {		
			this.setLsInvenesBases(invenesBBDDService.obtenerBases());
		}
		
		public String  obtenerCampos() throws Exception {
			if(this.getIdBase()!=null  &&  !"-1".equals(this.getIdBase()) ){
			this.setLsInvenesCampos(invenesBBDDService.obtenerCamposBase(idBase));
			}			
			return "listadoCampos";
		}
				
	// ------------------ GETTER & SETTER-------------------------------

		/**
		 * @return the lsInvenesBases
		 */
		public List<InvenesBase> getLsInvenesBases() {
			return lsInvenesBases;
		}

		/**
		 * @param lsInvenesBases the lsInvenesBases to set
		 */
		public void setLsInvenesBases(List<InvenesBase> lsInvenesBases) {
			this.lsInvenesBases = lsInvenesBases;
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
		 * @return the lsInvenesCampoValores
		 */
		public List<InvenesCampoValor> getLsInvenesCampoValores() {
			return lsInvenesCampoValores;
		}

		/**
		 * @param lsInvenesCampoValores the lsInvenesCampoValores to set
		 */
		public void setLsInvenesCampoValores(
				List<InvenesCampoValor> lsInvenesCampoValores) {
			this.lsInvenesCampoValores = lsInvenesCampoValores;
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
		
			
		
}
