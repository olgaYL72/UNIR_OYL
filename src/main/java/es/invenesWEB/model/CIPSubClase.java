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

public class CIPSubClase implements Serializable {
	private static final long serialVersionUID = 1L;

	private String idClase;
	private String idSubclase;
	private String descripcionSubclase;
	private String descripcionSubclaseLarga;
	private String usuCreacion;
	private Date fechaCreacion;
	private String usuModificacion;
	private Date fechaModificacion;
	

	// ------------------ GETTER & SETTER-------------------------------
	
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
	 * @return the descripcionSubclase
	 */
	public String getDescripcionSubclase() {
		return descripcionSubclase;
	}
	/**
	 * @param descripcionSubclase the descripcionSubclase to set
	 */
	public void setDescripcionSubclase(String descripcionSubclase) {
		this.descripcionSubclase = descripcionSubclase;
	}
	/**
	 * @return the descripcionSubclaseLarga
	 */
	public String getDescripcionSubclaseLarga() {
		return descripcionSubclaseLarga;
	}
	/**
	 * @param descripcionSubclaseLarga the descripcionSubclaseLarga to set
	 */
	public void setDescripcionSubclaseLarga(String descripcionSubclaseLarga) {
		this.descripcionSubclaseLarga = descripcionSubclaseLarga;
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
