package codeforces;

import java.util.Scanner;

public class AArrivaloftheGeneral {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Scanning the length of the soldiers array
		int n = scan.nextInt();
		
		int[] soldiers = new int [n];
//		Scanning the soldiers height in the array
		for (int i = 0; i < n ; i++) {
			soldiers[i] = scan.nextInt();
		}
//		A variable to store the biggest height in the array	
		int maxNum = soldiers[0];
//		A variable to store the smallest height in the array
		int minNum = soldiers[0];
//		A variable to store the biggest height location in the array	
		int maxNumLocation = 0;
//		A variable to store the smallest height location in the array	
		int minNumLocation = 0;
		
		for (int i = 0 ; i < soldiers.length ; i++) {
//		searching for the maxNum & maxNumLocation in the array 	
			if (soldiers[i] > maxNum) {
				maxNum = soldiers[i];
				maxNumLocation = i;
			}
//		searching the minNum & minNumLocation in the array
			if (soldiers[i] <= minNum) {
				minNum = soldiers[i];
				minNumLocation = i;
			}
		}
//		Counting the steps to make it correct, if maxNumLocation & minNumLocation will counter each other then
//		it considered one move, so it must be substracted
 		if (maxNumLocation>minNumLocation) {
			System.out.println((n - (minNumLocation+2)) + (maxNumLocation+1 - 1));
		} else {
			System.out.println((n - (minNumLocation+1)) + (maxNumLocation+1 - 1));
		}
		
 		scan.close();
	}

}
