import java.util.ArrayList;

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
