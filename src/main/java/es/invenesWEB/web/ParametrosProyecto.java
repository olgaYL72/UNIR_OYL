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

/** 
 * En las propiedades del proyecto se pueden incluir variables parametrizables y obtenerlas del bean
  *
 */

public final class ParametrosProyecto {

	 /** La ruta externalizada de los jasper para Informes. */
	 public static String  rutaFicherosJasper="";
    
    private  ParametrosProyecto() {
    	
    }
    
 // ------------------ GETTER & SETTER-------------------------------

    
	/**
	 * @param rutaFicherosJasper the rutaFicherosJasper to set
	 */
	public  void setRutaFicherosJasper(String rutaFicherosJasper) {
		ParametrosProyecto.rutaFicherosJasper = rutaFicherosJasper;
	}
  
    
    
}
