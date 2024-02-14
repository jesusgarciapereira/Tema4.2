package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 10 del apartado Tema 4.2 Parte 1:
 * Codificador
 */
public class Ejercicio10 {

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
	 * Funcion que representa un codificador
	 * 
	 * @param conjunto1 Conjunto de caracteres char que seran modificados
	 * @param conjunto2 Conjunto de caracteres char que seran el resultado del
	 *                  cambio
	 * @param c         Caracter que sera cambiado o no, segun si esta presente en
	 *                  el conjunto1
	 * @return Caracter del parametro, modificado o no
	 */
	public static char codifica(char conjunto1[], char conjunto2[], char c) {

		// Variable local del contador para nuestro bucle while
		int i = 0;

		// Mientras el contador sea menor que la longitud del conjunto1 se ejecutarán las siguientes instrucciones
		while (i < conjunto1.length) {
			// Si el caracter del parámetro es igual a algún elemento del conjunto1
			if (c == conjunto1[i]) {
				// Se le asignará el elemento correspondiente del conjunto2
				c = conjunto2[i];
				// Y asignamos el contador como la longitud del conjunto1 menos 1 para así forzar la
				// salida del bucle
				i = conjunto1.length - 1;
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
		// Texto que le pediremos al usuario
		String texto = "";
		// Texto anterior pero codificado
		String textoCodificado = "";

		// Le pedimos al usuario un texto
		System.out.println("Introduzca un texto y lo mostraré codificado");
		// Y lo asignamos a la variable texto
		texto = sc.nextLine();

		// Ponemos el texto en minúsculas
		texto = texto.toLowerCase();

		// Bucle for que recorrerá cada caracter del texto
		for (int i = 0; i < texto.length(); i++) {
			// Llamamos a la función codifica() con el caracter correspondiente a la
			// posición en la que estamos y los concatenamos todos con el texto codificado
			textoCodificado += codifica(conjunto1, conjunto2, texto.charAt(i));
		}

		// Mostramos el resultado
		System.out.println(textoCodificado);

		// Cerramos el Scanner
		sc.close();
	}

}
