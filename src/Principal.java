
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Usuario user1 = new Usuario("123456789");
		Usuario user2 = new Usuario("123456788");
		
		ArrayList<Usuario> loListaUsuarios = new ArrayList<Usuario>();
		
		Aplicacion aplicacion = new Aplicacion(loListaUsuarios);
		
		user1.pvEnviarMensaje(aplicacion);
		System.out.println(user2.getLoMensajesRecibidos().get(0));
	}

}
