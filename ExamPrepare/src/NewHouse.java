import java.util.Scanner;

public class NewHouse {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();

		int outerDots = n / 2;
		int innerDots = 0;

		for (int i = 0; i < n / 2 + 1; i++) {
			for (int j = 0; j < outerDots; j++) {
				System.out.print("-");
			}
			for (int j = 0; j < innerDots; j++) {
				System.out.print("*");
			}
			System.out.print("*");
			for (int j = 0; j < innerDots; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < outerDots; j++) {
				System.out.print("-");
			}
			innerDots++;
			outerDots--;
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print("|");
			for (int j = 0; j < n-2; j++) {
				System.out.print("*");
			}
			System.out.println("|");
		}

	}

}
