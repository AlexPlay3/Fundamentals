package by.http.homework.Sheiko;

import java.util.Scanner;

public class Example2_6 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input a number one: ");
		int a = in.nextInt();

		Scanner intwo = new Scanner(System.in);
		System.out.println("Input a number two: ");
		int b = intwo.nextInt();


		if (a > b && a != b) {
			System.out.println("Наибольшее число " + a);
		} else {
			System.out.println("Наибольшее число " + b);
		}
	}
}
