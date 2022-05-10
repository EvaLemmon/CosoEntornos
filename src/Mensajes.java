import java.util.Objects;
//clases, atributos y metodos
/**
* Clase Mensajes
* Contiene los parametros para identificar mensajeros
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @param  duenyoMensaje Identificacion de quien manda el mensaje.
* @param  destinatarioMensaje Identificacion de quien recibe el mensaje.
* @see Usuario
*/

public class Mensajes {
	private Usuario duenyoMensaje;
	private Usuario destinatarioMensaje;
	
	public Mensajes(Usuario duenyoMensaje, Usuario destinatarioMensaje) {
		super();
		this.duenyoMensaje = duenyoMensaje;
		this.destinatarioMensaje = destinatarioMensaje;
	}
	
	public Usuario getDuenyoMensaje() {
		return duenyoMensaje;
	}

	public void setDuenyoMensaje(Usuario duenyoMensaje) {
		this.duenyoMensaje = duenyoMensaje;
	}

	public Usuario getDestinatarioMensaje() {
		return destinatarioMensaje;
	}

	public void setDestinatarioMensaje(Usuario destinatarioMensaje) {
		this.destinatarioMensaje = destinatarioMensaje;
	}
}
