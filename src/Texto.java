
public class Texto extends Mensajes{

	private String texto;

	public Texto(String dueñoMensaje, String destinatarioMensaje, String texto) {
		super(dueñoMensaje, destinatarioMensaje);
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
