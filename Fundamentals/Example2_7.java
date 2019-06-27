package by.http.homework.Sheiko;

public class Example2_7 {
	public static void main (String args []) {
		
		int a = 6;
		int b = 8;
		int c = 12;
		
		int x = 7;
		
		int res;
		
		res = a * x * x + b * x + c;
		
		if (res < 0) {
			res = Math.abs(res);
			System.out.print("res = " + res);
		} else {
			System.out.print("res = " + res);	
		}
		

	}
}
