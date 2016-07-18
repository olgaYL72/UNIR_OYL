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

import java.util.List;

import es.oracle.invenes.ws.Reference;

public class Patente {

	//Titulo
	private String titulo;
	//Referencia
	private String referencia;
	//Inventores
	private String inventor;
	//Número de Publicación
	private String numPublicacion;
	//Número de solicitud
	private String Solicitud;
	//Clasificación Internacional
	private String clasificacionInternacional;
	//Clasificacion CPC
	private String clasificacionCPC;
	//Nombre del primer solicitante
	private String solicitante;
	//Dirección del primer solicitante
	private String direccionSolicitante;
	//Otras Publicaciones
	private String otrasPublicaciones;
	//Prioridades
	private String prioridad;
	
	//Url de imagen
	private String urlImage;
	//url consulta de patente en web OEPM
	private String urlReference;
	//Lista de url a los Pdf de la patente si los hubiera
	private List<Object> urlsPDF;
	
	
	
	public Patente(Reference ref)
	{
		this.setNumPublicacion(ref.getPublicationNumber());
		this.setReferencia( ref.getIdReference());
		this.setUrlImage(ref.getUrlImage());
		this.setUrlReference(ref.getUrlReference());
		this.setUrlsPDF(ref.getUrlsPDF());
		
		
		 for(int j=0; j<ref.getFieldNames().size(); j++)
		 {
			 switch (ref.getFieldNames().get(j)) {
			 case "TITULO": 
				 this.setTitulo(ref.getFieldValues().get(j));
				 break;
			 case "INVENTOR":
				 this.setInventor(ref.getFieldValues().get(j));
				 break;
			 case "SOLICITUD":
				 this.setSolicitud(ref.getFieldValues().get(j));
				 break;
			 case "CLAINT":
				 this.setClasificacionInternacional(ref.getFieldValues().get(j));
				 break;
			 case "CPC":
				 this.setClasificacionCPC(ref.getFieldValues().get(j));
				 break;
			 case "SOLICITANTE":
				 this.setSolicitante(ref.getFieldValues().get(j));
				 break;
			 case "DIRE": 
				 this.setDireccionSolicitante(ref.getFieldValues().get(j));
				 break;
			 case "OTRAS":
				 this.setOtrasPublicaciones(ref.getFieldValues().get(j));
				 break;
			 case "PRIORIDAD": 
				 this.setPrioridad(ref.getFieldValues().get(j));
				 break;
			 }
			 
		 }
	}
	// ------------------ GETTER & SETTER-------------------------------
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the referencia
	 */
	public String getReferencia() {
		return referencia;
	}
	/**
	 * @param referencia the referencia to set
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	/**
	 * @return the inventor
	 */
	public String getInventor() {
		return inventor;
	}
	/**
	 * @param inventor the inventor to set
	 */
	public void setInventor(String inventor) {
		this.inventor = inventor;
	}
	/**
	 * @return the numPublicacion
	 */
	public String getNumPublicacion() {
		return numPublicacion;
	}
	/**
	 * @param numPublicacion the numPublicacion to set
	 */
	public void setNumPublicacion(String numPublicacion) {
		this.numPublicacion = numPublicacion;
	}
	/**
	 * @return the solicitud
	 */
	public String getSolicitud() {
		return Solicitud;
	}
	/**
	 * @param solicitud the solicitud to set
	 */
	public void setSolicitud(String solicitud) {
		Solicitud = solicitud;
	}
	/**
	 * @return the clasificacionInternacionalt
	 */
	public String getClasificacionInternacional() {
		return clasificacionInternacional;
	}
	/**
	 * @param clasificacionInternacionalt the clasificacionInternacionalt to set
	 */
	public void setClasificacionInternacional(String clasificacionInternacional) {
		this.clasificacionInternacional= clasificacionInternacional;
	}
	/**
	 * @return the clasificacionCPC
	 */
	public String getClasificacionCPC() {
		return clasificacionCPC;
	}
	/**
	 * @param clasificacionCPC the clasificacionCPC to set
	 */
	public void setClasificacionCPC(String clasificacionCPC) {
		this.clasificacionCPC = clasificacionCPC;
	}
	/**
	 * @return the solicitante
	 */
	public String getSolicitante() {
		return solicitante;
	}
	/**
	 * @param solicitante the solicitante to set
	 */
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	/**
	 * @return the direccionSolicitante
	 */
	public String getDireccionSolicitante() {
		return direccionSolicitante;
	}
	/**
	 * @param direccionSolicitante the direccionSolicitante to set
	 */
	public void setDireccionSolicitante(String direccionSolicitante) {
		this.direccionSolicitante = direccionSolicitante;
	}
	/**
	 * @return the otrasPublicaciones
	 */
	public String getOtrasPublicaciones() {
		return otrasPublicaciones;
	}
	/**
	 * @param otrasPublicaciones the otrasPublicaciones to set
	 */
	public void setOtrasPublicaciones(String otrasPublicaciones) {
		this.otrasPublicaciones = otrasPublicaciones;
	}
	/**
	 * @return the prioridad
	 */
	public String getPrioridad() {
		return prioridad;
	}
	/**
	 * @param prioridad the prioridad to set
	 */
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	/**
	 * @return the urlImage
	 */
	public String getUrlImage() {
		return urlImage;
	}
	/**
	 * @param urlImage the urlImage to set
	 */
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	/**
	 * @return the urlReference
	 */
	public String getUrlReference() {
		return urlReference;
	}
	/**
	 * @param urlReference the urlReference to set
	 */
	public void setUrlReference(String urlReference) {
		this.urlReference = urlReference;
	}
	/**
	 * @return the urlsPDF
	 */
	public List<Object> getUrlsPDF() {
		return urlsPDF;
	}
	/**
	 * @param urlsPDF the urlsPDF to set
	 */
	public void setUrlsPDF(List<Object> urlsPDF) {
		this.urlsPDF = urlsPDF;
	}
	
	
}
