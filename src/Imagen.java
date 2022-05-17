
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
	 * tama�o Guarda el tama�o de la imagen
	 */
	private String ruta;
	private int tama�o;
	

/** 
 *
 * Constructor de la Imagen
 *
 * @param duenyoMensaje el duenyo del mensaje
 * @param destinatarioMensaje el destinatario del mensaje
 * @param ruta la ruta de la imagen
 * @param tama�o el tama�o de la imagen
 */
	public Imagen(Usuario duenyoMensaje, Usuario destinatarioMensaje, String ruta, int tama�o) { 

		super(duenyoMensaje, destinatarioMensaje);
		this.ruta = ruta;
		this.tama�o = tama�o;
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
 * Obtiene el tama�o de la imagen
 *
 * @return el tama�o de la imagen
 */
	public int getTama�o() { 

		return tama�o;
	}


/** 
 *
 * Pone tama�o de la imagen
 *
 * @param tama�o  el tama�o de la imagen
 */
	public void setTama�o(int tama�o) { 

		this.tama�o = tama�o;
	}
	
}
