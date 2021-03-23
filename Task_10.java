package by.htp.les01.main;

import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {

		int a = 0;
		double d = 0;
		int e = 0;
		int count = 0;
		int count1 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество чисел");

		a = sc.nextInt();

		for (int i = 0; i < a; i++) {

			System.out.println("Вводите вещественные числа");

			while (!sc.hasNextDouble() || sc.hasNextInt()) {
				System.out.println("Вы ввели не вещественное число");
				sc.nextLine();
			}

			d = sc.nextDouble();

			e = (int) d;

			if (e % 2 == 0) {
				count++;
			}

			if (e > 15) {
				count1++;
			}

		}

		System.out.println("Количество четных чисел = " + count);
		System.out.println("Количество чисел > 15 = " + count1);

	}

}
