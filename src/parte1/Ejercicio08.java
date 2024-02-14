package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 8 del apartado Tema 4.2 Parte 1: Indicar si
 * es un palindromo
 */
public class Ejercicio08 {

	/**
	 * String que indicaremos si es palindromo
	 */
	public static String frase;

	/**
	 * Scanner activado
	 */
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que nos indica si el String introducido en el parametro es un
	 * palindromo
	 * 
	 * @param frase String que comprobara
	 * @return True o false segun si la frase es un palindromo
	 */
	public static boolean esPalindromo(String frase) {
		// Variable booleana inicializada como falso
		boolean esPalindromo = false;

		// Frase sin los espacios
		String fraseSinEspacios = "";
		// String anterior pero invertido
		String fraseSinEspaciosInvertida = "";

		// Bucle for que recorre cada caracter de la frase del parámetro
		for (int i = 0; i < frase.length(); i++) {
			// Si el caracter en el que estamos no es un espacio
			if (frase.charAt(i) != ' ')
				// Lo asignamos y concatenamos en la frase sin espacios
				fraseSinEspacios += frase.charAt(i);
		}

		// Bucle for que recorre cada caracter de la frase sin espacios desde el final
		for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
			// Asignamos y concatenamos en la frase invertida cada caracter de la frase sin
			// espacios empezando por el final
			fraseSinEspaciosInvertida += fraseSinEspacios.charAt(i);
		}

		// Si las dos frases son iguales
		if (fraseSinEspaciosInvertida.equalsIgnoreCase(fraseSinEspacios))
			// Asignamos esPalindromo como true
			esPalindromo = true;

		// Devolverá nuestra variable booleana
		return esPalindromo;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Frase que le pediremos al usuario
		String frase = "";

		// Booleano que determinará si la frase es un palíndromo
		boolean esPalindromo;

		// Le pedimos una frase al usuario
		System.out.println("Escriba una palabra o una frase, indicaré si es un palíndromo (evite el uso de tildes)");
		// Y lo asignamos a la frase
		frase = sc.nextLine();

		// Llamamos a la funcion esPalindromo() con la frase como parámetro y asignamos
		// el valor devuelto a nuestro booleano
		esPalindromo = esPalindromo(frase);

		// Mostramos el resultado
		System.out.println("\"" + frase + "\"" + (esPalindromo ? " es " : " no es ") + "un palíndromo");

	}

}
