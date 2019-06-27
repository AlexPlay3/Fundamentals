package by.http.homework.Sheiko;

import java.util.MissingFormatArgumentException;
public class Example21 {
	public static void main(String args[]) {
		
		
		double x = 123.456;
	
		
		x = (int)x/1000.0 + (x-(int)x) * 1000 ;
		
		
		System.out.printf("x = " + x);
	}
}
