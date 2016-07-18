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

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import es.invenesWEB.model.CIPClase;

public class CIPClaseDAOJPA implements CIPClaseDAO {

	/** Logger */
	private Logger log = Logger.getLogger(CIPClaseDAOJPA.class);
	
	EntityManager em;
	
	
	
	
	@Override
	public List<CIPClase> obtenerTodasArea(String idArea) throws Exception {
		
		StringBuffer sql = new StringBuffer("SELECT t FROM CIPClase t WHERE  idArea='"+idArea+"' ORDER BY idClase");		
		Query query = em.createQuery(sql.toString());
		return query.getResultList();
		
		
	}

	
	@PersistenceContext
	public void setEntityManager(EntityManager value) {
		this.em = value;
	}

	public EntityManager getEntityManager() {
		return this.em;
	}
}
