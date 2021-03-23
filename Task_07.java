package by.htp.les01.main;

import java.util.Scanner;

public class Task_07 {
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

		if (a > b) {
			System.out.println("Введите c");

			while (!sc.hasNextDouble()) {
				sc.nextDouble();
			}
			c = sc.nextDouble();
			System.out.println("b + c = " + (b + c));
		}

		if (a == b) {
			System.out.println("Конец");
			return;
		}

		if (a < b) {
			System.out.println("Введите c");

			while (!sc.hasNextDouble()) {
				sc.nextDouble();
			}
			c = sc.nextDouble();
			System.out.println("a + b + c = " + (a + b + c) + " \"Новый год!\"");
		}
	}
}
