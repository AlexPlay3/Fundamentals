package by.http.homework.Sheiko;

import java.util.Scanner;

public class Example3_6 {
	public static void main(String[] args) {
		System.out.print("������� ����� ����� ������������� �����: ");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int sum = 0;
		for (int i=1; i<= n; i++){
			sum = sum + i;
		}
		System.out.println (sum);		
	}

}
