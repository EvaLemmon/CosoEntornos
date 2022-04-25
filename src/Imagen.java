
public class Imagen extends Mensajes{
	private String ruta;
	private int tama�o;
	
	public Imagen(Usuario duenyoMensaje, Usuario destinatarioMensaje, String ruta, int tama�o) {
		super(duenyoMensaje, destinatarioMensaje);
		this.ruta = ruta;
		this.tama�o = tama�o;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	
}
