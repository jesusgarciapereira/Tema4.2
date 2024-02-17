package parte1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 20 del apartado Tema 4.2 Parte 1:
 * Secuencias de n letras
 */
public class Ejercicio20 {
	/**
	 * Scanner activado
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que divide una palabra en fragmentos y las devuelve en una tabla
	 * 
	 * @param palabra    Palabra que quieres secuenciar
	 * @param cantLetras Tamannio de cada secuencia
	 * @return Tabla con la palabra dividida en secuencias
	 */
	public static String[] palabraSecuenciada(String palabra, int cantLetras) {
		// Cada una de las secuencias
		String secuencia = "";
		// Tabla con los fragmentos de la palabra que devolverá la función
		String fragmentos[];
		// Posición inicial de cada secuencia
		int posicionInicial = 0;

		// Mientras la suma de la posición inicial y la cantidad de letras sea menor que
		// la longitud de la palabra
		while (posicionInicial + cantLetras < palabra.length()) {
			// Asignamos a la secuencia una subcadena desde la posición inicial y que
			// siempre tenga el tamaño de la cantidad de letras. Además un espacio
			secuencia += palabra.substring(posicionInicial, posicionInicial + cantLetras) + " ";
			// A la posición inicial le incrementamos la cantidad de letras
			posicionInicial += cantLetras;
		}

		// Asignamos a la secuencia el último fragmento que nos queda de la palabra
		secuencia += palabra.substring(posicionInicial);

		// Asignamos a la tabla de fragmentos toda la secuencia dividida por los
		// espacios
		fragmentos = secuencia.split(" ");

		// La función devolverá la tabla con los fragmentos de la palabra
		return fragmentos;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Palabra que le pediremos al usuario
		String palabra = "";
		// Número del tamaño de los fragmentos que le pediremos al usuario
		int tamannio = 0;
		// Tabla que mostraremos
		String secuencias[];

		// Le pedimos al usuario una palabra
		System.out.println("Introduzca una palabra");
		// Y la asignamos a la palabra
		palabra = sc.next();

		// Limpiamos el buffer (para que sólo lea la primera palabra)
		sc.nextLine();

		// Mientras el tamaño sea menor o igual que 0
		while (tamannio <= 0) {
			// Le pedimos el tamaño de cada fragmento
			System.out.println("¿Qué tamaño tendrán los fragmentos?");
			// Y lo asignamos al tamaño
			tamannio = sc.nextInt();
		}

		// Asignamos a la tabla el valor devuelto por la función palabraSecuenciada()
		secuencias = palabraSecuenciada(palabra, tamannio);

		// Mostramos el resultado
		System.out.println(Arrays.toString(secuencias));

		// Cerramos el Scanner
		sc.close();

	}

}
