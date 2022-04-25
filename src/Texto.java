
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
