import java.util.ArrayList;

public class Aplicacion {

	//Atributos
	ArrayList<Usuario> loUsuarios;
	
	public Aplicacion(ArrayList<Usuario> loUsuarios)
	{
		this.loUsuarios = loUsuarios;
	}

	public ArrayList<Usuario> getLoUsuarios() {
		return loUsuarios;
	}

	public void setLoUsuarios(ArrayList<Usuario> loUsuarios) {
		this.loUsuarios = loUsuarios;
	}
}
