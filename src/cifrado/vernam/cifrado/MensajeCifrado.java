package cifrado.vernam.cifrado;

/**
 * 
 * @author Ale Rocha
 *
 * Clase que permitirá tener un objeto cuando se haya cifrado el mensaje.	
 */
public class MensajeCifrado {
	public String[] mensajecifrado;
	
	public MensajeCifrado(String[] mensajeCifrado) {
		this.mensajecifrado = mensajeCifrado;
	}
	
	public String toString() {
		return mensajecifrado.toString();
	}
}
