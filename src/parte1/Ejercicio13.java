package parte1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 13 del apartado Tema 4.2 Parte 1: Anagramas
 */
public class Ejercicio13 {

	// Primera frase
	public static String frase1 = "";
	// Segunda frase
	public static String frase2 = "";

	// Scanner activado
	static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que determina si las frases del parametro son anagramas
	 * @param frase1 Primera frase
	 * @param frase2 Segunda frase
	 * @return True o false segun si ambas son anagramas
	 */
	public static boolean esAnagrama(String frase1, String frase2) {
		boolean reultado = false;
		char letrasFrase1[];
		char letrasFrase2[];
		frase1.toLowerCase();
		frase2.toLowerCase();

		letrasFrase1 = frase1.toCharArray();
		letrasFrase2 = frase2.toCharArray();

		Arrays.sort(letrasFrase1);
		Arrays.sort(letrasFrase2);

		if (Arrays.equals(letrasFrase1, letrasFrase2))
			reultado = true;

		return reultado;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
