package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 9 del apartado Tema 4.2 Parte 1: Idioma de
 * Javalandia
 */
public class Ejercicio09 {

	/**
	 * String que indicaremos si es de Javalandia
	 */
	public static String frase;

	/**
	 * Muletilla inicial del idioma de Javalandia
	 */
	public static String muletillaInicial = "Javalín, javalón";

	/**
	 * Muletilla final del idioma de Javalandia
	 */
	public static String muletillaFinal = "javalén, len, len";

	/**
	 * Scanner activado
	 */
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que determina si la frase del parametro pertenece al idioma de
	 * Javalandia
	 * 
	 * @param frase Frase en la que comprobaremos si existe alguna de sus muletillas
	 * @return True o false segun si la frase es del idioma de Javalandia
	 */
	public static boolean esJavalandia(String frase) {
		// Booleano que indica si la frase es de Javalandia (inicializada como false)
		boolean esJavalandia = false;

		// Si la muletilla inicial está al principio de la frase o la muletilla final
		// está al final de la frase, pero no las dos a la vez
		if ((frase.startsWith(muletillaInicial) && !frase.endsWith(muletillaFinal))
				|| (!frase.startsWith(muletillaInicial) && frase.endsWith(muletillaFinal)))
			// Asignamos nuestro booleano como true
			esJavalandia = true;

		// Devolverá el valor del booleano
		return esJavalandia;
	}

	/**
	 * Funcion que muestra la traduccion de la frase introducida
	 * 
	 * @param frase Frase a traducir
	 */
	public static void traduceJavalandia(String frase) {

		// Si la muletilla inicial está al principio de la frase
		if (frase.startsWith(muletillaInicial))
			// Llamamos a la función replace() para eliminar la muletilla inicial
			// (sustituirla por vacío)
			frase = frase.replace(muletillaInicial, "");

		// Si la muletilla final está al final de la frase
		else if (frase.endsWith(muletillaFinal))
			// Llamamos a la función replace() para eliminar la muletilla final (sustituirla
			// por vacío)
			frase = frase.replace(muletillaFinal, "");

		// Llamamos a la función trim() para que elimine espacios y tabuladores de la
		// frase
		frase = frase.trim();

		// Y mostramos la frase
		System.out.println("Traducción: " + frase);
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Frase que le pediremos al usuario
		String frase;

		// Booleano que indica si la frase es de Javalandia (inicializada como false)
		boolean esJavalandia;

		// Le pedimos al usuario una frase
		System.out.println("Escriba la frase a traducir");
		// Y la asignamos a nuestra variable String
		frase = sc.nextLine();

		// Llamamos a la función esJavalandia() para asignar un valor a nuestro booleano
		esJavalandia = esJavalandia(frase);

		// Si la frase no es de Javalandia
		if (!esJavalandia)
			// Mostramos este mensaje
			System.out.println("La frase introducida no es de Javalandia");
		// En caso contrario
		else {
			// Mostramos este mensaje
			System.out.println("La frase es de Javalandia");		
			// Y llamamos a la función traduceJavalandia() para que muestre la traducción
			// correspondiente
			traduceJavalandia(frase);
		}
		// Cerramos el Scanner
		sc.close();
	}

}
