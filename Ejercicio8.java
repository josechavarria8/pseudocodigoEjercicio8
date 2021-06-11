
import java.util.Scanner;

import java.util.Random;
public class Ejercicio8 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numa;
		String salir;

		do {
			System.out.println("Ingrese una letra: ");
			salir = scanner.nextLine();
			do {
				numa = random.nextInt(100);
			} while (numa%5!=0);
			if (salir.equals("S") || salir.equals("s")) {
				System.out.println("");
			} else {
				System.out.println(numa);
			}
		} while (!(salir.equals("S") || salir.equals("s")));
	}


}

