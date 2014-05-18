import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrossingSequences {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		int thirdNum = input.nextInt();

		@SuppressWarnings("unused")
		int initialNum = input.nextInt();
		int step = input.nextInt();

		int tribonaci = 0;
		List<Integer> tibSeq = new ArrayList<Integer>();
		tibSeq.add(firstNum);
		tibSeq.add(secondNum);
		tibSeq.add(thirdNum);
		while (true) {

			tribonaci = firstNum + secondNum + thirdNum;
			firstNum = secondNum;
			secondNum = thirdNum;
			thirdNum = tribonaci;
			if (tribonaci < 1000000) {
				break;
			} else {
				tibSeq.add(tribonaci);
				System.out.println(tribonaci);
			}
		}
		//boolean found = false;
//		for (int i = 0; i < step; i++) {
//			for (int j = 0; j < tibSeq.size(); j++) {
//				if (initialNum.equal(tibSeq[j])) {
//
//				}
//			}
//		}
		System.out.println(tibSeq.size());
	}
}
