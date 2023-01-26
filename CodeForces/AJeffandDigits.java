package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AJeffandDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cards = scan.nextInt();

		List<Integer> digits = new ArrayList<Integer>();
		int sumDigits = 0;
		int number = 0;

		for (int i = 0; i < cards; i++) {
			number = scan.nextInt();
			sumDigits += number;
			digits.add(number);
		}

		Collections.sort(digits, Collections.reverseOrder());

		if (digits.contains(0) == false) {
			System.out.println(-1);
		} else if (digits.contains(5) == false) {
			System.out.println(0);
		} else {
			for (int i = 0; i < cards; i++) {
				if (digits.indexOf(0) == 0) {
					System.out.println(0);
					break;
				} else if (sumDigits % 9 == 0) {
					System.out.println(digits.toString().replaceAll("\\D", ""));
					break;
				} else {
					sumDigits -= 5;
					digits.remove(0);
				}
			}

		}

		scan.close();
	}

}
