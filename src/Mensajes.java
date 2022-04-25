import java.util.Objects;

public class Mensajes {
	
	public Mensajes(String dueñoMensaje, String destinatarioMensaje) {
		super();
		this.dueñoMensaje = dueñoMensaje;
		this.destinatarioMensaje = destinatarioMensaje;
	}
	
	public String getDueñoMensaje() {
		return dueñoMensaje;
	}

	public void setDueñoMensaje(String dueñoMensaje) {
		this.dueñoMensaje = dueñoMensaje;
	}

	public String getDestinatarioMensaje() {
		return destinatarioMensaje;
	}

	public void setDestinatarioMensaje(String destinatarioMensaje) {
		this.destinatarioMensaje = destinatarioMensaje;
	}

	private String dueñoMensaje;
	private String destinatarioMensaje;
}
