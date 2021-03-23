package by.htp.les01.main;

import java.util.Scanner;

public class Task_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; true; i++) {
		
			System.out.println("Введите аргумент х: ");
			
			while (!sc.hasNextInt()) {
				System.out.println("Вы ввели не число");
				sc.nextLine();
			}
			 
								
			int x = sc.nextInt();
			
			System.out.println("Введите аргумент y: ");
			
			while (!sc.hasNextInt()) {
				System.out.println("Вы ввели не число");
				sc.next();
			}
			
			int y = sc.nextInt();
			
			System.out.println("Сумма = " + (x + y));
			System.out.println(" ");
			
			
		}
		
		
	}
}
