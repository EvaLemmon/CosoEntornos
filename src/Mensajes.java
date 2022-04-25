import java.util.Objects;

public class Mensajes {
	private Usuario duenyoMensaje;
	private Usuario destinatarioMensaje;
	
	public Mensajes(Usuario duenyoMensaje, Usuario destinatarioMensaje) {
		super();
		this.duenyoMensaje = duenyoMensaje;
		this.destinatarioMensaje = destinatarioMensaje;
	}
	
	public Usuario getDuenoMensaje() {
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
