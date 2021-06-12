package codeforces;

import java.util.Scanner;

public class ANearlyLuckyNumber {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

//		A variable that counts 4 & 7 numbers
		byte countLuckyDigits = 0;

		long n = scan.nextLong();

//		A loop that check how many 4 & 7 
		while (n > 0) {
//			getting the first digit in a new variable
			byte currentDigit = (byte) (n % 10);
//			count++ if founds 4 or 7
			if (currentDigit == 4 || currentDigit == 7) {
				
				countLuckyDigits++;
//			erase the right number from the n
				n = n / 10;
			} else {
				n = n / 10;
			}

		}

		if (countLuckyDigits == 4 || countLuckyDigits == 7) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
		scan.close();
	}

}
