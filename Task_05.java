package by.htp.les01.main;

import java.util.Scanner;

public class Task_05 {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double s = 0; // сумма

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите 4 числа");

		while (!sc.hasNext()) {
			sc.nextDouble();
		}
		a = sc.nextDouble();

		while (!sc.hasNext()) {
			sc.nextDouble();
		}
		b = sc.nextDouble();
		
		while (!sc.hasNext()) {
			sc.nextDouble();
		}
		c = sc.nextDouble();

		while (!sc.hasNext()) {
			sc.nextDouble();
		}
		d = sc.nextDouble();

		s = a + b + c + d;
		System.out.println("Сумма чисел = " + s);
		sc.close();

	}
}
