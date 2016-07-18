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

import es.invenesWEB.dao.InvenesBaseDAO;
import es.invenesWEB.dao.InvenesCampoDAO;
import es.invenesWEB.dao.InvenesCampoValorDAO;
import es.invenesWEB.model.InvenesBase;
import es.invenesWEB.model.InvenesCampo;

public class InvenesBBDDServiceImpl implements InvenesBBDDService {
	
	InvenesBaseDAO baseDAO;
	InvenesCampoDAO campoDAO;
	InvenesCampoValorDAO campoValorDAO;

	@Override
	public List<InvenesBase> obtenerBases() throws Exception {
		return baseDAO.obtenerTodas();
	}

	@Override
	public List<InvenesCampo> obtenerCampos() throws Exception {
		return campoDAO.obtenerTodos();
	}

	@Override
	public List<InvenesCampo> obtenerCamposBase(String idBase) throws Exception {
		return campoDAO.obtenerTodosBase(idBase);
	}

	@Override
	public List<String> obtenerValoresCampo(Integer idBase, Integer idCampo)
			throws Exception {
		return campoValorDAO.obtenerValores(idBase, idCampo);
	}


	// ------------------ GETTER & SETTER-------------------------------
	

	/**
	 * @return the baseDAO
	 */
	public InvenesBaseDAO getBaseDAO() {
		return baseDAO;
	}

	/**
	 * @param baseDAO the baseDAO to set
	 */
	public void setBaseDAO(InvenesBaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	/**
	 * @return the campoDAO
	 */
	public InvenesCampoDAO getCampoDAO() {
		return campoDAO;
	}

	/**
	 * @param campoDAO the campoDAO to set
	 */
	public void setCampoDAO(InvenesCampoDAO campoDAO) {
		this.campoDAO = campoDAO;
	}

	/**
	 * @return the campoValorDAO
	 */
	public InvenesCampoValorDAO getCampoValorDAO() {
		return campoValorDAO;
	}

	/**
	 * @param campoValorDAO the campoValorDAO to set
	 */
	public void setCampoValorDAO(InvenesCampoValorDAO campoValorDAO) {
		this.campoValorDAO = campoValorDAO;
	}
}
