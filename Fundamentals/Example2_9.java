package by.http.homework.Sheiko;

import java.util.Scanner;

public class Example2_9 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input a number one: ");
		int a = in.nextInt();
		
		Scanner intwo = new Scanner(System.in);
		System.out.println("Input a number two: ");
	    int b = intwo.nextInt();
	    
	    Scanner inthree = new Scanner(System.in);
		System.out.println("Input a number two: ");
	    int c = intwo.nextInt();
	    
	    if (a == b & b == c) {
	    	
	    	System.out.print(" Треуголник равносторонний " );
	    	
	    }else {
	    		System.out.print(" Треуголник не равносторонний " );
	    	}
	    	
	    }
	}

