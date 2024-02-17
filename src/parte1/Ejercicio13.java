package parte1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 13 del apartado Tema 4.2 Parte 1: Anagramas
 */
public class Ejercicio13 {

	/**
	 * Primera frase
	 */
	public static String frase1 = "";
	/**
	 * Segunda frase
	 */
	public static String frase2 = "";

	/**
	 * Scanner activado
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que determina si las frases del parametro son anagramas
	 * 
	 * @param frase1 Primera frase
	 * @param frase2 Segunda frase
	 * @return True o false segun si ambas son anagramas
	 */
	public static boolean esAnagrama(String frase1, String frase2) {
		// Resultado que devolverá la función, inicializado en false
		boolean resultado = false;

		// Tablas de tipo char que contienen cada uno de los caracteres de su frase
		// correspondiente
		char letrasFrase1[];
		char letrasFrase2[];

		// Llamamos a la función replace() para eliminar los espacios a las frases
		frase1 = frase1.replace(" ", "");
		frase2 = frase2.replace(" ", "");

		// Transformamos las frases del parámetro a minúsculas
		frase1 = frase1.toLowerCase();
		frase2 = frase2.toLowerCase();

		// Llamamos al método toCharArray() para convertir ambas frases en tablas de
		// tipo char y las asignamos a nuestras tablas declaradas
		letrasFrase1 = frase1.toCharArray();
		letrasFrase2 = frase2.toCharArray();

//		// LAS 6 LÍNEAS ANTERIORES SE PUEDEN SUSTITUIR POR:
//		letrasFrase1 = frase1.replace(" ", "").toLowerCase().toCharArray();
//		letrasFrase2 = frase2.replace(" ", "").toLowerCase().toCharArray();

		// Llamamos al método sort() para ordenar ambas tablas
		Arrays.sort(letrasFrase1);
		Arrays.sort(letrasFrase2);

		// Si ambas tablas son iguales
		if (Arrays.equals(letrasFrase1, letrasFrase2))
			// Asignamos el resultado como true
			resultado = true;

		// Devolverá el resultado
		return resultado;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Frases que le pediremos al usuario
		String frase1 = "";
		String frase2 = "";

		// Boolean que determina si ambas frases son anagrama
		boolean anagrama;

		// Le pedimos al usuario la primera frase
		System.out.println("Escriba una palabra o frase (evite el uso de tildes)");
		// Y la asignamos
		frase1 = sc.nextLine();

		// Le pedimos al usuario la segunda frase
		System.out.println("Escriba otra palabra o frase (evite el uso de tildes)");
		// Y la asignamos
		frase2 = sc.nextLine();

		// Asignamos a nuestro booleano el valor devuelto por la función esAnagrama()
		anagrama = esAnagrama(frase1, frase2);

		// Mostramos el resultado
		System.out.println("\"" + frase2 + "\"" + (anagrama ? "" : " no") + " es un anagrama de \"" + frase1 + "\"");

		// Cerramos el Scanner
		sc.close();
	}

}
