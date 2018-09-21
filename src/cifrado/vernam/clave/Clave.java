package cifrado.vernam.clave;

/**
 * Clase que permitirá crear un objeto con la clave para cifrar.
 * @author Ale Rocha
 *
 */
public class Clave {
	String clave;
	
	/**
	 * Construtor de la clase.
	 */
	public Clave(String clave) {
		this.clave = new String(clave);
	}
}
