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

import es.oracle.invenes.ws.InvenesProperties;
import es.oracle.invenes.ws.InvenesWebException_Exception;

public class InvenesServiceImpl implements InvenesService {
	
	/** The constantes ws. */
  	private ConfiguracionInvenes configuracionInvenes; 	
  	private String tokenAcceso;		
  
  	
  	/** Log.
     */
   // private static final Logger LOG = Logger.getLogger(InvenesServiceImpl.class);

	@Override
	public String doLogin(String identificadorUsuario, String claveAccesoUsuario)
			throws InvenesWebException_Exception {		
		
		tokenAcceso= doLogin(configuracionInvenes.getInvenesUsuario(), configuracionInvenes.getInvenesClaveAcceso());
		
		return tokenAcceso;
	}

	@Override
	public InvenesProperties getBases(String tokenAcceso) {		
		return getBases(tokenAcceso);
	}

	
	public String obtenerTestigo(){
		if (tokenAcceso !=null)			
			return tokenAcceso;
		else
		{
			try{
			 return doLogin(configuracionInvenes.getInvenesUsuario(), configuracionInvenes.getInvenesClaveAcceso());
					}catch (Exception e)
					{
							return "ERROR";
					}
			}
		
	}//obtenerTestigo

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
	
	
}
