/**
 * 
 */
package id.ststech.javabasic.arithmethic;

import java.util.Scanner;

/**
 * @author Ali Irawan
 *
 */
public class ArithmethicDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;

		int angka1;
		int angka2;

		System.out.print("Masukkan angka pertama: ");
		input = scanner.nextLine();

		// Convert inputted string into integer
		angka1 = Integer.parseInt(input);

		System.out.print("Masukkan angka kedua: ");
		input = scanner.nextLine();

		// Convert inputted string into integer
		angka2 = Integer.parseInt(input);

		// Prints output for each operation
		System.out.println(angka1 + " + " + angka2 + " = " + (angka1 + angka2));
		
		System.out.println(angka1 + " - " + angka2 + " = " + (angka1 - angka2));
		
		System.out.println(angka1 + " * " + angka2 + " = " + (angka1 * angka2));
		
		System.out.println(angka1 + " / " + angka2 + " = " + (angka1 / (float)angka2));
		
		System.out.println(angka1 + " % " + angka2 + " = " + (angka1 % angka2));
		
		scanner.close();
	}

}
