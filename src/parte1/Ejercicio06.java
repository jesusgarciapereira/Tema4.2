package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 6 del apartado Tema 4.2 Parte 1: Terminar
 * de leer con la palabra "fin"
 */
public class Ejercicio06 {

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Cada una de las palabras introducidas por el usuario
		String palabra = "";

		// Conjunto de palabras que mostraremos
		String conjuntoPalabras = "";

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una palabra
		System.out.println("Introduzca una palabra");
		System.out.println(
				"La leeré y mostraré todas las palabras escritas hasta que introduzcas la palabra \"fin\" (sin importar mayúsculas o minúsculas)");

		// Y la asignamos a nuestra variable palabra (next() para que no lea espacios)
		palabra = sc.next();

		// Mientras la palabra introducida no sea nuestra palabra tabú
		while (!palabra.equalsIgnoreCase("fin")) {
			// Limpiamos el buffer
			sc.nextLine();
			// Concatenamos cada palabra en nuestro conjunto
			conjuntoPalabras += palabra + " ";

			// Pedimos otra palabra al usuario
			System.out.println("Bien, introduzca otra palabra");
			// Y la asignamos a nuestra variable palabra
			palabra = sc.next();
		}

		// Mostramos el resultado
		System.out.println(conjuntoPalabras);

		// Cerramos el Scanner
		sc.close();

	}
}