
public class Texto extends Mensajes{

	private String texto;

	public Texto(Usuario due�oMensaje, Usuario destinatarioMensaje, String texto) {
		super(due�oMensaje, destinatarioMensaje);
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
