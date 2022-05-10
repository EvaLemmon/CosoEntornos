
/**
* Clase texto
* Clase creada para almacenar el texto de los mensajes
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @param  texto Informacion del texto.
* @see Mensajes
*/

public class Texto extends Mensajes{

	private String texto;

	public Texto(Usuario duenyoMensaje, Usuario destinatarioMensaje, String texto) {
		super(duenyoMensaje, destinatarioMensaje);
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
