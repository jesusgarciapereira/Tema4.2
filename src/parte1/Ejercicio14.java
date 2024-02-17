package parte1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 14 del apartado Tema 4.2 Parte 1: Contador
 * de letras
 */
public class Ejercicio14 {

	/**
	 * Funcion que muestra una lista con las letras que aparecen en la frase del
	 * parametro y su respectiva cantidad
	 * 
	 * @param frase Frase a la cual le contaremos sus letras
	 */
	public static void cuentaLetras(String frase) {
		// Tabla de letras de nuestra frase
		char[] letras;
		// Contador para el número de letras (inicializada en 1)
		int cantLetras = 1;

		// Llamamos a la función replace() para eliminar los espacios a la frase
		frase = frase.replace(" ", "");
		// Transformamos la frase del parámetro a minúsculas
		frase = frase.toLowerCase();
		// Llamamos al método toCharArray() para convertir la frase en una tablaa de
		// tipo char y la asignamos a nuestra tabla declarada
		letras = frase.toCharArray();
//		// LAS 3 LÍNEAS ANTERIORES SE PUEDEN SUSTITUIR POR:
//		letras = frase.replace(" ", "").toLowerCase().toCharArray();

		// Llamamos al método sort() para ordenar la tabla
		Arrays.sort(letras);

		// Bucle for que recorrerá cada caracter de la tabla letras
		for (int i = 0; i < letras.length; i++) {
			// Si nos encontramos en la última posición o la siguiente letra es diferente
			if (i == letras.length - 1 || letras[i] != letras[i + 1]) {
				// Mostramos la letra y la cantidad
				System.out.println(letras[i] + ": " + cantLetras + (cantLetras != 1 ? " veces" : " vez"));
				// Y reiniciamos el contador de letras a 1
				cantLetras = 1;
				// En caso contrario
			} else
				// Incrementamos el contador
				cantLetras++;
		}
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Frase que le pediremos al usuario
		String frase = "";

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos una frase al usuario
		System.out.println("Introduzca una frase (evite el uso de tildes)");
		// Y la asignamos a nuestra frase
		frase = sc.nextLine();

		//Mostramos el resultado
		System.out.println("Frase: " + frase);
		System.out.println("Resultado:");
		// Llamamos a la función cuentaLetras para mostrarnos el resultado
		cuentaLetras(frase);

		// Cerramos el Scanner
		sc.close();

	}

}
