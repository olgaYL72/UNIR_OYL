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

public class PageState {

	private int page;
	private int max;
	private int pageSize;
	private int listSize;
	/** Campos para el orden*/
	private String orderType = "asc";
	private String orderBy;
	
	/**
	 * Constructor
	 * @param size tamaï¿½o de la lista
	 */
	public PageState(int size) {
		pageSize = size;
		page = 1;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
		
		if(listSize % pageSize == 0){
			this.max = listSize / pageSize;
		} else{
			this.max = listSize / pageSize + 1; // trunca automaticamente			
		}
	}

	public int getFirstResult() {
		return Math.max( (page - 1) * pageSize + 1, 1);
	}
	
	public int getMaxResults() {
		return pageSize;
	}
		
	public boolean existNext(){
		return page<max;
	}
	
	public boolean existPrev(){
		return page!=1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PageState [listSize=");
		builder.append(listSize);
		builder.append(", max=");
		builder.append(max);
		builder.append(", page=");
		builder.append(page);
		builder.append(", pageSize=");
		builder.append(pageSize);
		builder.append(']');
		return builder.toString();
	}



	/**
	 * Retorna el valor del atributo orderType
	 * @return the orderType
	 */
	public String getOrderType() {
		return this.orderType;
	}

	/**
	 * Rellena el valor del atributo orderType
	 * @param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * Retorna el valor del atributo orderBy
	 * @return the orderBy
	 */
	public String getOrderBy() {
		return this.orderBy;
	}

	/**
	 * Rellena el valor del atributo orderBy
	 * @param orderBy the orderBy to set
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
}
