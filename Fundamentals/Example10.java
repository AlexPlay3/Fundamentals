package by.http.homework.Sheiko;

public class Example10 {
	public static void main (String args []) {
		double x = 16;
		double y = 22;
		
		double z;
		
		z = (Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(x))) / (Math.cos(Math.toRadians(x)) + Math.sin(Math.toRadians(y))) * Math.tan(Math.toRadians(x*y));
		System.out.println("z = " +z );
		
		
		
		
		
	}
}
