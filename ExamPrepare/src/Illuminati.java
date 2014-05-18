import java.util.Scanner;

public class Illuminati {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String textString = input.nextLine();
		textString = textString.toUpperCase();

		int numberVowers = 0;
		int sumVowers = 0;
		char[] charArray = textString.toCharArray();
		for (int i = 0; i < textString.length(); i++) {

			if (charArray[i] == 'A' || charArray[i] == 'E'
					|| charArray[i] == 'O' || charArray[i] == 'U'
					|| charArray[i] == 'I') {
				char ar = charArray[i];
				sumVowers += (int) ar;
				numberVowers++;
			}

		}

		System.out.println(numberVowers);
		System.out.println(sumVowers);
	}

}
