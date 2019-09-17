package loopsconcept;

import java.text.DecimalFormat;

public class LoopsAssignment {
	// 1. WAP to print following output:
	public static void main(String[] args) {

		String s = "I am Batman";
		for (int i = 1; i <= 5; i++) {
			System.out.println(s);
		}
		System.out.println("-----------------");

		for (int j = 1; j < 10; j++) {
			System.out.println("I am batmat" + " " + j);
		}
		System.out.println("-----------------");
		int x = 10;
		while (x >= 1) {
			System.out.println(x);
			x--;
		}
		System.out.println("-----------------");
		for (int y = 10; y >= 1; y--) {
			System.out.println(y);
		}
		System.out.println("-----------------");
		int z = 10;
		do {
			System.out.println(z);
			z--;
		} while (z >= 1);

		int k = 0;
		while (k < 10) {
			System.out.println("Hellow world");
			k++;
		}
		System.out.println("-----------------");

			}
}
