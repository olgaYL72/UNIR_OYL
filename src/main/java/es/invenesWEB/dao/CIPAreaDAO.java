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

package es.invenesWEB.dao;

import java.util.List;

import es.invenesWEB.model.CIPArea;

public interface CIPAreaDAO {
	/**
	 * Busqueda de todos las areas 
	 * @return Lista de todos las areas de clasificacion CIPl
	 * @throws Exception
	 */	
	
	public List<CIPArea> obtenerTodas() throws Exception;
	
	/**
	 * Busqueda de  las areas de una sección concreta
	 * @return Lista de todos las areas asociadas a una sección de clasificacion CIP
	 * @throws Exception
	 */	
	
	public List<CIPArea> obtenerAreasSeccion(String idSeccion) throws Exception;
	
}
