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

import es.invenesWEB.dao.CIPAreaDAO;
import es.invenesWEB.dao.CIPClaseDAO;
import es.invenesWEB.dao.CIPSeccionDAO;
import es.invenesWEB.dao.CIPSubclaseDAO;
import es.invenesWEB.model.CIPArea;
import es.invenesWEB.model.CIPClase;
import es.invenesWEB.model.CIPSeccion;
import es.invenesWEB.model.CIPSubClase;

public class CIPBBDDServiceImpl implements CIPBBDDService {


	CIPSeccionDAO CIPSeccionDAO;
	CIPAreaDAO CIPAreaDAO;
	CIPClaseDAO CIPClaseDAO;	
	CIPSubclaseDAO  CIPSubclaseDAO;	
	
	@Override
	public List<CIPSeccion> obtenerSecciones() throws Exception {		
		return CIPSeccionDAO.obtenerTodas();
	}

	@Override
	public List<CIPArea> obtenerAreas() throws Exception {
		return CIPAreaDAO.obtenerTodas();
	}

	@Override	
	public List<CIPArea> obtenerAreasSeccion(String idSeccion) throws Exception{		
		return CIPAreaDAO.obtenerAreasSeccion(idSeccion);
	}
	
	
	@Override
	public List<CIPClase> obtenerClasesArea(String idArea) throws Exception {
		
		return CIPClaseDAO.obtenerTodasArea(idArea);
	}
	
	@Override
	public List<CIPSubClase> obtenerSubclases(String idClase) throws Exception{
		return  CIPSubclaseDAO.obtenerTodasClase(idClase);
	}


	// ------------------ GETTER & SETTER-------------------------------
	/**
	 * @return the cIPSeccionDAO
	 */
	public CIPSeccionDAO getCIPSeccionDAO() {
		return CIPSeccionDAO;
	}

	/**
	 * @param cIPSeccionDAO the cIPSeccionDAO to set
	 */
	public void setCIPSeccionDAO(CIPSeccionDAO cIPSeccionDAO) {
		CIPSeccionDAO = cIPSeccionDAO;
	}

	/**
	 * @return the cIPAreaDAO
	 */
	public CIPAreaDAO getCIPAreaDAO() {
		return CIPAreaDAO;
	}

	/**
	 * @param cIPAreaDAO the cIPAreaDAO to set
 */
	public void setCIPAreaDAO(CIPAreaDAO cIPAreaDAO) {
		CIPAreaDAO = cIPAreaDAO;
	}

	/**
	 * @return the cIPClaseDAO
	 */
	public CIPClaseDAO getCIPClaseDAO() {
		return CIPClaseDAO;
	}

	/**
	 * @param cIPClaseDAO the cIPClaseDAO to set
	 */
	public void setCIPClaseDAO(CIPClaseDAO cIPClaseDAO) {
		CIPClaseDAO = cIPClaseDAO;
	}

	/**
	 * @return the cIPSubclaseDAO
	 */
	public CIPSubclaseDAO getCIPSubclaseDAO() {
		return CIPSubclaseDAO;
	}

	/**
	 * @param cIPSubclaseDAO the cIPSubclaseDAO to set
	 */
	public void setCIPSubclaseDAO(CIPSubclaseDAO cIPSubclaseDAO) {
		CIPSubclaseDAO = cIPSubclaseDAO;
	}
	
	
}
