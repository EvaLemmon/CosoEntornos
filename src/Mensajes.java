import java.util.Objects;

public class Mensajes {
	private Usuario dueñoMensaje;
	private Usuario destinatarioMensaje;
	
	public Mensajes(Usuario dueñoMensaje, Usuario destinatarioMensaje) {
		super();
		this.dueñoMensaje = dueñoMensaje;
		this.destinatarioMensaje = destinatarioMensaje;
	}
}
