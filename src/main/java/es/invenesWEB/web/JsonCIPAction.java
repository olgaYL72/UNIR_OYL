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

import es.invenesWEB.model.CIPArea;
import es.invenesWEB.model.CIPClase;
import es.invenesWEB.model.CIPSeccion;
import es.invenesWEB.model.CIPSubClase;
import es.invenesWEB.services.CIPBBDDService;



public class JsonCIPAction  implements Serializable{

	 private static final long serialVersionUID = 1L;
	 
	 
	 private String idSeccion;
	 private String idArea;
	 private String idClase;
	 private String idSubclase;

	 
	 /**
		 * Resultado de la búsqueda
		 */
		private List<CIPSeccion> lsSecciones;
		private List<CIPArea> lsAreas;
		private List<CIPClase> lsClases;
		private List<CIPSubClase> lsSubclases;
				
		//servicios
		private CIPBBDDService  CIPService;

	
		
		//-------------------------------------------------------------------------------------------//
		//     METODOS PRIVADOS                                                                               //
		//-------------------------------------------------------------------------------------------//	
				
		public String obtenerSecciones() throws Exception {
			this.setLsSecciones(CIPService.obtenerSecciones());	
			return "listadoSecciones";
		}

		public String obtenerAreas() throws Exception {
			if  ( this.getIdSeccion() != null && !"".equals(this.getIdSeccion() ) ){
					this.setLsAreas(CIPService.obtenerAreasSeccion(this.getIdSeccion() ));						
			}
					
			return "listadoAreasSeccion";
		}		
						
		public String obtenerClases() throws Exception {
			if  ( this.getIdArea() != null && !"".equals(this.getIdArea() ) ){
					this.setLsClases(CIPService.obtenerClasesArea(this.getIdArea()));					
			}			
			
		return "listadoClases";
		}
		
		public String obtenerSubclases() throws Exception {
			if  ( this.getIdClase() != null && !"".equals(this.getIdClase() ) ){
					this.setLsSubclases(CIPService.obtenerSubclases(this.getIdClase()));			
			}			
			
		return "listadoSubclases";
		}
		
		
		// ------------------ GETTER & SETTER-------------------------------
		
	
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
		 * @return the lsSecciones
		 */
		public List<CIPSeccion> getLsSecciones() {
			return lsSecciones;
		}

		
		/**
		 * @param lsSecciones the lsSecciones to set
		 */
		public void setLsSecciones(List<CIPSeccion> lsSecciones) {
			this.lsSecciones = lsSecciones;
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
		 * @return the lsClase
		 */
		public List<CIPClase> getLsClases() {
			return lsClases;
		}

		/**
		 * @param lsClase the lsClase to set
		 */
		public void setLsClases(List<CIPClase> lsClase) {
			this.lsClases = lsClase;
		}

				
		/**
		 * @return the lsSubclases
		 */
		public List<CIPSubClase> getLsSubclases() {
			return lsSubclases;
		}

		/**
		 * @param lsSubclases the lsSubclases to set
		 */
		public void setLsSubclases(List<CIPSubClase> lsSubclases) {
			this.lsSubclases = lsSubclases;
		}

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
}
