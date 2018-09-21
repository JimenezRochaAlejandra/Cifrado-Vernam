package cifrado.vernam.alfabeto;

/**
 * 
 * @author Ale Rocha
 * 
 * Clase que permitirá la instancia de un objeto alfabeto.
 *
 */
public class Alfabeto {
	String alfabeto;
	
	//Construtor de la clase.
	private Alfabeto(String alfabeto) {
		this.alfabeto = new String(alfabeto);
	}
}
