package by.http.homework.Sheiko;

import java.util.Scanner;

public class Example2_8 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input a number one: ");
		int a = in.nextInt();
		
		Scanner intwo = new Scanner(System.in);
		System.out.println("Input a number two: ");
	    int b = intwo.nextInt();
	    
	    if (Math.pow(a, 2) < Math.pow(b, 2)) {
	    	System.out.print("Наименьшее число " + Math.pow(a, 2) );
	    } else {
	    	System.out.print("Наименьшее число " + Math.pow(b, 2) );
	    }
	    	

	}

}
