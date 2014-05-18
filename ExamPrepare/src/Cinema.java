import java.util.Scanner;

import java.io.Console;

public class Cinema {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cinemaType = input.nextLine();

		int row = input.nextInt();
		int col = input.nextInt();
		double price = 0;
		switch (cinemaType) {
		case "Premiere":
			price = 12;
			break;
		case "Normal":
			price = 7.5;
			break;
		case "Discount":
			price = 5;
			break;
		default:
			break;
		}
		double result = price * row * col;
		

		for (int i = 0; i < 20; i++) {
			System.out.printf("%.2f leva", result + i);
		}
		
	}
}


