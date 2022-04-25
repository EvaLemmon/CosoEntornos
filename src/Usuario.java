import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

	Scanner sc = new Scanner(System.in);

	//Atributos
	String szNumTelefono;

	ArrayList<Mensajes> loMensajesRecibidos;
	ArrayList<String> lszRemitenteMensajes;
	
	ArrayList<Mensajes> loMensajesEnviados;
	ArrayList<String> lszDestinatarioMensajes;
	ArrayList<Usuario> loContactos;
	
	//Constructor
	public Usuario(String szNumTelefono)
	{
		this.szNumTelefono = szNumTelefono;
		
		loMensajesRecibidos = new ArrayList<Mensajes>();
		lszRemitenteMensajes = new ArrayList<String>();
		loMensajesEnviados = new ArrayList<Mensajes>();
		lszDestinatarioMensajes = new ArrayList<String>();
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

	public ArrayList<String> getLszRemitenteMensajes() {
		return lszRemitenteMensajes;
	}

	public void setLszRemitenteMensajes(ArrayList<String> lszRemitenteMensajes) {
		this.lszRemitenteMensajes = lszRemitenteMensajes;
	}

	public ArrayList<Mensajes> getLoMensajesEnviados() {
		return loMensajesEnviados;
	}

	public void setLoMensajesEnviados(ArrayList<Mensajes> loMensajesEnviados) {
		this.loMensajesEnviados = loMensajesEnviados;
	}

	public ArrayList<String> getLszDestinatarioMensajes() {
		return lszDestinatarioMensajes;
	}

	public void setLszDestinatarioMensajes(ArrayList<String> lszDestinatarioMensajes) {
		this.lszDestinatarioMensajes = lszDestinatarioMensajes;
	}

	public ArrayList<Usuario> getLoContactos() {
		return loContactos;
	}

	public void setLoContactos(ArrayList<Usuario> loContactos) {
		this.loContactos = loContactos;
	}
	
	//Metodos
	public String pszEnviarMensaje(Aplicacion oAplicacion)
	{
		int iOpcion = 0;
		boolean bSalir = false;
		boolean bCoincide = false;
		
		String szDestinatario;
		
		Usuario oDestinatario;
		
		while(!bSalir)
		{
			System.out.println("A quíen quiere inviar un mensaje (teléfono)");
			szDestinatario = sc.nextLine();
			
			for(int iCont = 0; iCont < oAplicacion.getLoUsuarios().size(); iCont++)
			{
				if(oAplicacion.getLoUsuarios().get(iCont).getSzNumTelefono().equals(szDestinatario))
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
						
					} 
					if(iOpcion == 2)			
					{
						System.out.println("Mensaje: ");
					}
				}
			}
			
			/*szMensaje = sc.nextLine();
			
			loMensajeEnviados.add()
			oDestinatario.pszRecibirMensaje(szMensaje);
			return szMensaje;*/
		}
	}
	
	public String pszRecibirMensaje(String szMensaje)
	{
		//String szMensaje;
		
		System.out.println("Mensaje: ");
		szMensaje = sc.nextLine();
		
		return szMensaje;
	}
	
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

	public ArrayList<String> getLszRemitenteMensajes() {
		return lszRemitenteMensajes;
	}

	public void setLszRemitenteMensajes(ArrayList<String> lszRemitenteMensajes) {
		this.lszRemitenteMensajes = lszRemitenteMensajes;
	}

	public ArrayList<Mensajes> getLoMensajesEnviados() {
		return loMensajesEnviados;
	}

	public void setLoMensajesEnviados(ArrayList<Mensajes> loMensajesEnviados) {
		this.loMensajesEnviados = loMensajesEnviados;
	}

	public ArrayList<String> getLszDestinatarioMensajes() {
		return lszDestinatarioMensajes;
	}

	public void setLszDestinatarioMensajes(ArrayList<String> lszDestinatarioMensajes) {
		this.lszDestinatarioMensajes = lszDestinatarioMensajes;
	}

	public ArrayList<Usuario> getLoContactos() {
		return loContactos;
	}

	public void setLoContactos(ArrayList<Usuario> loContactos) {
		this.loContactos = loContactos;
	}
}
