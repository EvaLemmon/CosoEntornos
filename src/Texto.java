
/**
* Clase texto
* Clase creada para almacenar el texto de los mensajes
* @author Eva Lemmon Lopez y Adrian Cortes
* @version 0.0.1
* @see Mensaje
*/

public class Texto extends Mensaje
{
	/**
	 * texto Guarda el texto del mensaje.
	 */
	private String texto;

	/** 
	 * Constructor del texto
	 * @param duenyoMensaje La persona que envia el mensaje
	 * @param destinatarioMensaje El destinatario del mensaje
	 * @param texto El texto del mensaje
	 */
		public Texto(Usuario duenyoMensaje, Usuario destinatarioMensaje, String texto)  
		{

			super(duenyoMensaje, destinatarioMensaje);
			this.texto = texto;
		}



	/** 
	 *
	 * Obtiene el texto
	 *
	 * @return el texto
	 */
		public String getTexto() 
		{

			return texto;
		}



	/** 
	 *
	 * Pone el texto
	 *
	 * @param texto  el texto
	 */
		public void setTexto(String texto) 
		{

			this.texto = texto;
		}	
	}

