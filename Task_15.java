package by.htp.les01.main;

import java.util.Scanner;

public class Task_15 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int h = 0;
		double x = 0;
		double fn = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введте первое значение задаваемого диапазона:");

		while (!sc.hasNextInt()) {
			System.out.println("Некорректный ввод данных");
			sc.next();

		}
		a = sc.nextInt();

		System.out.println("Введте последнее значение задаваемого диапазона:");

		while (!sc.hasNextInt()) {
			System.out.println("Некорректный ввод данных");
			sc.next();

		}
		b = sc.nextInt();

		System.out.println("Введте шаг:");

		while (!sc.hasNextInt()) {
			System.out.println("Некорректный ввод данных");
			sc.next();

		}
		h = sc.nextInt();
		
		System.out.print("Значения аргумента" + "     ");
		System.out.println("Значения функции");
		System.out.println("  ");

		for ( x = a; x <= b; x = x + h) {
			
			fn = 2 * Math.tan((x / 2)) + 1;
			
			
		System.out.print (x + "                    ");
		System.out.println(fn);

		
		}
		
		
		
		
	}

}
