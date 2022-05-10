import java.util.ArrayList;

/**
* Clase Aplicacion
* Creada para poner la lista de usuarios
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @param  loUsuarios Array List de usuarios
* @see Usuario
*/

public class Aplicacion {

	//Atributos
	ArrayList<Usuario> loUsuarios;
	
	public Aplicacion()
	{
		loUsuarios = new ArrayList<Usuario>();
	}
	
	public ArrayList<Usuario> getLoUsuarios() {
		return loUsuarios;
	}

	public void setLoUsuarios(ArrayList<Usuario> loUsuarios) {
		this.loUsuarios = loUsuarios;
	}
}
