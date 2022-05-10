import java.util.ArrayList;

/**
* Clase Principal
* Aqui se encuentra el main y el codigo necesario para ejecutar la aplicacion
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @param  loUsuarios Array List de usuarios
* @see Usuario
*/

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario user1 = new Usuario("123456789");
		Usuario user2 = new Usuario("123456788");
		
		ArrayList<Usuario> loListaUsuarios = new ArrayList<Usuario>();
		loListaUsuarios.add(user1);
		loListaUsuarios.add(user2);
		
		Aplicacion aplicacion = new Aplicacion(loListaUsuarios);
		
		user1.pvEnviarMensaje(aplicacion);
		System.out.println(user2.getLoMensajesRecibidos().get(0));
	}

}
