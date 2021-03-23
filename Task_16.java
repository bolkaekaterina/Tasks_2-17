package by.htp.les01.main;

import java.util.Scanner;

public class Task_16 {
	public static void main(String[] args) {

		final double Pi = 3.14159265358979;
		double r = 0;
		double c = 0;
		double s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите радиус:");

		while (!sc.hasNextDouble()) {
			System.out.println("Некорректный ввод данных:");
			sc.nextLine();
		}
		r = sc.nextDouble();

		c = 2 * Pi * r;

		s = Pi * Math.pow(r, 2);

		System.out.printf("Площадь окружности = " + "%.2f\n", c);
		System.out.printf("Площадь круга = " + "%.2f\n", s);

	}

}
