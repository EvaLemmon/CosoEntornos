
/**
* Clase Imagen
* Clase creada para poder usar imagenes
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @param  ruta Guarda la ruta en disco de la imagen.
* @param  tamaño Tamaño de la imagen.
* @see Mensaje
*/

public class Imagen extends Mensaje{
	private String ruta;
	private int tamaño;
	
	public Imagen(Usuario duenyoMensaje, Usuario destinatarioMensaje, String ruta, int tamaño) {
		super(duenyoMensaje, destinatarioMensaje);
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
