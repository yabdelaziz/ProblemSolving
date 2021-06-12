package codeforces;

import java.util.Scanner;

public class AAddingDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong(), b = scan.nextLong(), n = scan.nextLong(), answer = -1;

		for (long i = 0; i < n; i++) {
			if (a % b == 0) {
				answer = b;
				break;
			} else {
				a += 1;
			} 

		}
		
		System.out.println(answer);
	}

}
