package cifrado.vernam.clave;

import cifrado.vernam.alfabeto.Letra;

/**
 * Clase que permitirá crear un objeto con la clave para cifrar.
 * @author Ale Rocha
 *
 */
public class Clave {
	public String clave;
	Letra[] letra;
	
	/**
	 * Construtor de la clase.
	 */
	public Clave(String clave) {
		this.clave = new String(clave);
	}
	
	public Letra[] obtenerLetras() {
		for (int i = 0; i < clave.length(); i++)
			letra[i] = new Letra(clave.charAt(i)+"");
		return letra;
	}
}
