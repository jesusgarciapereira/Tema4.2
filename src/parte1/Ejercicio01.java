package parte1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Frases que le pediremos al usuario
		String frase1 = "";
		String frase2 = "";

		// String para guardar la frase más corta de las dos
		String fraseMasCorta = "";

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario la primera frase
		System.out.println("Escriba una frase");
		// Y la asignamos a frase1
		frase1 = sc.nextLine();

		// Le pedimos al usuario la segunda frase
		System.out.println("Escriba otra frase");
		// Y la asignamos a frase2
		frase2 = sc.nextLine();

		// Asignamos a fraseMasCorta es String de menos longitud
		fraseMasCorta = frase1.length() < frase2.length() ? frase1 : frase2;

		// Mostramos el resultado
		// Si ambas frases tienen distinta longitud
		if (frase1.length() != frase2.length())
			// Mostramos este mensaje
			System.out.println("La frase \"" + fraseMasCorta + "\" es la más corta");
		// En caso contrario
		else
			// Mostramos este otro mensaje
			System.out.println("Ambas frases tienen la misma longitud");
		
		// Cerramos el Scanner
		sc.close();

	}

}
