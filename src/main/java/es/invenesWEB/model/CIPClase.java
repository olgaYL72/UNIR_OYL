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

package es.invenesWEB.model;

import java.io.Serializable;
import java.util.Date;

public class CIPClase implements Serializable {
	private static final long serialVersionUID = 1L;

	private String idArea;
	private String idClase;
	private String descripcionClase;
	private String descripcionClaseLarga;
	private String usuCreacion;
	private Date fechaCreacion;
	private String usuModificacion;
	private Date fechaModificacion;
	
	
	// ------------------ GETTER & SETTER-------------------------------
	
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
	 * @return the descripcionClase
	 */
	public String getDescripcionClase() {
		return descripcionClase;
	}
	/**
	 * @param descripcionClase the descripcionClase to set
	 */
	public void setDescripcionClase(String descripcionClase) {
		this.descripcionClase = descripcionClase;
	}
	
		/**
	 * @return the descripcionClaseLarga
	 */
	public String getDescripcionClaseLarga() {
		return descripcionClaseLarga;
	}
	/**
	 * @param descripcionClaseLarga the descripcionClaseLarga to set
	 */
	public void setDescripcionClaseLarga(String descripcionClaseLarga) {
		this.descripcionClaseLarga = descripcionClaseLarga;
	}
	/**
	 * @return the usuCreacion
	 */
	public String getUsuCreacion() {
		return usuCreacion;
	}
	/**
	 * @param usuCreacion the usuCreacion to set
	 */
	public void setUsuCreacion(String usuCreacion) {
		this.usuCreacion = usuCreacion;
	}
	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the usuModificacion
	 */
	public String getUsuModificacion() {
		return usuModificacion;
	}
	/**
	 * @param usuModificacion the usuModificacion to set
	 */
	public void setUsuModificacion(String usuModificacion) {
		this.usuModificacion = usuModificacion;
	}
	/**
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	

}
