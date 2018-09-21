package cifrado.vernam.principal;

import cifrado.vernam.alfabeto.Alfabeto;
import cifrado.vernam.clave.Clave;
//import cifrado.vernam.codigo.binario.CodigoBinario;

/**
 * Método principal de la clase.
 * @author Ale Rocha
 *
 */
public class CifradoVernam {
	Alfabeto alfabeto;
//	CodigoBinario codigoBinario;
	Clave clave;
	
//	public CifradoVernam(Alfabeto alfabeto, CodigoBinario codigoBinario, Clave clave) {
	public CifradoVernam(Alfabeto alfabeto, Clave clave) {
		this.alfabeto = new Alfabeto("");
//		this.codigoBinario = new CodigoBinario();
	}
}
