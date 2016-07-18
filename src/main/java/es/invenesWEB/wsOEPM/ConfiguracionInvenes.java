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


/**
 * La clase  ConfiguracionInvenes
 */

public class ConfiguracionInvenes {

	 /** The url invenesEndPoint. */
    private String invenesEndPoint;
    
    /** The string  invenesUsuario. */
    private String invenesUsuario;
    
    /** The string  invenesClaveAcceso */
    private String invenesClaveAcceso;
    
    /** The string  almacenCertificados */
    private String almacenCertificados;
    
    /** The string  almacenClave */
    private String almacenClave;

	/**
	 * @return the invenesEndPoint
	 */
	public String getInvenesEndPoint() {
		return invenesEndPoint;
	}

	/**
	 * @param invenesEndPoint the invenesEndPoint to set
	 */
	public void setInvenesEndPoint(String invenesEndPoint) {
		this.invenesEndPoint = invenesEndPoint;
	}

	/**
	 * @return the invenesUsuario
	 */
	public String getInvenesUsuario() {
		return invenesUsuario;
	}

	/**
	 * @param invenesUsuario the invenesUsuario to set
	 */
	public void setInvenesUsuario(String invenesUsuario) {
		this.invenesUsuario = invenesUsuario;
	}

	/**
	 * @return the invenesClaveAcceso
	 */
	public String getInvenesClaveAcceso() {
		return invenesClaveAcceso;
	}

	/**
	 * @param invenesClaveAcceso the invenesClaveAcceso to set
	 */
	public void setInvenesClaveAcceso(String invenesClaveAcceso) {
		this.invenesClaveAcceso = invenesClaveAcceso;
	}

	/**
	 * @return the almacenCertificados
	 */
	public String getAlmacenCertificados() {
		return almacenCertificados;
	}

	/**
	 * @param almacenCertificados the almacenCertificados to set
	 */
	public void setAlmacenCertificados(String almacenCertificados) {
		this.almacenCertificados = almacenCertificados;
	}

	/**
	 * @return the almacenClave
	 */
	public String getAlmacenClave() {
		return almacenClave;
	}

	/**
	 * @param almacenClave the almacenClave to set
	 */
	public void setAlmacenClave(String almacenClave) {
		this.almacenClave = almacenClave;
	}
    

        
}
