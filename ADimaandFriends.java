package codeforces;

import java.util.Scanner;

public class ADimaandFriends {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int sumFingers = 0, solutionCount = 0;

		for (int i = 0; i < n; i++) {
			sumFingers += scan.nextInt();
		}

		for (int i = 1; i < 6; i++) {
			if (((sumFingers + i) % (n + 1)) != 1) {
				solutionCount++;
			}
		}
		System.out.println(solutionCount);
		scan.close();
	}

}
