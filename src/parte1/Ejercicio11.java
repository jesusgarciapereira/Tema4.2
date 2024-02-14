package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 11 del apartado Tema 4.2 Parte 1:
 * Descodificador
 */
public class Ejercicio11 {

	/**
	 * Tabla de caracteres correspondiente al conjunto 1
	 */
	public static char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
	/**
	 * Tabla de caracteres correspondiente al conjunto 2
	 */
	public static char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

	/**
	 * Scanner activado
	 */
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que representa un descodificador
	 * 
	 * @param conjunto2 Conjunto de caracteres char que seran modificados
	 * @param conjunto1 Conjunto de caracteres char que seran el resultado del
	 *                  cambio
	 * @param c         Caracter que sera cambiado o no, segun si esta presente en
	 *                  el conjunto2
	 * @return Caracter del parametro, modificado o no
	 */
	public static char descodifica(char conjunto2[], char conjunto1[], char c) {

		// Variable local del contador para nuestro bucle while
		int i = 0;

		// Mientras el contador sea menor que la longitud del conjunto2 se ejecutarán las siguientes instrucciones
		while (i < conjunto2.length) {
			// Si el caracter del parámetro es igual a algún elemento del conjunto2
			if (c == conjunto2[i]) {
				// Se le asignará el elemento correspondiente del conjunto1
				c = conjunto1[i];
				// Y asignamos el contador como la longitud del conjunto2 menos 1 para así forzar la
				// salida del bucle
				i = conjunto2.length - 1;
			}
			// En cada iteración incrementamos el contador
			i++;
		}

		// Devolverá el caracter char c
		return c;

	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Texto codificado que le pediremos al usuario
		String textoCodificado = "";
		// Texto anterior pero descodificado
		String textoDescodificado = "";

		// Le pedimos al usuario un texto codificado
		System.out.println("Introduzca un texto codificado y lo mostraré descodificado");
		// Y lo asignamos a la variable textoCodificado
		textoCodificado = sc.nextLine();

		// Ponemos el texto codificado en minúsculas
		textoCodificado = textoCodificado.toLowerCase();

		// Bucle for que recorrerá cada caracter del texto codificado
		for (int i = 0; i < textoCodificado.length(); i++) {
			// Llamamos a la función descodifica() con el caracter correspondiente a la
			// posición en la que estamos y los concatenamos todos con el texto descodificado
			textoDescodificado += descodifica(conjunto2, conjunto1, textoCodificado.charAt(i));
		}

		// Mostramos el resultado
		System.out.println(textoDescodificado);

		// Cerramos el Scanner
		sc.close();
	}

}
