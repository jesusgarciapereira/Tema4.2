package parte1;

import java.util.Scanner;

/**
 * Clase que representa al Ejercicio 2 del apartado Tema 4.2 Parte 1: El
 * disennio del juego "Acierta la contrasennia"
 */
public class Ejercicio02 {
	/**
	 * Frase que introducirá el primer jugador (la contraseña)
	 */
	static String primeraFrase = "";
	/**
	 * Frase que introducirá el segundo jugador (intenta acertar la contraseña)
	 */
	static String segundaFrase = "";
	/**
	 * Scanner activado
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Funcion que representa la version basica del juego "Acierta la contrasennia"
	 */
	public static void aciertaLaContrasennia() {
		// Mensaje de bienvenida
		System.out.println("Bienvenidos a la versión básica del juego \"Acierta la contraseña\"");

		// Le pedimos al jugador 1 la contraseña
		System.out.println("Jugador 1, introduzca la contraseña");
		// Y la asignamos a la primera frase
		primeraFrase = sc.nextLine();

		// Le pedimos al jugador 2 que trate de adivinar la contraseña
		System.out.println("Jugador 2, adivine la contraseña (teniendo en cuenta mayúsculas y minúsculas)");
		// Y la asignamos a la segunda frase
		segundaFrase = sc.nextLine();

		// Mientras ambas frases sean diferentes, repetiremos todas estas instrucciones
		while (!segundaFrase.equals(primeraFrase)) {

			// Y la segunda frase es alfabéticamente mayor que la primera
			if (segundaFrase.compareTo(primeraFrase) > 0)
				// Se mostrará este mensaje
				System.out.println("Su frase es alfabéticamente mayor que la contraseña");
			// Y la segunda frase es alfabéticamente menor que la primera
			else if (segundaFrase.compareTo(primeraFrase) < 0)
				// Se mostrará este mensaje
				System.out.println("Su frase es alfabéticamente menor que la contraseña");

			// Y se le pedirá que lo intente de nuevo
			System.out.println(
					"Inténtelo de nuevo (recuerde que las minúsculas son alfabéticamente mayores que las mayúsculas)");
			// Y la asignamos nuevamente a la segunda frase
			segundaFrase = sc.nextLine();
		}

		// Al salir del bucle while significará que hemos acertado
		System.out.println("Enhorabuena, has acertado. La contraseña era " + primeraFrase);

	}

	/**
	 * Clase main
	 * @param args
	 */
	public static void main(String[] args) {
		// Llamamos a la función aciertaLaContrasennia() para que muestre todo el desarrollo del juego
		aciertaLaContrasennia();

		// Cerramos el Scanner
		sc.close();

	}
}
