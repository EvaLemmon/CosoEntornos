import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
* Clase Usuario
* Clase con todos los datos de un usuario.
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @param  szNumTelefono
* @see Mensajes
*/

public class Usuario {

	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();

	//Atributos
	String szNumTelefono;

	ArrayList<Mensajes> loMensajesRecibidos;
	ArrayList<Usuario> loRemitenteMensajes;
	
	ArrayList<Mensajes> loMensajesEnviados;
	ArrayList<Usuario> loDestinatarioMensajes;
	
	ArrayList<Usuario> loContactos;
	
	//Constructor
	public Usuario(String szNumTelefono)
	{
		this.szNumTelefono = szNumTelefono;
		
		loMensajesRecibidos = new ArrayList<Mensajes>();
		loRemitenteMensajes = new ArrayList<Usuario>();
		loMensajesEnviados = new ArrayList<Mensajes>();
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

	public ArrayList<Mensajes> getLoMensajesRecibidos() {
		return loMensajesRecibidos;
	}

	public void setLoMensajesRecibidos(ArrayList<Mensajes> loMensajesRecibidos) {
		this.loMensajesRecibidos = loMensajesRecibidos;
	}

	public ArrayList<Usuario> getLoRemitenteMensajes() {
		return loRemitenteMensajes;
	}

	public void setLoRemitenteMensajes(ArrayList<Usuario> lszRemitenteMensajes) {
		this.loRemitenteMensajes = lszRemitenteMensajes;
	}

	public ArrayList<Mensajes> getLoMensajesEnviados() {
		return loMensajesEnviados;
	}

	public void setLoMensajesEnviados(ArrayList<Mensajes> loMensajesEnviados) {
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
		boolean bSalir = false;
		boolean bCoincide = false;
	
		Usuario oDestinatario = null;
		String szTelefono;
		
		while(!bSalir)
		{
			System.out.println("A quíen quiere inviar un mensaje (teléfono)");
			szTelefono = sc.nextLine();
			
			for(int iCont = 0; iCont < oAplicacion.getLoUsuarios().size(); iCont++)
			{
				if(oAplicacion.getLoUsuarios().get(iCont).getSzNumTelefono().equals(szTelefono))
				{
					oDestinatario = oAplicacion.getLoUsuarios().get(iCont);
					bCoincide = true;
				}
			}
			if(bCoincide = false)
			{
				System.out.println("Usuario no encontrado");
				bSalir = true;
			}
			else
			{
				while(iOpcion < 1 || 2 < iOpcion)
				{
					System.out.println("¿Qué tipo de mensaje quieres enviar (1: Mensaje de texto. 2: Imagen)?");
					iOpcion = sc.nextInt();
					sc.nextLine();
					
					if(iOpcion == 1)			
					{
						System.out.println("Mensaje: ");
						String szMensaje = sc.nextLine();
					
						Texto oTexto = new Texto(this, oDestinatario, szMensaje);
						
						loMensajesEnviados.add(oTexto); 
						loDestinatarioMensajes.add(oDestinatario);
						
						oDestinatario.getLoMensajesRecibidos().add(oTexto);
						oDestinatario.getLoRemitenteMensajes().add(this);
						
					} 
					if(iOpcion == 2)			
					{
						System.out.println("Ruta Imagen: ");
						String szRuta = sc.nextLine();
					
						int iTamanyo = (int) (rnd.nextDouble() * 5000);
						
						Imagen oImagen = new Imagen(this, oDestinatario, szRuta, iTamanyo);
						
						loMensajesEnviados.add(oImagen); 
						loDestinatarioMensajes.add(oDestinatario);
						
						oDestinatario.getLoMensajesRecibidos().add(oImagen);
						oDestinatario.getLoRemitenteMensajes().add(this);
					}
				}
			}
		}
	}	
}
