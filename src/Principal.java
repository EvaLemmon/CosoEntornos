import java.util.ArrayList;
import java.util.*;
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
		//enviar, ver enviados, ver recibidos, ver recibidos de un num especifico, (admin ver mensajes otro numero
		Scanner sc = new Scanner(System.in);		
		NormalUser user1 = new NormalUser("123456789");
		NormalUser user2 = new NormalUser("123456788");
		Admin admin = new Admin("000000001");
		
		
		
		
		ArrayList<Usuario> loListaUsuarios = new ArrayList<Usuario>();
		loListaUsuarios.add(user1);
		loListaUsuarios.add(user2);
		
		Aplicacion aplicacion = new Aplicacion(loListaUsuarios);
		
		//if admin
		while(input != -1) {
			System.out.println("          Menú GUAGUAGUASAP");
			System.out.println("=============================================");
			System.out.println("1. Enviar un mensaje.");
			System.out.println("2. Ver mensajes enviados");
			System.out.println("3. Ver todos los mensajes recibidos");
			System.out.println("4. Ver mensajes recibidos de un numero especifico");
			System.out.println("5. Ver mensajes recibidos de otro numero (ADMIN)");
			System.out.println("6. Salir de la aplicación");
			System.out.println();
			System.out.print("Elige la opción deseada (1-6): ");
			input = sc.nextInt();
			
			switch(input){
			case 1:
				loListaUsuarios.get(0).pvEnviarMensaje();
			case 2:
				loListaUsuarios.get(0).pvVerMensajesEnviados();
			case 3:
				loListaUsuarios.get(0).pvVerMensajesRecibidos()
			case 4:
				//mostrarActivo();
			case 5:
				
			case 6:
				input= -1;
			}
		}
		//else = user normal
		while(input != -1) {
			System.out.println("          Menú GUAGUAGUASAP");
			System.out.println("=============================================");
			System.out.println("1. Enviar un mensaje.");
			System.out.println("2. Ver mensajes enviados");
			System.out.println("3. Ver todos los mensajes recibidos");
			System.out.println("4. Ver mensajes recibidos de un numero especifico");
			System.out.println("5. Salir de la aplicación");
			System.out.println();
			System.out.print("Elige la opción deseada (1-5): ");
			input = sc.nextInt();
			
			switch(input){
			case 1:
				loListaUsuarios.get(0).pvEnviarMensaje();
			case 2:
				loListaUsuarios.get(0).pvVerMensajesEnviados();
			case 3:
				loListaUsuarios.get(0).pvVerMensajesRecibidos()
			case 4:
				//mostrarActivo();
			case 5:
				input= -1;
			}
		}
		
		admin.pvVerMensajesDeUsuario(aplicacion);
		user1.pvEnviarMensaje(aplicacion);
		user1.pvEnviarMensaje(aplicacion);
		user1.pvEnviarMensaje(aplicacion);
		
		user2.pvVerMensajesRecibidos();
		user1.pvVerMensajesEnviados();
		
		admin.pvVerMensajesDeUsuario(aplicacion);
	}

}
