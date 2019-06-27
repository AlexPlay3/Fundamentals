package by.http.homework.Sheiko;

import java.util.Scanner;

public class Example2_3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
	    int a = in.nextInt();
	    int b = 3;
	    
	    if (a < b)
	    {
	    	System.out.print("Yes");	
	    } else {
	    	System.out.print("No");
	    }
	}
}
