package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 7 del apartado Tema 4.2 Parte 1: Solicitar
 * frase y palabra para buscar la palabra en la frase
 */
public class Ejercicio07 {
	/**
	 * Frase en el que buscaremos la palabra
	 */
	public static String frase = "";
	/**
	 * Palabra que se buscará en la frase
	 */
	public static String palabra = "";

	/**
	 * Scanner activado
	 */
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Función que devolvera el numero de veces que aparece la palabra del parametro
	 * en la frase del parametro
	 * 
	 * @param frase   String en donde realizaremos la busqueda
	 * @param palabra Palabra que buscaremos en la frase
	 * @return Numero de veces que la palabra aparece en la frase
	 */
	public static int vecesPalabraEnFrase(String frase, String palabra) {
		// Cantidad de veces que la palabra aparece en la frase (inicializada en 0)
		int cantPalabra = 0;

		// Ponemos la frase y la palabra en minúsculas para hacer la busqueda
		frase = frase.toLowerCase();
		palabra = palabra.toLowerCase();
		
		// Mientras exista la palabra en la frase
		while (frase.indexOf(palabra) != -1) {
			// La frase se acortará hasta la última apararición de la palabra
			frase = frase.substring(0, frase.lastIndexOf(palabra));
			// E incrementamos la cantidad de veces que la palabra aparece en la frase
			cantPalabra++;
		}

		// Devolverá el resultado del contador
		return cantPalabra;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Frase y palabra que le pediremos al usuario
		String frase = "";
		String palabra = "";

		// Cantidad de veces que la palabra aparece en la frase
		int cantPalabra;

		// Le pedimos al usuario una frase
		System.out.println("Introduzca una frase");
		// Y la asignamos a la variable frase
		frase = sc.nextLine();

		// Le pedimos al usuario una palabra
		System.out.println("Introduzca una palabra para buscar en la frase");
		// Y la asignamos a la variable palabra
		palabra = sc.nextLine();

		// Asignamos a cantPalabra el valor devuelto por la función
		// vecesPalabraEnFrase()
		cantPalabra = vecesPalabraEnFrase(frase, palabra);

		// Mostramos el resultado
		System.out.println("La palabra \"" + palabra + "\" aparece " + cantPalabra + " veces");

		// Cerramos el Scanner
		sc.close();
	}

}
