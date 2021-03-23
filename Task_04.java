package by.htp.les01.main;

import java.util.Scanner;


public class Task_04 {
	public static void main(String []args) {
		
//		String a  = "Болко Екатерина Николаевна, ул Скорины, 80291165966";
//		System.out.println(a + "\n");
//		
//		String b  = "Пройдет много лет, и полковник Аурелиано Буэндиа, стоя у стены в ожидании расстрела, \r\n"
//				+ "вспомнит тот далекий вечер, когда отец взял его с собой посмотреть на лед. Макондо было \r\n"
//				+ "тогда небольшим селением с двумя десятками хижин, выстроенных из глины и бамбука на \r\n"
//				+ "берегу реки, которая мчала свои прозрачные воды …";
//		System.out.println(b);
//	}
		
		
		double d = 0; // 1й катет
		double e = 0; // 2й катет
		double f = 0; // гипотенуза
		double s = 0; // площадь

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите длину первого катета");

		while (!sc.hasNextDouble()) {
			System.out.println("Вы ввели не число");
			sc.nextDouble();
		}

		d = sc.nextDouble();

		System.out.println("Введите длину второго катета");

		while (!sc.hasNextDouble()) {
			 System.out.println("Вы ввели не число");
			sc.nextDouble();
		}
		e = sc.nextDouble();

		if (d > 0 && e > 0) {
			f = Math.sqrt(Math.pow(d, 2) + Math.pow(e, 2));
		} else {
			System.out.println("Введите положительные числа");
			f = Double.NaN;
		}
		System.out.println("Гипотенуза треугольника  = " + f);

		if (d > 0 && e > 0) {
			s = (d * e) / 2;
		} else {
			System.out.println("Введите положительные числа");
			s = Double.NaN;
		}

		System.out.println("Площадь треугольника  = " + s);
		sc.close();
	}
}
		

