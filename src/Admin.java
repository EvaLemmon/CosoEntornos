/**
* Clase Admin
* Clase para identificar usuarios administradores y su metodo especial
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @see Usuario
*/
public class Admin extends Usuario
{
/** 
 *
 * Constructor de Admin
 *
 * @param szNumTelefono el numero de telefono
 */
	public Admin(String szNumTelefono) 
	{

		super(szNumTelefono);
	}
	


/** 
 *
 * Metodo para ver mensajes de cualquier usuario
 * Pide el telefono del usuario del que ver los mensajes y muestra todos los mensajes de ese usuario.
 * @param oAplicacion  la aplicacion
 */
	public void pvVerMensajesDeUsuario(Aplicacion oAplicacion) 
	{

		int iOpcion = 0;
		boolean bSalir;
		boolean bCoincide;
	
		Usuario oUsuario = null;
		String szTelefono;

		bSalir = false;
		while(!bSalir)
		{
			System.out.print("¿De cuál usuario quieres ver sus mensajes (teléfono)?: ");
			szTelefono = sc.nextLine();
			System.out.println();
				
			bCoincide = false;
			for(int iCont = 0; iCont < oAplicacion.getLoUsuarios().size(); iCont++)
			{
				if(oAplicacion.getLoUsuarios().get(iCont).getSzNumTelefono().equals(szTelefono))
				{
					oUsuario = oAplicacion.getLoUsuarios().get(iCont);
					bCoincide = true;
				}
			}
			
			if(bCoincide == false)
			{
				System.out.println("Usuario no encontrado");
				System.out.println();
				bSalir = true;
			}
			else
			{
				while(iOpcion < 1 || 2 < iOpcion)
				{
					System.out.print("¿Ver mensajes enviados(1) o recibidos (2)?: ");
					iOpcion = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					if(iOpcion == 1)			
					{
						if(oUsuario.loMensajesEnviados.size() == 0)
						{
							System.out.println("El usuario " + oUsuario.szNombre + "(" + oUsuario.szNumTelefono + ") no ha enviado ningún mensaje");
						}
						else
						{
							oUsuario.pvVerMensajesEnviados();
						}
						bSalir = true;			
					} 
					else if(iOpcion == 2)			
					{
						if(oUsuario.loMensajesRecibidos.size() == 0)
						{
							System.out.println("El usuario " + oUsuario.szNombre + "(" + oUsuario.szNumTelefono + ") no ha recibido ningún mensaje");
						}
						else
						{
							oUsuario.pvVerMensajesRecibidos();
						}
						bSalir = true;	
					}
					else
					{
						System.out.println("Elige una opción válida");
					}
					System.out.println();				
				}
			}
		}
	}
}
