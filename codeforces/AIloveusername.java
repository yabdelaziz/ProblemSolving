package codeforces;

import java.util.Scanner;

public class AIloveusername {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		A variable that counts the amazing numbers
		int count = 0;
//		A variable for the array's size or how many contests
		int n = scan.nextInt();
//		Initializing an array to collect all the numbers or to collect all the contests' points
		int[] contestPoints = new int[n];
//		A loop that sets all the array's numbers
		for (int i = 0; i < n ; i++) {
			contestPoints[i] = scan.nextInt();
		}
//		two variable, max and min, both set to be the first index
		int max = contestPoints[0];
		int min = contestPoints[0];
//		A loop that check if the number is the biggest/smallest or not. If so then count++
		for (int i = 0; i < n; i++) {
			if (max < contestPoints[i]) {
				max = contestPoints[i];
				count++;
			}
			
			if (min > contestPoints[i]) {
				min = contestPoints[i];
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}
}
