package codeforces;

import java.util.Scanner;

public class ATeam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		A variable for the number of problems
		int n = scan.nextInt();
//		A variable to count how many is sure about the solution
		int counter = 0;
//		A variable to count how many problem have been solved
		int solvedProblems = 0;

		for (int i = 1; i <= 3*n ; i++) {
			counter += scan.nextInt();
//			if the row is finished then restart again from zero to count from the next row and add 1 to solvedProblems variable
			if (i % 3 == 0) {
				if (counter >= 2) {
					solvedProblems++;
				}
				counter = 0;
			}
		}
		System.out.println(solvedProblems);
		scan.close();
	}

}
