package by.http.homework.Sheiko;

public class Example4_1 {
	public static void main(String[] args) {
Matt (2.2, 3.2, 4.2, 5.2, 6.2, 7.1 );
		


				
}
	
	public static void Matt (double x1,double x2, double x3, double y1, double y2, double y3) {
	double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
	double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
	if (a + b <= c || a + c <= b || a + c <= b)
		System.out.println("Треугольник не существует");
	else {
		double p = (a + b + c) / 2.0;
		double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Площадь: " + square);
}
}
	}

