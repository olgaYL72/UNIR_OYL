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

package es.invenesWEB.wsOEPM;

import es.oracle.invenes.ws.InvenesProperties;
import es.oracle.invenes.ws.InvenesWebException_Exception;

/**
 * The Interface InvenesService.
 */

public interface InvenesService {

	/**
     * Verificar el usuario y devolver un token de acceso válido para la utilización de los web services
     *  
     * @param identificadorUsuario
     *            identificador Usuario
     * @param claveAccesoUsuario
     *            clave de Acceso
     */
	
    
    public String doLogin( String identificadorUsuario, String claveAccesoUsuario ) throws InvenesWebException_Exception;
 

	/**
     *     Devuelve una lista de pares valor-etiqueta con las bases que se pueden consultar.
     *     
     *   @param tokenAcceso
     *     Token alfanumérico de acceso válido.
     */
    
    public InvenesProperties getBases(String tokenAcceso);
    
    public String obtenerTestigo();
    
}
