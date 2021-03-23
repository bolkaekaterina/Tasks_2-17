package by.htp.les01.main;

import java.util.Scanner;

public class Task_13b {
	public static void main(String[] args) {
		
		double a  = 0;
		double b  = 0;
		double c  = 0;
		double d  = 0;
		double e = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введте а:");
		
		while(!sc.hasNextDouble()) {
			System.out.println("Некорректный ввод данных");
			sc.nextLine();			
		}
		a = sc.nextDouble();
		
		
		System.out.println("Введте b:");
		
		while(!sc.hasNextDouble()) {
			System.out.println("Некорректный ввод данных");
			sc.next();			
		}
		b = sc.nextDouble();
		
		
		System.out.println("Введте c:");
		
		while(!sc.hasNextDouble()) {
			System.out.println("Некорректный ввод данных");
			sc.next();			
		}
		c = sc.nextDouble();
		
		
		System.out.println("Введте d:");
		
		while(!sc.hasNextDouble()) {
			System.out.println("Некорректный ввод данных");
			sc.next();			
		}
		d = sc.nextDouble();
		
					
		if(c*d != 0) {
			
			e = (a * b / c * d) - (a * b - c) / c * d;
		}else {
			
			System.out.println("Знаменатель равен нулю");
			e = Double.NaN;
		}
		
		System.out.println("e = " + e);
		
		
	}
}
