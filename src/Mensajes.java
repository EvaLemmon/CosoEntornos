import java.util.Objects;

public class Mensajes {
	private Usuario due�oMensaje;
	private Usuario destinatarioMensaje;
	
	public Mensajes(Usuario due�oMensaje, Usuario destinatarioMensaje) {
		super();
		this.due�oMensaje = due�oMensaje;
		this.destinatarioMensaje = destinatarioMensaje;
	}
	
	public String getDue�oMensaje() {
		return due�oMensaje;
	}

	public void setDue�oMensaje(String due�oMensaje) {
		this.due�oMensaje = due�oMensaje;
	}

	public String getDestinatarioMensaje() {
		return destinatarioMensaje;
	}

	public void setDestinatarioMensaje(String destinatarioMensaje) {
		this.destinatarioMensaje = destinatarioMensaje;
	}

	private String due�oMensaje;
	private String destinatarioMensaje;
}
