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

import javax.persistence.Id;

public class CIPArea implements Serializable {
	private static final long serialVersionUID = 1L;
	
@Id
	private String idArea;
	private String idSeccion;
	private String descripcionArea;
	private String usuCreacion;
	private Date fechaCreacion;
	private String usuModificacion;
	private Date fechaModificacion;
	
	
	// ------------------ GETTER & SETTER-------------------------------
	/**
	 * @return the row
	 */
//	public String getRow() {
//		return row;
//	}
	/**
	 * @param row the row to set
	 */
//	public void setRow(String row) {
//		this.row = row;
//	}
	
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
	 * @return the descripcionArea
	 */
	public String getDescripcionArea() {
		return descripcionArea;
	}
	/**
	 * @param descripcionArea the descripcionArea to set
	 */
	public void setDescripcionArea(String descripcionArea) {
		this.descripcionArea = descripcionArea;
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
