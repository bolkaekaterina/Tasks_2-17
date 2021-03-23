package by.htp.les01.main;

import java.util.Scanner;

public class Task_08 {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите а");
		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		a = sc.nextDouble();

		System.out.println("Введите b");
		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		b = sc.nextDouble();

		if (a == b) {
			System.out.println("скоро Новый Год!");
			return;
		} else {
			System.out.println("Введите c");

			while (!sc.hasNextDouble()) {
				sc.nextDouble();
			}
			c = sc.nextDouble();

			System.out.println("a + b + c = " + (a + b + c));
			System.out.println("a^2 + b^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)));
			System.out.println("моя любимая футбольная команда");
		}
	}
}
