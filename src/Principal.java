
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
		
		user1.pszEnviarMensaje(user2);
		user2.getLoMensajesRecibidos();
	}

}
