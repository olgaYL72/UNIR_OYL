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

public class InvenesCampoValor implements Serializable {
private static final long serialVersionUID = 1L;	
	
	@Id
	private String row;		
	private Integer idBase;
	private String idCampo;
	private String idValor;
	private String descripcionCampo;
	private String usuCreacion;
	private Date fechaCreacion;
	private String usuModificacion;
	private Date fechaModificacion;
	
	
	// ------------------ GETTER & SETTER-------------------------------
	
	public String getRow() {
		return row;
	}
	public void setRow(String row) {
		this.row = row;
	}
	
	/**
	 * @return the idBase
	 */
	public Integer getIdBase() {
		return idBase;
	}
	/**
	 * @param idBase the idBase to set
	 */
	public void setIdBase(Integer idBase) {
		this.idBase = idBase;
	}
	/**
	 * @return the idCampo
	 */
	public String getIdCampo() {
		return idCampo;
	}
	/**
	 * @param idCampo the idCampo to set
	 */
	public void setIdCampo(String idCampo) {
		this.idCampo = idCampo;
	}
	/**
	 * @return the idValor
	 */
	public String getIdValor() {
		return idValor;
	}
	/**
	 * @param idValor the idValor to set
	 */
	public void setIdValor(String idValor) {
		this.idValor = idValor;
	}
	/**
	 * @return the descripcionCampo
	 */
	public String getDescripcionCampo() {
		return descripcionCampo;
	}
	/**
	 * @param descripcionCampo the descripcionCampo to set
	 */
	public void setDescripcionCampo(String descripcionCampo) {
		this.descripcionCampo = descripcionCampo;
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
