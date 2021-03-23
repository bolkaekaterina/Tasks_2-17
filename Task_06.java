package by.htp.les01.main;

import java.util.Scanner;

public class Task_06 {
	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите a");

		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		a = sc.nextDouble();

		System.out.println("Введите b");
		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		b = sc.nextDouble();

		System.out.println("Введите c");
		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		c = sc.nextDouble();

		double z = 0;
		double temp;

		temp = Math.log((Math.pow(b, 2)) + 1);

		if (temp > 0) {
			z = Math.pow(a, 2) - Math.pow((b - c), 2) + temp;

		} else {
			System.out.println("Логарифм не может быть отрицательным числом");
		}
		System.out.println("a^2-(b-c)^2+ln(b^2+1) = " + z);
		sc.close();

	}
}
