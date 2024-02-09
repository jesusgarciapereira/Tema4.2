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
	 * Funcion para introducir la contrasennia y pedir el primer intento del jugador 2
	 */
	public static void introducirContrasennia() {
		// Le pedimos al jugador 1 la contraseña
		System.out.println("Jugador 1, introduzca la contraseña");
		// Y la asignamos a la primera frase
		primeraFrase = sc.nextLine();

		// Le pedimos al jugador 2 que trate de adivinar la contraseña
		System.out.println("Jugador 2, adivine la contraseña (teniendo en cuenta mayúsculas y minúsculas)");
		// Y la asignamos a la segunda frase
		segundaFrase = sc.nextLine();
	}

	/**
	 * Funcion que representa la version basica del juego "Acierta la contrasennia"
	 */
	public static void aciertaLaContrasennia() {
		// Mensaje de bienvenida
		System.out.println("Bienvenidos a la versión básica del juego \"Acierta la contraseña\"");

		// Llamamos a la función introducirContrasennia()
		introducirContrasennia();

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
	 * Funcion que representa la version avanzada del juego "Acierta la
	 * contrasennia"
	 */
	public static void aciertaLaContrasenniaAvanzado() {
		// Mensaje de bienvenida
		System.out.println("Bienvenidos a la versión avanzada del juego \"Acierta la contraseña\"");

		// Llamamos a la función introducirContrasennia()
		introducirContrasennia();

		// Mientras ambas frases sean diferentes, repetiremos todas estas instrucciones
		while (!segundaFrase.equals(primeraFrase)) {
			// Bucle for que recorre cada caracter de la primera frase
			for (int i = 0; i < primeraFrase.length(); i++) {
				// Si coinciden los caracteres de ambas frases
				if (primeraFrase.charAt(i) == segundaFrase.charAt(i))
					// Se muestra dicho caracter
					System.out.print(primeraFrase.charAt(i));
				// En caso contrario
				else
					// Se muestra un asterisco
					System.out.print("*");
			}
			// Salto de línea
			System.out.println();
		
		// Y se le pedirá que lo intente de nuevo
		System.out.println("Inténtelo de nuevo (recuerde que las minúsculas y las mayúsculas cuentan)");
		// Y la asignamos nuevamente a la segunda frase
		segundaFrase = sc.nextLine();
		}
		// Al salir del bucle while significará que hemos acertado
		System.out.println("Enhorabuena, has acertado. La contraseña era " + primeraFrase);
	}

	/**
	 * Clase main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Variable con la opción que elegirá el jugador
		String juguemos = "";
		
		// Llamamos a la función aciertaLaContrasennia() para que muestre todo el
		// desarrollo del juego
		aciertaLaContrasennia();
		
		// Preguntamos al jugador si quiere probar la versión avanzada
		System.out.println("¿Quieres probar la versión avanzada? (s/n)");
		// Y asignamos lo que escriba en el teclado
		juguemos = sc.nextLine();

		// Si ha escrito "s"
		if(juguemos.equalsIgnoreCase("s"))			
		// Llamamos a la función aciertaLaContrasenniaAvanzado() para que muestre todo
		// el desarrollo del juego en la versión avanzada
		aciertaLaContrasenniaAvanzado();
		// En caso contrario
		else
			// No hay juego
			System.out.println("Pues nada... adiós");
		
		// Cerramos el Scanner
		sc.close();

	}
}
