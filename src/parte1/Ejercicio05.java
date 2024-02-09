package parte1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Cadena de palabras introducidas por el usuario
		String palabras = "";
		// Copia de la cadena de palabras introducidas por el usuario pero en minúsculas
		String palabrasEnMinusculas = "";
		// Cadena de palabras que mostraremos
		String palabrasMostradas = "";
		
		// Constante con la palabra tabú que buscaremos para no mostrarla
		final String PALABRA_TABU = " fin ";

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println(
				"Introduzca unas palabras, las leeré y mostraré hasta que aparezca la palabra \"fin\" (en mayúsculas o minúsculas)");
		// Y la asignamos a nuestra variable cadena
		palabras = sc.nextLine();

		// Copiamos las palabras introducidas por el usuario en otra variable y en
		// minúsculas para hacer la búsqueda
		palabrasEnMinusculas = palabras.toLowerCase();

		// Si la palabra tabú no aparece en las palabras en minúsculas
		if (palabrasEnMinusculas.indexOf(PALABRA_TABU) == -1)
			// Asignamos a las palabras mostradas las palabras introducidas por el usuario
			// tal cual
			palabrasMostradas = palabras;
		// En caso contrario
		else
			// Asignamos a las palabras mostradas las palabras introducidas por el usuario
			// desde el inicio hasta la aparición de la palabra tabú
			palabrasMostradas = palabras.substring(0, palabrasEnMinusculas.indexOf(PALABRA_TABU));

		// Mostramos el resultado
		System.out.println(palabrasMostradas);

		// Cerramos el Scanner
		sc.close();

	}
}