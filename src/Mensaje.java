//clases, atributos y metodos
/**
* Clase Mensajes
* Contiene los parametros para identificar mensajeros
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @see Usuario
*/

public abstract class Mensaje 
{

	/**
	 * duenyoMensaje Identificacion de quien manda el mensaje.
	 * destinatarioMensaje Identificacion de quien recibe el mensaje.
	 */
	private Usuario duenyoMensaje;
	private Usuario destinatarioMensaje;
	


/** 
 * Constructor del Mensaje
 *
 * @param duenyoMensaje el duenyo del mensaje
 * @param destinatarioMensaje el destinatario del mensaje
 */
	public Mensaje(Usuario duenyoMensaje, Usuario destinatarioMensaje)  
	{

		this.duenyoMensaje = duenyoMensaje;
		this.destinatarioMensaje = destinatarioMensaje;
	}
	


/** 
 *
 * Obtiene el duenyo del mensaje
 *
 * @return el duenyo del mensaje
 */
	public Usuario getDuenyoMensaje() 
	{

		return duenyoMensaje;
	}



/** 
 *
 * Pone el duenyo del mensaje
 *
 * @param duenyoMensaje  el duenyo del mensaje
 */
	public void setDuenyoMensaje(Usuario duenyoMensaje) 
	{

		this.duenyoMensaje = duenyoMensaje;
	}



/** 
 *
 * Obtiene el destinatario del mensaje
 *
 * @return el destinatario del mensaje
 */
	public Usuario getDestinatarioMensaje() 
	{

		return destinatarioMensaje;
	}



/** 
 *
 * Pone el destinatario del mensaje
 *
 * @param destinatarioMensaje  el destinatario del mensaje
 */
	public void setDestinatarioMensaje(Usuario destinatarioMensaje)  
	{

		this.destinatarioMensaje = destinatarioMensaje;
	}
}

