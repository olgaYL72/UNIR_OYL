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
import java.util.List;

import es.invenesWEB.services.CIPBBDDService;
import es.invenesWEB.wsOEPM.AccesoInvenes;
import es.oracle.invenes.ws.InvenesProperties;
import es.oracle.invenes.ws.InvenesSearch;
import es.oracle.invenes.ws.LabelValueBean;
import es.oracle.invenes.ws.Reference;
import es.oracle.invenes.ws.SearchResult;

public class InicioAction  {
	
	
	private static final String CANCELAR = "cancelar";
	private static final String INPUT = "input";
	
	private AccesoInvenes accesoInvenes;
	private List<LabelValueBean> listaCampos;
	
	
	
	/**
	 * Accion por defecto, mostrará una pagina con los resultados de llamada al WS invenes
	 * 
 	 * @return String
	 */
	
	public String execute() throws Exception {    	
		
		/*ApplicationContextProvider appContext = new ApplicationContextProvider();
		ConfiguracionInvenes configuracionInvenes=appContext.getApplicationContext().getBean("configuracionInvenes",ConfiguracionInvenes.class);				
		this.setConfiguracionInvenes(configuracionInvenes);
		 */
		
	     InvenesSearch invenesBusq =	accesoInvenes.getInvenesServicio();
		  
		 if (invenesBusq!=null){
			/* String idConexion = invenesBusq.doLogin(configuracionInvenes.getInvenesUsuario(),configuracionInvenes.getInvenesClaveAcceso());
			 
			 if (idConexion==null){
				 // Lanzar excepcion y error de conexión con el servicio
			 }
			 */
			 
			 InvenesProperties invenesProperties = invenesBusq.getBases(accesoInvenes.getIdConexion());	
		       //Consulta codigos estandar
		        
		        List<LabelValueBean> lista = invenesProperties.getLabelValueBean();		       
		        
		      //Consulta de los campos de la base de datos - PARA FILTRAR LA BUSQUEDA		       
		     /*   InvenesProperties fields =invenesBusq.getSearchFields( accesoInvenes.getIdConexion(),new Integer(lista.get(0).getValue()));
		        List<LabelValueBean> listaFields = fields.getLabelValueBean();
		        */
		        //Consulta de los campos de la base de datos - PARA MOSTRAR RESULTADOS	       
		        InvenesProperties fields =invenesBusq.getResultFields( accesoInvenes.getIdConexion(),new Integer(lista.get(2).getValue()));
		        List<LabelValueBean> listaFields = fields.getLabelValueBean();
		    
		        //Consulta de los tipos de documentos
		    /*    InvenesProperties fields =invenesBusq.getAllTypes( accesoInvenes.getIdConexion(),new Integer(lista.get(0).getValue()));
		        List<LabelValueBean> listaFields = fields.getLabelValueBean();
		    */
		        
		        
			   this.setListaCampos(listaFields);
			   
			 return INPUT;			 
		 } else
		 {
			 return CANCELAR;
		 }
				 	
	}
	
public String busqueda() throws Exception {    	
	
	     InvenesSearch invenesBusq =	accesoInvenes.getInvenesServicio();
		  
		 if (invenesBusq!=null){
			
			// SearchResult res = invenesBusq.doSearch( accesoInvenes.getIdConexion(),0, "CASA", "TITU", null, null, 1, 25);
			// List<Reference> refes = res.getReferences();
			 
			 /*
			 String p1 (token): Token de acceso.
			 Integer p2 (base): Base a buscar (codigo numerico obtenido en getBases (Valores 0, 1 ó 2).
			 String p3 (searchString): Sentencia de búsqueda TERMINO[/CAMPO[/CAMPO…]] (Ej. CASA ) (Ej. CASA/TITU/RESU).
			 String p4 (resultFields): Campos que queremos que se nos devuelvan, separados por comas. (Ej. TITU,INVE,CPUB)
			 String p5 (fieldsOrdered): Campos por los que queremos que se ordenen los resultados. Separados por comas. Admite nulos. (Ej. TITU,INVE,CPUB)
			 String p6 (orderStream): Sentido de la ordenación. “A” ascendente, “D” descendente. Admite nulos.
			 Integer p7 (startIndex): Índice a partir del cual comienza a devolver resultados.
			 Integer p8 (docsRequested): Número máximo de documentos devueltos.
			 */
			 
			 SearchResult res =invenesBusq.doSearch( accesoInvenes.getIdConexion(),
					 new Integer("0"), "A", "TIRE","TITU", "A",1, 25);
			 
					 List<Reference> refes = res.getReferences();
					 for (int i = 0; i < refes.size(); i++)
					 {
					 Reference reference = refes.get(i);
					 System.out.println(reference.getIdReference());
					 System.out.println(reference.getPublicationNumber());
					 System.out.println(reference.getUrlReference());
					 System.out.println(reference.getUrlImage());
					 }
			 
			   
			 //return INPUT;		
			 return CANCELAR;	
		 } else
		 {
			 return CANCELAR;
		 }
				 	
	}
	/**
	 * Metodo que cancela la operacion  y retorna a la pagina inicial
	 * @return String
	 */
    public String cancelar() {
    	  	return CANCELAR;
    }
	
    

	// ------------------ GETTER & SETTER-------------------------------
    
    
	/**
	 * @return the listaCampos
	 */
	public List<LabelValueBean> getListaCampos() {
		return listaCampos;
	}
	/**
	 * @param listaCampos the listaCampos to set
	 */
	public void setListaCampos(List<LabelValueBean> listaCampos) {
		this.listaCampos = listaCampos;
	}

	/**
	 * @return the accesoInvenes
	 */
	public AccesoInvenes getAccesoInvenes() {
		return accesoInvenes;
	}

	/**
	 * @param accesoInvenes the accesoInvenes to set
	 */
	public void setAccesoInvenes(AccesoInvenes accesoInvenes) {
		this.accesoInvenes = accesoInvenes;
	}
	
	
    
}
