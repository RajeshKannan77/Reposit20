package xxx;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value");

		int a = input.nextInt();

		if (a == 2) {

			System.out.println("Java");
		} else {

			System.out.println("Selenium");
		}
	}
}
