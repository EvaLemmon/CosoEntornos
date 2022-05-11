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
		
		NormalUser user1 = new NormalUser("123456789");
		NormalUser user2 = new NormalUser("123456788");
		Admin admin = new Admin("000000001");
		
		ArrayList<Usuario> loListaUsuarios = new ArrayList<Usuario>();
		loListaUsuarios.add(user1);
		loListaUsuarios.add(user2);
		
		Aplicacion aplicacion = new Aplicacion(loListaUsuarios);
		
		admin.pvVerMensajesDeUsuario(aplicacion);
		user1.pvEnviarMensaje(aplicacion);
		user1.pvEnviarMensaje(aplicacion);
		user1.pvEnviarMensaje(aplicacion);
		
		user2.pvVerMensajesRecibidos();
		user1.pvVerMensajesEnviados();
		
		admin.pvVerMensajesDeUsuario(aplicacion);
	}

}
