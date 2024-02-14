package parte1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 4 del apartado Tema 4.2 Parte 1:
 * Implementar un programa que lea una frase y muestre todas sus palabras
 * ordenadas de forma alfabética
 */
public class Ejercicio04 {
	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Frase que le pediremos al usuario
		String frase = "";

		// Tabla en la que extraeremos las palabras
		String[] palabras;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario una frase
		System.out.println("Introduzca una frase, separaré las palabras y las ordenaré alfabéticamente");
		// Y la asignamos a la frase
		frase = sc.nextLine();

		// Asignamos a las palabras el método split() con
		// nuestra frase con un espacio en blanco como separador
		palabras = frase.split(" ");

		// Ordenamos alfabéticamente las palabras de la tabla
		Arrays.sort(palabras);

		// Mostramos el resultado
		System.out.println("Las palabras de la frase \"" + frase + "\" ordenadas alfabéticamente:");

		// Bucle for que recorre la tabla de las palabras (ya ordenada)
		for (String palabra : palabras) {
			// Muestro cada palabra
			System.out.println(palabra);
		}
		// Cerramos el Scanner
		sc.close();
	}

}
