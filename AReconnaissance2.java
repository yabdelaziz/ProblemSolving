package codeforces;

import java.util.Scanner;

public class AReconnaissance2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		A variable for the total number of soldiers
		int soldiersNum = scan.nextInt();
//		An array to store the heights of the soldiers
		int[] heights = new int[soldiersNum];

//		Storing soldiers' heights in an array
		for (int i = 0; i < soldiersNum; i++) {
			heights[i] = scan.nextInt();
		}

		int temp = Math.abs(heights[0] - heights[soldiersNum-1]);
		int numOnePosition = 0;
		int numTwoPosition = soldiersNum-1;

		for (int i = 0; i < heights.length-1; i++) {
			if (temp > Math.abs(heights[i] - heights[i + 1])) {
				temp = Math.abs(heights[i] - heights[i + 1]);
				numOnePosition = i;
				numTwoPosition = i + 1;
			} else {
				continue;
			}
		}
		System.out.println((numOnePosition + 1) + " " + (numTwoPosition + 1));

		scan.close();
	}
}