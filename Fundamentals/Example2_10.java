package by.http.homework.Sheiko;

import java.util.Scanner;

public class Example2_10 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input a first circle radius: ");
		int a = in.nextInt();
		
		Scanner intwo = new Scanner(System.in);
		System.out.println("Input a second circle radius: ");
	    int b = intwo.nextInt();
	    
	    int s;
	    int z;
	    
	    z = (int) (Math.PI * (a*a));
	    s = (int) (Math.PI * (b*b));
	    
	    if (z < s) {
	    	System.out.print("Площадь первого круга меньше  " );
	    } if (z == s) {
	    	System.out.print("Площади равны  " );
	    	
	    } else  {
	    	System.out.print("Площадь второго круга меньше  " );
	    	
	    }
	
}
}

