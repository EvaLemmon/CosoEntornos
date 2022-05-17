import java.util.ArrayList;

/**
* Clase Aplicacion
* Creada para poner la lista de usuarios
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @see Usuario
*/

public class Aplicacion {

	/**
	 * loUsuarios Array List de usuarios
	 */
	ArrayList<Usuario> loUsuarios;
	


/** 
*
* Constructor de la aplicacion. 
*
* @param loUsuarios La lista de los usuarios
*/
	public Aplicacion(ArrayList<Usuario> loUsuarios) 
	{

		this.loUsuarios = loUsuarios;
	}


/** 
*
* Obtiene los usuarios
*
* @return los usuarios
*/
	public ArrayList<Usuario> getLoUsuarios() { 

		return loUsuarios;
	}


/** 
*
* Pone los usuarios
*
* @param loUsuarios los usuarios
*/
	public void setLoUsuarios(ArrayList<Usuario> loUsuarios) { 

		this.loUsuarios = loUsuarios;
	}
}

