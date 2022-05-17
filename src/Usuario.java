import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;



/**
* Clase Usuario
* Clase con todos los datos de un usuario.
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @see Mensaje
**/ 

public abstract class Usuario {

	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	/**
	 * szNombre Nombre del usuario
	 * szNumTelefono Numero del usuario
	 * loMensajesRecibidos Array para guardar los mensajes recibidos
	 * loRemitenteMensajes Array para guardar el remitente de esos mensajes
	 * loContactos Array para guardar mas usuarios
	 * loMensajesEnviados Array para guardar los mensajes enviados
	 * loDestinatarioMensajes Array para guardar el destinatario de esos mensajes
	 * 
	 * 
	 */
	//Atributos
	String szNombre;
	String szNumTelefono;

	ArrayList<Mensaje> loMensajesRecibidos;
	ArrayList<Usuario> loRemitenteMensajes;
	
	ArrayList<Mensaje> loMensajesEnviados;
	ArrayList<Usuario> loDestinatarioMensajes;
	
	ArrayList<Usuario> loContactos;
	
	//Constructor


/** 
 *
 * Constructor de Usuario con el telefono
 *
 * @param szNumTelefono  String del numero de telefono
 */
	
	public Usuario(String szNumTelefono) 
	{

		this.szNombre = "";
		this.szNumTelefono = szNumTelefono;
		
		loMensajesRecibidos = new ArrayList<Mensaje>();
		loRemitenteMensajes = new ArrayList<Usuario>();
		loMensajesEnviados = new ArrayList<Mensaje>();
		loDestinatarioMensajes = new ArrayList<Usuario>();
		loContactos = new ArrayList<Usuario>();
	}
	
	//Getters y Setters

/** 
 *
 * Obtiene el nombre
 *
 * @return el nombre
 */
	public String getSzNombre() { 

		return szNombre;
	}
	

/** 
 *
 * Pone el nombre
 *
 * @param szNombre  el nombre
 */
	public void setSzNombre(String szNombre) { 

		this.szNombre = szNombre;
	}
	

/** 
 *
 * Obtiene el numero de telefono
 *
 * @return el telefono
 */
	public String getSzNumTelefono() { 

		return szNumTelefono;
	}


/** 
 *
 * pone el num telefono
 *
 * @param szNumTelefono el telefono
 */
	public void setSzNumTelefono(String szNumTelefono) { 

		this.szNumTelefono = szNumTelefono;
	}


/** 
 *
 * obtiene los mensajes recibidos
 *
 * @return mensajes recibidos
 */
	public ArrayList<Mensaje> getLoMensajesRecibidos() { 

		return loMensajesRecibidos;
	}


/** 
 *
 * Pone mensajes recibidos
 *
 * @param loMensajesRecibidos mensajes recibidos
 */
	public void setLoMensajesRecibidos(ArrayList<Mensaje> loMensajesRecibidos) { 

		this.loMensajesRecibidos = loMensajesRecibidos;
	}


/** 
 *
 * Obtiene el remitente de los mensajes
 *
 * @return el remitente de los mensajes
 */
	public ArrayList<Usuario> getLoRemitenteMensajes() { 

		return loRemitenteMensajes;
	}


/** 
 *
 * Pone el remitente de los mensajes
 *
 * @param lszRemitenteMensajes  el remitente de los mensajes
 */
	public void setLoRemitenteMensajes(ArrayList<Usuario> lszRemitenteMensajes) { 

		this.loRemitenteMensajes = lszRemitenteMensajes;
	}


/** 
 *
 * Obtiene los mensajes enviados
 *
 * @return mensajes enviados
 */
	public ArrayList<Mensaje> getLoMensajesEnviados() { 

		return loMensajesEnviados;
	}


/** 
 *
 * Pone los mensajes enviados
 *
 * @param loMensajesEnviados mensajes enviados
 */
	public void setLoMensajesEnviados(ArrayList<Mensaje> loMensajesEnviados) { 

		this.loMensajesEnviados = loMensajesEnviados;
	}


/** 
 *
 * obtiene el destinatario de los mensajes
 *
 * @return el destinatario de los mensajes
 */
	public ArrayList<Usuario> getLoDestinatarioMensajes() { 

		return loDestinatarioMensajes;
	}


/** 
 *
 * Pone el destinatario de los mensajes
 *
 * @param lszDestinatarioMensajes  el destinatario de los mensajes
 */
	public void setLoDestinatarioMensajes(ArrayList<Usuario> lszDestinatarioMensajes) { 

		this.loDestinatarioMensajes = lszDestinatarioMensajes;
	}


/** 
 *
 * Obtiene los contactos
 *
 * @return los contactos
 */
	public ArrayList<Usuario> getLoContactos() { 

		return loContactos;
	}


/** 
 *
 * Pone los contactos
 *
 * @param loContactos  los contactos
 */
	public void setLoContactos(ArrayList<Usuario> loContactos) { 

		this.loContactos = loContactos;
	}
	
	//Metodos


/** 
 *
 * Metodo para enviar mensajes
 *
 * @param oAplicacion  la aplicacion
 * Pide un numero de telefono para guardar como destinatario, luego pregunta si es un numero de telefono o una imagen, y pide el texto del mensaje o la ruta de la imagen.
 */
	public void pvEnviarMensaje(Aplicacion oAplicacion) 
	{

		int iOpcion = 0;
		boolean bSalir;
		boolean bCoincide;
	
		Usuario oDestinatario = null;
		String szTelefono;
		
		bSalir = false;
		while(!bSalir)
		{
			System.out.print("A quíen quiere enviar un mensaje (teléfono): ");
			szTelefono = sc.nextLine();
			System.out.println();
				
			if(szTelefono.equals(szNumTelefono))
			{
				System.out.println("No puedes enviarte un mensaje a ti mismo");
				System.out.println();
				bSalir = true;
			}
			else
			{
				
				bCoincide = false;
				for(int iCont = 0; iCont < oAplicacion.getLoUsuarios().size(); iCont++)
				{
					if(oAplicacion.getLoUsuarios().get(iCont).getSzNumTelefono().equals(szTelefono))
					{
						oDestinatario = oAplicacion.getLoUsuarios().get(iCont);
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
	
						System.out.print("¿Qué tipo de mensaje quieres enviar (1: Mensaje de texto. 2: Imagen)?: ");
						iOpcion = sc.nextInt();
						sc.nextLine();
						System.out.println();
						
						if(iOpcion == 1)			
						{
							System.out.print("Mensaje: ");
							String szMensaje = sc.nextLine();
							System.out.println();
						
							Texto oTexto = new Texto(this, oDestinatario, szMensaje);
							
							loMensajesEnviados.add(oTexto); 
							loDestinatarioMensajes.add(oDestinatario);
							
							oDestinatario.getLoMensajesRecibidos().add(oTexto);
							oDestinatario.getLoRemitenteMensajes().add(this);
							
							System.out.println("Mensaje Enviado");
							System.out.println();
							bSalir = true;			
						} 
						else if(iOpcion == 2)			
						{
							System.out.print("Ruta Imagen: ");
							String szRuta = sc.nextLine();
							System.out.println();
						
							int iTamanyo = (int) (rnd.nextDouble() * 5000);
							
							Imagen oImagen = new Imagen(this, oDestinatario, szRuta, iTamanyo);
							
							loMensajesEnviados.add(oImagen); 
							loDestinatarioMensajes.add(oDestinatario);
							
							oDestinatario.getLoMensajesRecibidos().add(oImagen);
							oDestinatario.getLoRemitenteMensajes().add(this);
							
							System.out.println("Mensaje Enviado");
							System.out.println();
							bSalir = true;
						}
						else
						{
							System.out.println("Elige una opción válida");
							System.out.println();
						}
					}
				}
			}
		}
	}	
	


/** 
 *
 * Metodo para ver los mensajes recibidos
 * Obtiene los mensajes desde un array y los muestra, si hay alguno.
 *
 */
	public void pvVerMensajesRecibidos() 
	{

		if(loMensajesRecibidos.size() == 0)
		{
			System.out.println("No has recibido ningún mensaje");
			System.out.println();
		}
		else
		{
			for(int iCont = 0; iCont < loMensajesRecibidos.size(); iCont++)
			{
				if(loMensajesRecibidos.get(iCont) instanceof Texto)
				{
					Mensaje Aux = loMensajesRecibidos.get(iCont);
					Texto Aux2  = (Texto)Aux;
					
					System.out.println("Mensaje " + (iCont+1) + ", De " + Aux2.getDuenyoMensaje().getSzNombre() + "(" + Aux2.getDuenyoMensaje().getSzNumTelefono() + "):");
					System.out.println(Aux2.getTexto());
					System.out.println();;
				}
				else
				{
					Mensaje Aux = loMensajesRecibidos.get(iCont);
					Imagen Aux2  = (Imagen)Aux;
					
					System.out.println("Mensaje " + (iCont+1) + ", De " + Aux2.getDuenyoMensaje().getSzNombre() + "(" + Aux2.getDuenyoMensaje().getSzNumTelefono() + "):");
					System.out.println("Imagen: " + Aux2.getRuta());
					System.out.println();
				}
			}
		}
	}
	


/** 
 *
 * Metodo para ver los mensajes recibidos de usuario especifico
 * Pide un numero de telefono y muestra los mensajes recibidos solo de ese remitente
 * 
 */
	public void pvVerMensajesRecibidosDeUsuarioEspecifico() 
	{

		String szTelefonoBuscado;
		
		if(loMensajesRecibidos.size() == 0)
		{
			System.out.println("No has recibido ningún mensaje");
			System.out.println();
		}
		else
		{
			System.out.print("¿De que usuario quieres ver los mensajes recibidos (teléfono)?: ");
			szTelefonoBuscado = sc.nextLine();
			System.out.println();
			
			int iContadorMensajes = 0; 
			for(int iCont = 0; iCont < loMensajesRecibidos.size(); iCont++)
			{
				if(loMensajesRecibidos.get(iCont).getDuenyoMensaje().getSzNumTelefono().equals(szTelefonoBuscado))
				{
					if(loMensajesRecibidos.get(iCont) instanceof Texto)
					{
				
						Mensaje Aux = loMensajesRecibidos.get(iCont);
						Texto Aux2  = (Texto)Aux;
							
						System.out.println("Mensaje " + (iContadorMensajes+1) + ", De " + Aux2.getDuenyoMensaje().getSzNombre() + "(" + Aux2.getDuenyoMensaje().getSzNumTelefono() + "):");
						System.out.println(Aux2.getTexto());
						System.out.println();
						iContadorMensajes++;
					}
					else
					{
		
						Mensaje Aux = loMensajesRecibidos.get(iCont);
						Imagen Aux2  = (Imagen)Aux;
							
						System.out.println("Mensaje " + (iContadorMensajes+1) + ", De " + Aux2.getDuenyoMensaje().getSzNombre() + "(" + Aux2.getDuenyoMensaje().getSzNumTelefono() + "):");
						System.out.println("Imagen: " + Aux2.getRuta());
						System.out.println();
						iContadorMensajes++;
					}
				}
			}
			
			if(iContadorMensajes == 0)
			{
				System.out.println("No tienes mensajes del usuario " + szTelefonoBuscado);
				System.out.println();
			}
		}
	}
	


/** 
 *
 * Metodo para losver mensajes enviados
 * Llama al array que guarda los mensajes enviados y los muestra
 *
 */
	public void pvVerMensajesEnviados() 
	{

		if(loMensajesEnviados.size() == 0)
		{
			System.out.println("No has enviado ningún mensaje");
			System.out.println();
		}
		else
		{		
			for(int iCont = 0; iCont < loMensajesEnviados.size(); iCont++)
			{
				if(loMensajesEnviados.get(iCont) instanceof Texto)
				{
					Mensaje Aux = loMensajesEnviados.get(iCont);
					Texto Aux2  = (Texto)Aux;
					
					System.out.println("Mensaje " + (iCont+1) + ", Enviado a " + Aux.getDestinatarioMensaje().getSzNombre() + "(" + Aux2.getDestinatarioMensaje().getSzNumTelefono() + "):");
					System.out.println(Aux2.getTexto());
					System.out.println();
				}
				else
				{
					Mensaje Aux = loMensajesEnviados.get(iCont);
					Imagen Aux2  = (Imagen)Aux;
					
					System.out.println("Mensaje " + (iCont+1) + ", Enviado a " + Aux2.getDestinatarioMensaje().getSzNombre() + "(" + Aux2.getDestinatarioMensaje().getSzNumTelefono() + "):");
					System.out.println("Imagen: " + Aux2.getRuta());
					System.out.println();
				}
			}
		}
	}
}
