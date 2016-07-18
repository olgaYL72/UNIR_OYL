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

import es.invenesWEB.model.InvenesBase;
import es.invenesWEB.model.InvenesCampo;

public interface InvenesBBDDService {
	
	
	/**
	 * Busqueda de todos las Bases de datos de invencion en español
	 * @return
	 * @throws Exception
	 */
	public List<InvenesBase> obtenerBases() throws Exception;
	
	/**
	 * Busqueda de todos los elementos InvenesCampo
	 * @return Lista de todos las campos para todas las Bases de datos
	 * @throws Exception
	 */	
	
	public List<InvenesCampo> obtenerCampos() throws Exception;
	
	/**
	 * Busqueda de todos los elementos InvenesCampo para una base concreta
	 * @return Lista de todos las campos para la Bases de datos indicada como parametro
	 * @throws Exception
	 */	
	
	public List<InvenesCampo> obtenerCamposBase(String base) throws Exception;
	
	
	/**
	 * Busqueda de todos los valores para el campo indicado en el parametro
	 * @return Lista delos valores para el campo indicado en el parametro
	 * @throws Exception
	 */	
	
	public List<String> obtenerValoresCampo(Integer idBase, Integer idCampo) throws Exception;
	
	

}
