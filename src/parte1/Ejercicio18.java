package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 18 del apartado Tema 4.2 Parte 1: Codigo
 * HTML
 */
public class Ejercicio18 {
	/**
	 * Scanner activado
	 */
	static Scanner sc = new Scanner(System.in);

/**
 * Funcion que devuelve una cadena con un codigo HTML
 * @param titulo Texto para el <h1>
 * @param contenido Texto para el <p>
 * @return Codigo HTML con el titulo y el contenido introducido
 */
	public static String codigoHTML(String titulo, String contenido) {
		return "	<!DOCTYPE html>\n" 
				+ "	<html>\n" 
				+ "		<head>\n" 
				+ "			<meta charset=\"utf-8\">\n"
				+ "			<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
				+ "			<title>Ejercicio18</title>\n" 
				+ "		</head>\n" 
				+ "		<body>\n" 
				+ "			<h1>" + titulo + "</h1>\n" 
				+ "			<p>" + contenido + "</p>\n"  
				+ "		</body>\n"
				+ "	</html>";
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Título y contenido que le pediremos al usuario
		String titulo = "";
		String contenido = "";

		// Código en formato HTML que mostraremos
		String codigo = "";

		// Le pedimos un título al usuario
		System.out.println("Introduza el título de su página web");
		// Y lo asignamos al título
		titulo = sc.nextLine();

		// Le pedimos un contenido al usuario
		System.out.println("Introduza el contenido de su página web");
		// Y lo asignamos al contenido
		contenido = sc.nextLine();

		// Llamamos a la función codigoHTML y lo asignamos a nuestro código
		codigo =  codigoHTML(titulo, contenido);
		
		// Mostramos el resultado
		System.out.println("Código en formato HTML:");
		System.out.println(codigo);
		
		// Cerramos el Scanner
		sc.close();

	}

}
