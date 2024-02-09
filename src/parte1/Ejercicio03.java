package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 3 del apartado Tema 4.2 Parte 1: Introducir
 * una frase por teclado e indicar cuantos espacios en blanco tiene
 */
public class Ejercicio03 {
	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Frase que le pediremos al usuario
		String frase = "";

		// Contador de espacios en blanco
		int contadorEspacios = 0;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduzca una frase, indicaré cuantos espacios en blanco hay");
		// Y la asignamos a nuestra variable frase
		frase = sc.nextLine();

		// For que recorre cada caracter de la frase
		for (int i = 0; i < frase.length(); i++) {
			// Si el caracter es un espacio en blanco
			if (frase.charAt(i) == ' ')
				// Incrementará la variable del contador de espacios
				contadorEspacios++;
		}
			// Mostramos el resultado
			System.out.println("La frase \"" + frase + "\" tiene " + contadorEspacios + " espacio(s) en blanco");
			
			// Cerramos el Scanner
			sc.close();
		
	}

}
