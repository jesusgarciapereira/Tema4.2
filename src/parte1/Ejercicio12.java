package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 12 del apartado Tema 4.2 Parte 1: Leer una
 * frase y encontrar la palabra de mayor longitud. El programa debe imprimir
 * tanto la palabra como el número de caracteres de la misma.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		// Frase que le pedimos al usuario
		String frase = "";
		// Tabla con cada una de las palabras
		String[] palabras;
		// Palabra más larga
		String palabraMasLarga = "";

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario una frase
		System.out.println("Introduzca una frase");
		// Y la asignamos
		frase = sc.nextLine();
		
		// Asignamos a palabras cada una de las palabras de la frase llamando al método split
		palabras = frase.split(" ");
		
		// Bucle for que recorrerá cada palabra de la tabla palabras
		for (int i = 0; i < palabras.length; i++) {
			// Si la longitud de la palabra es mayor que la de la palabra más larga
			if (palabras[i].length() > palabraMasLarga.length())
				// La asignamos como actual palabra más larga
				palabraMasLarga = palabras[i];
		}
		
		// Mostramos el resultado
		System.out.println("En la frase \"" + frase + "\" la palabra más larga es: \"" + palabraMasLarga + "\"");
		
		// Cerramos el Scanner
		sc.close();

	}

}
