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

package es.invenesWEB.services;

import java.util.List;

import es.invenesWEB.model.CIPArea;
import es.invenesWEB.model.CIPClase;
import es.invenesWEB.model.CIPSeccion;
import es.invenesWEB.model.CIPSubClase;

public interface CIPBBDDService {
	
	/**
	 * Busqueda de todos las secciones de la Clasificacion Internacional Patentes
	 * @return Lista de todos las secciones de clasificacion CIP
	 * @throws Exception
	 */	
	
	public List<CIPSeccion> obtenerSecciones() throws Exception;
	
	/**
	 * Busqueda de todos las areas 
	 * @return Lista de todos las areas de clasificacion CIP
	 * @throws Exception
	 */	
	
	public List<CIPArea> obtenerAreas() throws Exception;
	
	/**
	 * Busqueda de  las areas de una Seccion
	 * @return Lista de todos las areas de clasificacion CIP
	 * @throws Exception
	 */	
	
	public List<CIPArea> obtenerAreasSeccion(String idSeccion) throws Exception;
	

	/**
	 * Busqueda de todos las clases de un  area
	 * @return Lista de todos las clases de un area
	 * @throws Exception
	 */	
	
	public List<CIPClase> obtenerClasesArea( String idArea) throws Exception;
	
	
	/**
	 * Busqueda de  las Subclases de una Clase
	 * @return Lista de todos las Subclases de una Clase
	 * @throws Exception
	 */	
	
	public List<CIPSubClase> obtenerSubclases(String idClase) throws Exception;
	
	
}
