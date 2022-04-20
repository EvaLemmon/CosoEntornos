
public class Imagen extends Mensajes{
	private String ruta;
	private int tamaño;
	
	public Imagen(String dueñoMensaje, String destinatarioMensaje, String ruta, int tamaño) {
		super(dueñoMensaje, destinatarioMensaje);
		this.ruta = ruta;
		this.tamaño = tamaño;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
}
