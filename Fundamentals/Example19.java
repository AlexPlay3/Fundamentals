package by.http.homework.Sheiko;

public class Example19 {
	public static void main (String args []) {
		
		double a = 5;
		
		double ph = Math.pow(a, 2) * Math.sqrt(3)/4;
		
		double maxrad = a * (Math.sqrt(3)/3);
				
		double minrad = a * (Math.sqrt(3)/6);
		
		System.out.println("Площадь " + ph);
		System.out.println("Радиус описанной окружности " + maxrad);
		System.out.println("Радиус вписанной окружности " + minrad);
	}
	
}
