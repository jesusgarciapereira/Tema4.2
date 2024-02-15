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

		// Frase sin espacios invertida
		String fraseInvertida = "";
		
		// Le quitamos los espacios a la frase
		frase = frase.replace(" ", "");
		

		// Bucle for que recorre cada caracter de la frase  desde el final
		for (int i = frase.length() - 1; i >= 0; i--) {
			// Asignamos y concatenamos en la frase invertida cada caracter de la frase sin
			// espacios empezando por el final
			fraseInvertida += frase.charAt(i);
		}

		// Si las dos frases son iguales
		if (fraseInvertida.equalsIgnoreCase(frase))
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
