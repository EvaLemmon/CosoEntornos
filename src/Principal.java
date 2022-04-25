
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user1 = new Usuario("123456789");
		Usuario user2 = new Usuario("123456788");
		
		user1.pszEnviarMensaje(user2);
		user2.getLoMensajesRecibidos();
	}

}
