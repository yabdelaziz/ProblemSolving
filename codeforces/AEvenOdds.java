package codeforces;

import java.util.Scanner;

public class AEvenOdds {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		Variables for the natural numbers, and the needed position
		long n = scan.nextLong(), k = scan.nextLong();
//		Variables for the final value, and the middle of the n
		long value, middle;
//		A condition for calculating the middle
		if (n % 2 == 0) {
			middle = n / 2;
		} else {
			middle = n / 2 + 1;
		}
//		A condition for getting the value
		if (k <= middle) {
			value = k + (k - 1);
		} else {
			value = (k - middle) * 2;
		}

		System.out.println(value);
		scan.close();
	}

}
