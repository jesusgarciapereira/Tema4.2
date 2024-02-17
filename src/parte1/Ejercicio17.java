package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 17 del apartado Tema 4.2 Parte 1:
 * Eliminacion de comentarios (/*)
 */
public class Ejercicio17 {
	/**
	 * Scanner activado
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que elimina los comentarios del codigo que le introduzcas
	 * 
	 * @param codigo Sentencia a la que queremos quitarle los comentarios
	 * @return Codigo sin los comentarios
	 */
	public static String eliminaComentarios(String codigo) {
		// Copia del código, al que le quitaremios los comentarios
		String duplicadoCodigo = "";
		// Enteros que representan las posiciones de incio y de final del comentario en
		// el código
		int posicionInicio;
		int posicionFinal;
		// Comentario que se elimina
		String comentario = "";

		// Asignamos el código duplicado
		duplicadoCodigo += codigo;

		// Mientras la copia del código del parámetro contenga /* y */
		while (duplicadoCodigo.contains("/*") && duplicadoCodigo.contains("*/")) {
			// LLamamos a la funcion indexOf() para determinar la posición de inicio y de
			// final del comentario
			posicionInicio = duplicadoCodigo.indexOf("/*");
			posicionFinal = duplicadoCodigo.indexOf("*/");
			// Asignamos al texto comentario la subcadena extraída de la copia dek código
			// desde la posición de inicio y de final incluidos
			comentario = duplicadoCodigo.substring(posicionInicio, posicionFinal + 2);
			// Suprimimos el comentario del código duplicado
			duplicadoCodigo = duplicadoCodigo.replace(comentario, "");
		}

		// Devolverá el código con todos los comentarios eliminados
		return duplicadoCodigo;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Código que le pediremos al usuario
		String codigo = "";
		// Código sin comentarios que mostraremos
		String codigoSinComentarios = "";

		// Le pedimos al usuario un código
		System.out.println("Introduzca un código");
		// Y lo asignamos al código
		codigo = sc.nextLine();

		// Llamamos a la función eliminaComentarios() y la asignamos al código sin
		// comentaarios
		codigoSinComentarios = eliminaComentarios(codigo);

		// Mostramos el resultado
		System.out.println(codigoSinComentarios);

		// Cerramos el Scanner
		sc.close();
	}

}
