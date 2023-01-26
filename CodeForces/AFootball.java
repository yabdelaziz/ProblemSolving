package CodeForces;

import java.util.Scanner;

public class AFootball {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int counter = 1, goals = scan.nextInt();

		String teamA = "", teamB = "";

		if (goals <= 2) {
			System.out.println(scan.next());
		} else {
			teamA = scan.next();
			for (int i = 1; i < goals; i++) {
				String temp = scan.next();
				if (teamA.equals(temp)) {
					counter++;
				} else {
					teamB = temp;
				}
			}
		}

		System.out.println((goals - counter) <= (goals / 2) ? teamA : teamB);

	}

}
