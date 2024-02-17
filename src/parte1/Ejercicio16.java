package parte1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 16 del apartado Tema 4.2 Parte 1: Juego del
 * anagrama (modificado)
 */
public class Ejercicio16 {

	/**
	 * Objeto de tipo Random
	 */
	static Random r = new Random();

	/**
	 * Scanner activado
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que devuelve el texto del parametro pero desordenado
	 * 
	 * @param texto String introducido por el usuario
	 * @return El texto del parametro pero desordenado
	 */
	public static String desordenaTexto(String texto) {
		// Texto desordenado que devolverá la función
		String textoDesordenado = "";
		// Tabla que guardará enteros con las posiciones ya seleccionadas del texto
		int posicionesYaSeleccionadas[] = new int[texto.length()];
		// Número generado aleatoriamente
		int intAleatorio;

		// Relleno la tabla de posiciones ya seleccionadas con -1
		Arrays.fill(posicionesYaSeleccionadas, -1);

		// Bucle for que ejecutará las instrucciones tantas veces como caracteres haya
		// en el texto
		for (int i = 0; i < texto.length(); i++) {
			do {
				// Asignamos a intAleatorio un número entre el 0 y la longitud del texto del
				// parámetro excluido
				intAleatorio = r.nextInt(0, texto.length());
				// Si dicho número está presente en las posiciones ya seleccionadas, generará
				// otro hasta que deje de cumplirse esa condición
			} while (Arrays.binarySearch(posicionesYaSeleccionadas, intAleatorio) >= 0);

			// Concatenaremos el caracter aleatorio obtenido del texto con nuestro texto
			// desordenado
			textoDesordenado += texto.charAt(intAleatorio);
			// Agregamos dicho número aleatorio a nuestra tabla de posiciones ya
			// seleccionadas
			posicionesYaSeleccionadas[0] = intAleatorio;
			// Ordenamos la tabla de posiciones ya seleccionadas
			Arrays.sort(posicionesYaSeleccionadas);
		}
		// Le quitamos los espacios al texto desordenado
		textoDesordenado = textoDesordenado.replace(" ", "");

		// Devolverá el texto desordenado
		return textoDesordenado;
	}

	/**
	 * Funcion que recorre todos los caracteres de ambas frases para determinar
	 * cuantos coinciden
	 * 
	 * @param frase1 Frase introducida por el jugador 1
	 * @param frase2 Frase introducida por el jugador 2
	 * @return Numero de caracteres que coinciden
	 */
	public static int cuentaCoincidencias(String frase1, String frase2) {
		// La frase más corta entre ambas del parámetro
		String fraseCorta = "";
		// Contador de las coincidencias de caracteres
		int cantCoincidencias = 0;

		// Mediante un operador ternario, fraseCorta referenciará a la frase más corta
		fraseCorta = frase1.length() <= frase2.length() ? frase1 : frase2;
		
		// Bucle for que recorrerá todos los caracteres de la frase más corta
		for (int i = 0; i < fraseCorta.length(); i++) {
			// Si los caracteres de ambas frases en una determinada posición son iguales
			if (frase1.charAt(i) == frase2.charAt(i))
				// Incrementamos el contador
				cantCoincidencias++;
		}

		// Devolverá el valor de nuestro contador
		return cantCoincidencias;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Texto que le pediremos al jugador 1
		String texto = "";
		// Texto desordenado que mostraremos
		String textoDesordenado = "";
		// Texto que le pediremos al jugador 2
		String intentaAcertar = "";
		// Cantidad de caracteres que coinciden en ambas frases
		int cantCoincidencias;

		// Mientras el texto esté vacío se ejecutarán estas instrucciones
		while (texto.isEmpty()) {
			// Le pedimos al jugador 1 un texto
			System.out.println("Jugador 1, introduzca un texto");
			// Y lo asignamos al texto
			texto = sc.nextLine();
		}
		// Asignamos al texto desordenado el valor vuelto por la función
		// desordenaTexto()
		textoDesordenado = desordenaTexto(texto);
		// Y lo mostramos
		System.out.println(textoDesordenado);

		// Le pedimos al jugador 2 que intente acertar
		System.out.println("Jugador 2, intente acertar");
		// Y lo asignamos a la variable intentaAcertar
		intentaAcertar = sc.nextLine();

		// Mientras el texto sea distinta de la respuesta del jugador dos
		while (!texto.equalsIgnoreCase(intentaAcertar)) {
			// Asignamos al número de coincidencias el valor devuelto por la función
			// cuentaCoincidencias()
			cantCoincidencias = cuentaCoincidencias(texto, intentaAcertar);
			// Le pedimos al jugador 2 que intente acertar
			System.out.println("Hay " + cantCoincidencias + " coincidencia(s), inténtelo de nuevo");
			// Y lo asignamos a la variable intentaAcertar
			intentaAcertar = sc.nextLine();
		}

		// Al salir del bucle, mostramos el mensaje de victoria
		System.out.println("¡Correcto!, la respuesta era \"" + texto + "\"");

		// Cerramos el Scanner
		sc.close();
	}

}
