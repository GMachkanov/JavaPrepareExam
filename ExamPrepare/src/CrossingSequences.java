import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrossingSequences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Read inputs
		        int firstNum = input.nextInt();
		        int SecondNum = input.nextInt();
		        int ThirdNum = input.nextInt();
		        int initialNumber = input.nextInt();
		        int step = input.nextInt();
		// Create list
		        List<Integer> list = new ArrayList<Integer>();
		        list.add(firstNum);
		        list.add(SecondNum);
		        list.add(ThirdNum);

		        for (int i = 3; i < list.size() + 1; i++) {
		            int tribNum = list.get(i - 3) + list.get(i - 2) + list.get(i - 1);
		            if (tribNum > 1000000) {
		                break;
		            }
		            list.add(tribNum);
		        }
		        boolean foundNum = false;
		        int nextStep = 0;
		        if (initialNumber == list.get(0)
		                || initialNumber == list.get(1)
		                || initialNumber == list.get(2)) {
		            foundNum = true;
		        } else {
		            while (foundNum == false) {
		                nextStep += step;

		                // Loop for step
		                for (int i = 0; i < 2; i++) {
		                    initialNumber += nextStep;

		                    for (int j = 0; j < list.size(); j++) {
		                        if (initialNumber == list.get(j)) {
		                            foundNum = true;
		                            break;
		                        }
		                        if (initialNumber < list.get(j)) {
		                            break;
		                        }
		                    }
		                    if (foundNum) {
		                        break;
		                    }
		                }
		                if (initialNumber > 1000000) {
		                    break;
		                }
		            }
		        }
		        if (foundNum) {
		            System.out.println(initialNumber);
		        } else {
		            System.out.println("No");
		        }
	}
}
