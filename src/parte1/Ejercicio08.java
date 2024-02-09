package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 8 del apartado Tema 4.2 Parte 1: Idioma de
 * Javalandia
 */
public class Ejercicio08 {

	/**
	 * String que indicaremos si es de Javalandia
	 */
	public static String frase;

	/**
	 * Muletilla inicial del idioma de Javalandia
	 */
	public static String muletillaInicial = "Javalín, javalón\t";

	/**
	 * Muletilla final del idioma de Javalandia
	 */
	public static String muletillaFinal = "\tjavalén, len, len";

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

		// Si alguna de las dos muletillas está presente en la frase
		if (frase.indexOf(muletillaInicial) != -1 || frase.indexOf(muletillaFinal) != -1)
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
		// Traduccion que mostrará
		String traduccion = "";

		// Si en la frase existen ambas muletillas
		if (frase.indexOf(muletillaInicial) != -1 && frase.indexOf(muletillaFinal) != -1)
			// Mostraremos este mensaje
			System.out.println("No existe dialecto que utilice ambas muletillas en la misma frase");
		// En caso contrario
		else {
			// Si en la frase está presente sólo la muletilla inicial
			if (frase.indexOf(muletillaInicial) != -1)
				// Asignamos a la traducción la frase sin la muletilla inicial
				traduccion = frase.substring(muletillaInicial.length());
			// Si en la frase está presente sólo la muletilla final
			else if (frase.indexOf(muletillaFinal) != -1)
				// Asignamos a la traducción la frase sin la muletilla final
				traduccion = frase.substring(0, frase.indexOf(muletillaFinal));

			// Y mostramos la traducción
			System.out.println(traduccion);
		}

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
		else
			// Llamamos a la función traduceJavalandia() para que muestre la traducción
			// correspondiente
			traduceJavalandia(frase);

		// Cerramos el Scanner
		sc.close();
	}

}
