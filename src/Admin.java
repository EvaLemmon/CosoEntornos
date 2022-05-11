
public class Admin extends Usuario
{
	public Admin(String szNumTelefono)
	{
		super(szNumTelefono);
	}
	
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
			System.out.print("�De cu�l usuario quieres ver sus mensajes (tel�fono)?: ");
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
					System.out.print("�Ver mensajes enviados(1) o recibidos (2)?: ");
					iOpcion = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					if(iOpcion == 1)			
					{
						if(oUsuario.loMensajesEnviados.size() == 0)
						{
							System.out.println("El ususario " + oUsuario.szNumTelefono + " no ha enviado ning�n mensaje");
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
							System.out.println("El ususario " + oUsuario.szNumTelefono + " no ha recibido ning�n mensaje");
						}
						else
						{
							oUsuario.pvVerMensajesRecibidos();
						}
						bSalir = true;	
					}
					else
					{
						System.out.println("Elige una opci�n v�lida");
					}
					System.out.println();				
				}
			}
		}
	}
}
