import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
* Clase Usuario
* Clase con todos los datos de un usuario.
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @param  szNumTelefono
* @see Mensaje
*/

public abstract class Usuario {

	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();

	//Atributos
	String szNumTelefono;

	ArrayList<Mensaje> loMensajesRecibidos;
	ArrayList<Usuario> loRemitenteMensajes;
	
	ArrayList<Mensaje> loMensajesEnviados;
	ArrayList<Usuario> loDestinatarioMensajes;
	
	ArrayList<Usuario> loContactos;
	
	//Constructor
	public Usuario(String szNumTelefono)
	{
		this.szNumTelefono = szNumTelefono;
		
		loMensajesRecibidos = new ArrayList<Mensaje>();
		loRemitenteMensajes = new ArrayList<Usuario>();
		loMensajesEnviados = new ArrayList<Mensaje>();
		loDestinatarioMensajes = new ArrayList<Usuario>();
		loContactos = new ArrayList<Usuario>();
	}
	
	//Getters y Setters
	public String getSzNumTelefono() {
		return szNumTelefono;
	}

	public void setSzNumTelefono(String szNumTelefono) {
		this.szNumTelefono = szNumTelefono;
	}

	public ArrayList<Mensaje> getLoMensajesRecibidos() {
		return loMensajesRecibidos;
	}

	public void setLoMensajesRecibidos(ArrayList<Mensaje> loMensajesRecibidos) {
		this.loMensajesRecibidos = loMensajesRecibidos;
	}

	public ArrayList<Usuario> getLoRemitenteMensajes() {
		return loRemitenteMensajes;
	}

	public void setLoRemitenteMensajes(ArrayList<Usuario> lszRemitenteMensajes) {
		this.loRemitenteMensajes = lszRemitenteMensajes;
	}

	public ArrayList<Mensaje> getLoMensajesEnviados() {
		return loMensajesEnviados;
	}

	public void setLoMensajesEnviados(ArrayList<Mensaje> loMensajesEnviados) {
		this.loMensajesEnviados = loMensajesEnviados;
	}

	public ArrayList<Usuario> getLoDestinatarioMensajes() {
		return loDestinatarioMensajes;
	}

	public void setLoDestinatarioMensajes(ArrayList<Usuario> lszDestinatarioMensajes) {
		this.loDestinatarioMensajes = lszDestinatarioMensajes;
	}

	public ArrayList<Usuario> getLoContactos() {
		return loContactos;
	}

	public void setLoContactos(ArrayList<Usuario> loContactos) {
		this.loContactos = loContactos;
	}
	
	//Metodos
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
				
				bCoincide = false;;
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
						}
					}
				}
			}
		}
	}	
	
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
					
					System.out.println("Mensaje " + (iCont+1) + ", De " + Aux2.getDuenyoMensaje().getSzNumTelefono() + ":");
					System.out.println(Aux2.getTexto());
					System.out.println();;
				}
				else
				{
					Mensaje Aux = loMensajesRecibidos.get(iCont);
					Imagen Aux2  = (Imagen)Aux;
					
					System.out.println("Mensaje " + (iCont+1) + ", De " + Aux2.getDuenyoMensaje().getSzNumTelefono() + ":");
					System.out.println("Imagen: " + Aux2.getRuta());
					System.out.println();
				}
			}
		}
	}
	
	public void pvVerMensajesRecibidosDeUsusarioEspecifico()
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
			
			for(int iCont = 0; iCont < loMensajesRecibidos.size(); iCont++)
			{
				if(loMensajesRecibidos.get(iCont) instanceof Texto)
				{
					if(loMensajesRecibidos.get(iCont).getDuenyoMensaje().getSzNumTelefono().equals(szTelefonoBuscado))
					{				
						Mensaje Aux = loMensajesRecibidos.get(iCont);
						Texto Aux2  = (Texto)Aux;
						
						System.out.println("Mensaje " + (iCont+1) + ", De " + Aux2.getDuenyoMensaje().getSzNumTelefono() + ":");
						System.out.println(Aux2.getTexto());
						System.out.println();
					}
				}
				else         //HACER QUE DIGA ALGO SI NO HAY NINGUNO
				{
					if(loMensajesRecibidos.get(iCont).getDuenyoMensaje().getSzNumTelefono().equals(szTelefonoBuscado))
					{	
						Mensaje Aux = loMensajesRecibidos.get(iCont);
						Imagen Aux2  = (Imagen)Aux;
						
						System.out.println("Mensaje " + (iCont+1) + ", De " + Aux2.getDuenyoMensaje().getSzNumTelefono() + ":");
						System.out.println("Imagen: " + Aux2.getRuta());
						System.out.println();
					}
				}
			}
		}
	}
	
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
					
					System.out.println("Mensaje " + (iCont+1) + ", Enviado a " + Aux2.getDestinatarioMensaje().getSzNumTelefono() + ":");
					System.out.println(Aux2.getTexto());
					System.out.println();
				}
				else
				{
					Mensaje Aux = loMensajesEnviados.get(iCont);
					Imagen Aux2  = (Imagen)Aux;
					
					System.out.println("Mensaje " + (iCont+1) + ", Enviado a " + Aux2.getDestinatarioMensaje().getSzNumTelefono() + ":");
					System.out.println("Imagen: " + Aux2.getRuta());
					System.out.println();
				}
			}
		}
	}
}
