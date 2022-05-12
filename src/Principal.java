import java.util.ArrayList;
import java.util.Scanner;
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
		loListaUsuarios.add(admin);
		
		Aplicacion oAplicacion = new Aplicacion(loListaUsuarios);
		
		boolean bSalir;
		boolean bCoincide;
		int iInput;
		String szTelefonoUsuario;
		Usuario oUsuarioActual = null;
		
		user1.setSzNombre("Pedro");;
		
		bSalir = false;
		while(!bSalir)
		{
			System.out.print("Escribe tu tel�fono: ");
			szTelefonoUsuario = sc.nextLine();
			System.out.println();	

			bCoincide = false;;
			for(int iCont = 0; iCont < oAplicacion.getLoUsuarios().size(); iCont++)
			{
				if(oAplicacion.getLoUsuarios().get(iCont).getSzNumTelefono().equals(szTelefonoUsuario))
				{
					oUsuarioActual = oAplicacion.getLoUsuarios().get(iCont);
					bCoincide = true;
					bSalir = true;
				}
			}
			
			if(bCoincide == false)
			{
				System.out.println("Usuario no encontrado");
				System.out.println();
			}
		}
		
		bSalir = false;
		if (oUsuarioActual instanceof Admin)
		{
			while(!bSalir) {
				System.out.println("                Men� GUAGUAGUASAP");
				System.out.println("=============================================");
				System.out.println("1. Enviar un mensaje.");
				System.out.println("2. Ver mensajes enviados");
				System.out.println("3. Ver todos los mensajes recibidos");
				System.out.println("4. Ver mensajes recibidos de un n�mero especifico");
				System.out.println("5. Ver mensajes enviados/recibidos de otro n�mero (ADMIN)");
				System.out.println("6. Cambiar nombre de usuario");
				System.out.println("7. Salir de la aplicaci�n");
				System.out.println();
				System.out.print("Elige la opci�n deseada (1-7): ");
				iInput = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				switch(iInput)
				{
					case 1:					
						oUsuarioActual.pvEnviarMensaje(oAplicacion);
						break;
						
					case 2:
						oUsuarioActual.pvVerMensajesEnviados();
						break;
						
					case 3:
						oUsuarioActual.pvVerMensajesRecibidos();
						break;
						
					case 4:
						oUsuarioActual.pvVerMensajesRecibidosDeUsuarioEspecifico();
						break;
						
					case 5:
						Admin Aux = (Admin) oUsuarioActual;		
						Aux.pvVerMensajesDeUsuario(oAplicacion);
						break;
						
					case 6:
						System.out.print("Nuevo nombre de usuario: ");						
						oUsuarioActual.setSzNombre(sc.nextLine());
						System.out.println();
						break;
						
					case 7:
						bSalir = true;
						break;
						
					default:
						System.out.println("Elige una opci�n v�lida");
						System.out.println();
						break;
				}
			}
		}
		else
		{
			while(!bSalir)
			{
				System.out.println("          Men� GUAGUAGUASAP");
				System.out.println("=============================================");
				System.out.println("1. Enviar un mensaje.");
				System.out.println("2. Ver mensajes enviados");
				System.out.println("3. Ver todos los mensajes recibidos");
				System.out.println("4. Ver mensajes recibidos de un n�mero especifico");
				System.out.println("5. Cambiar nombre de usuario");
				System.out.println("6. Salir de la aplicaci�n");
				System.out.println();
				System.out.print("Elige la opci�n deseada (1-6): ");
				iInput = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				switch(iInput)
				{
					case 1:					
						oUsuarioActual.pvEnviarMensaje(oAplicacion);
						break;
						
					case 2:
						oUsuarioActual.pvVerMensajesEnviados();
						break;
						
					case 3:
						oUsuarioActual.pvVerMensajesRecibidos();
						break;
						
					case 4:
						oUsuarioActual.pvVerMensajesRecibidosDeUsuarioEspecifico();
						break;
						
					case 5:
						System.out.print("Nuevo nombre de usuario: ");						
						oUsuarioActual.setSzNombre(sc.nextLine());
						System.out.println();
						break;
						
					case 6:
						bSalir = true;
						break;
						
					default:
						System.out.println("Elige una opci�n v�lida");
						System.out.println();
						break;
				}
			}
		}		
		sc.close();
	}
}
