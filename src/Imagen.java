
/**
* Clase Imagen
* Clase creada para poder usar imagenes
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @see Mensaje
*/

public class Imagen extends Mensaje{

	/**
	 * ruta Guarda la ruta de la imagen
	 * tamaño Guarda el tamaño de la imagen
	 */
	private String ruta;
	private int tamaño;
	

/** 
 *
 * Constructor de la Imagen
 *
 * @param duenyoMensaje el duenyo del mensaje
 * @param destinatarioMensaje el destinatario del mensaje
 * @param ruta la ruta de la imagen
 * @param tamaño el tamaño de la imagen
 */
	public Imagen(Usuario duenyoMensaje, Usuario destinatarioMensaje, String ruta, int tamaño) { 

		super(duenyoMensaje, destinatarioMensaje);
		this.ruta = ruta;
		this.tamaño = tamaño;
	}


/** 
 *
 * Obtiene la ruta de la imagen
 *
 * @return la ruta de la imagen
 */
	public String getRuta() { 

		return ruta;
	}


/** 
 *
 * Pone la ruta de la imagen
 *
 * @param ruta la ruta de la imagen
 */
	public void setRuta(String ruta) { 

		this.ruta = ruta;
	}


/** 
 *
 * Obtiene el tamaño de la imagen
 *
 * @return el tamaño de la imagen
 */
	public int getTamaño() { 

		return tamaño;
	}


/** 
 *
 * Pone tamaño de la imagen
 *
 * @param tamaño  el tamaño de la imagen
 */
	public void setTamaño(int tamaño) { 

		this.tamaño = tamaño;
	}
	
}
