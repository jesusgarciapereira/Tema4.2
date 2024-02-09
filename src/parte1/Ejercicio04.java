package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 4 del apartado Tema 4.2 Parte 1: Cadena
 * invertida
 */
public class Ejercicio04 {

	/**
	 * 
	 * @param cadena Cadena que queremos invertir
	 * @return cadenaInvertida Cadena del parametro en orden inverso
	 */
	public static String invierteCadena(String cadena) {
		// Cadena que devolverá la función
		String cadenaInvertida = "";

		// Bucle for que recorrerá cada caracter de la cadena del parámetro pero en
		// orden inverso
		for (int i = cadena.length() - 1; i >= 0; i--) {
			// A la cadena invertida le concatenamos cada caracter por el que pasa el bucle
			cadenaInvertida += cadena.charAt(i);
		}

		// Devolverá la cadena en orden inverso
		return cadenaInvertida;

	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Cadena que introducirá el usuario
		String cadena = "";
		// Cadena introducida por el usuario pero invertida
		String cadenaInvertida = "";

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una cadena de caracteres
		System.out.println("Introduzca una cadena de caracteres, te la mostraré invertida");
		// Y la asignamos a nuestra variable cadena
		cadena = sc.nextLine();

		// Asignamos a la cadena invertida la cadena devuelta por la funcion
		// invierteCadena()
		cadenaInvertida = invierteCadena(cadena);

		// Mostramos el resultado
		System.out.println("La cadena \"" + cadena + "\" al revés sería: \"" + cadenaInvertida + "\"");
		
		// Cerramos el Scanner
		sc.close();
	}

}
