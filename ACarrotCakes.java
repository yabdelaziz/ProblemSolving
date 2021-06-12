package codeforces;

import java.util.Scanner;

public class ACarrotCakes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(), t = scan.nextInt(), k = scan.nextInt(), d = scan.nextInt(), rounds, totalTime, oven;

		if (n % k == 0) {
			rounds = n / k;
		} else {
			rounds = n / k + 1;
		}
		totalTime = t * rounds;

		System.out.println((totalTime - d) > t ? "YES" : "NO");
		
		scan.close();

	}

}
