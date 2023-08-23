package codeforces;

import java.util.Scanner;

public class AXeniaandRingroad {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextInt(), m = scan.nextInt(), counter = 0, location = 1;

		for (int i = 0; i < m; i++) {
			long temp = scan.nextLong();
			if (location <= temp) {
				counter += temp - location;
			} else {
				counter += (n - location) + temp;
			}
			location = temp;
		}
		System.out.println(counter);
		scan.close();
	}
}