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

package es.invenesWEB.wsOEPM;

import es.oracle.invenes.ws.InvenesSearch;
import es.oracle.invenes.ws.InvenesSearchService;


/**
 * Esta clase será el bean que contenga el idConexion a Invenes 
 */
public class AccesoInvenes {
	
	private ConfiguracionInvenes configuracionInvenes; 	
	private String idConexion;
	private InvenesSearch invenesServicio;
	
	public String execute() throws Exception {    
		
	 InvenesSearchService invenesBusqService =	new InvenesSearchService();
     InvenesSearch invenesBusq =	invenesBusqService.getInvenesSearchService();    
  
	   if (invenesBusq!=null){
		 String idConexion = invenesBusq.doLogin(configuracionInvenes.getInvenesUsuario(),configuracionInvenes.getInvenesClaveAcceso());
		 
		 if (idConexion!=null){
		  this.setIdConexion(idConexion);
		  this.setInvenesServicio(invenesBusq);
		 }
	 }	  		 
     return "main";
	}
	
	
	
	 public void reconectar() throws Exception{
		 InvenesSearchService invenesBusqService =	new InvenesSearchService();
	     InvenesSearch invenesBusq =	invenesBusqService.getInvenesSearchService();    
	  
		   if (invenesBusq!=null){
			 String idConexion = invenesBusq.doLogin(configuracionInvenes.getInvenesUsuario(),configuracionInvenes.getInvenesClaveAcceso());
			 
			 if (idConexion!=null){
			  this.setIdConexion(idConexion);
			  this.setInvenesServicio(invenesBusq);
			 }
		 }	  		 
	   }

	// ------------------ GETTER & SETTER-------------------------------
    
    
	/**
	 * @return the configuracionInvenes
	 */
	public ConfiguracionInvenes getConfiguracionInvenes() {
		return configuracionInvenes;
	}
	/**
	 * @param configuracionInvenes the configuracionInvenes to set
	 */
	public void setConfiguracionInvenes(ConfiguracionInvenes configuracionInvenes) {
		this.configuracionInvenes = configuracionInvenes;
	}


	/**
	 * @return the idConexion
	 */
	public String getIdConexion() {
		return idConexion;
	}


	/**
	 * @param idConexion the idConexion to set
	 */
	public void setIdConexion(String idConexion) {
		this.idConexion = idConexion;
	}


	/**
	 * @return the invenesServicio
	 */
	public InvenesSearch getInvenesServicio() {
		return invenesServicio;
	}


	/**
	 * @param invenesServicio the invenesServicio to set
	 */
	public void setInvenesServicio(InvenesSearch invenesServicio) {
		this.invenesServicio = invenesServicio;
	}
	
	
	
}
