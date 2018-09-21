package cifrado.vernam.codigo.binario;

import cifrado.vernam.alfabeto.Letra;

/**
 * 
 * @author Ale Rocha
 *
 *	Clase que permitirá convertir un objeto de tipo letra a su código binario.
 */
public class CodigoBinario {
	Letra letra;
	
	/**
	 * Constructor de la clase.
	 * @param letra
	 */
	public CodigoBinario(String letra) {
		this.letra = new Letra(letra);
	}
	
	/**
	 * Método para obtener el número binario de una letra.
	 */
	public String obtenerBinario(String letra) {
	      return Integer.toBinaryString(letra.charAt(0));
	}
	
	/**
	 *	Main de pruebas.
	 * @param args
	 */
	public static void main(String[] args) {
		Letra l = new Letra("Z");
		CodigoBinario cb = new CodigoBinario(l.letra);
		System.out.println(cb.obtenerBinario(l.letra));
	}
}
