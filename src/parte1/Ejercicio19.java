package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 19 del apartado Tema 4.2 Parte 1: camelCase
 */
public class Ejercicio19 {
	/**
	 * Scanner activado
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que transforma la frase del parametro a nomenclatura Camel
	 * 
	 * @param frase Frase que introducira el usuario
	 * @return String equivalente a la frase del parametro pero en nomenclatura
	 *         Camel
	 */
	public static String toCamelCase(String frase) {
		// Copia de la frase del parámetro
		String fraseAux = "";
		// Tabla con el conjunto de palabras que contiene la frase
		String[] palabras;
		// Primer caracter de cada palabra (inicializado a vacío)
		char charPosicion0 = ' ';
		// Frase en nomenclatura Camel
		String camel = "";

		// Asignamos a la frase auxiliar la concatenación de la frase del parámetro
		fraseAux += frase;
		// La ponemos en minúsculas
		fraseAux = fraseAux.toLowerCase();
		// Llamamos a la funcion split() para asignar cada palabra de la frase auxiliar
		// a nuestra tabla
		palabras = fraseAux.split(" ");

		// Bucle for que recorre cada palabra de la tabla
		for (int i = 0; i < palabras.length; i++) {
			// Si el contador es distinto de 0
			if (i != 0) {
				// Llamamos a la función charAt() para asignar el primer caracter de cada
				// palabra
				charPosicion0 = palabras[i].charAt(0);
				// Asignamos a cada la palabra la concatenación de su primer caracter en
				// mayúscula con el resto de la palabra
				palabras[i] = Character.toUpperCase(charPosicion0) + palabras[i].substring(1);
			}
			// Asignamos a la frase auxiliar la concatenación de todas las palabras de la
			// tabla
			camel += palabras[i];
		}

		// La función devolverá la frase del parámetro en nomenclatura Camel
		return camel;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Frase que le devolveremos al usuario
		String frase = "";
		// Frase en nomenclatura Camel que mostraremos
		String camel = "";

		// Le pedimos al usuario una frase
		System.out.println("Escriba una frase");
		// Y la asignamos a la frase
		frase = sc.nextLine();

		// Llamamos a la función toCamelCase() y lo asignamos a la frase Camel
		camel = toCamelCase(frase);

		// Mostramos el resultado
		System.out.println("Frase \"" + frase + "\" en nomenclatura Camel: " + camel);

		// Cerramos el Scanner
		sc.close();

	}

}
