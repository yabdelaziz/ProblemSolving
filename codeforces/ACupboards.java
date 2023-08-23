package codeforces;

import java.util.Scanner;

public class ACupboards {

	public static void main(String[] args) {
//		Better solution	
		Scanner sc= new Scanner(System.in);
		   int n=sc.nextInt();
		   int l=0;
		   int r=0;
		   for(int i=0;i<n;i++){
		     l+=sc.nextInt();
		     r+=sc.nextInt();
		   }
		   System.out.println(Math.min(l,n-l)+Math.min(r,n-r));	
/*		-----------------------------------------
		Scanner scan = new Scanner(System.in);
//		Scanning the number of cupboards
		int n = scan.nextInt();
//		A 2d array to store the doors positions
		int[][] doors = new int[n][2];
//		Variables for the doors positions, and needed moves
		int countLeftZeros = 0, countRightZeros = 0, moves = 0;
//		Scanning the doors positions
		for (int i = 0; i < doors.length; i++) {
			for (int j = 0; j < 2; j++) {
				doors[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < doors.length; i++) {
			for (int j = 0; j < 1; j++) {
//				A loop to count the left zeros positions
				if (doors[i][j] == 0) {
					countLeftZeros++;
				}
//				A loop to count the left zeros positions
				if (doors[i][j + 1] == 0) {
					countRightZeros++;
				}
			}
		}
//		Conditions to know the needed moves
		if (countLeftZeros <= (n / 2)) {	//if the left zero positions less than the left ones or equal to them, add the number of zeros to the moves
			moves += countLeftZeros;
		} else if (countLeftZeros == n) {	//if all the left positions are zero then no moves needed
			moves = 0;
		} else {
			moves = n - countLeftZeros;		//if the left zero positions are less then the left ones, subtract n from zeros to know how many ones
		}

		if (countRightZeros <= (n / 2)) {	//if the right zero positions less than the right ones or equal to them, add the number of zeros to the moves
			moves += countRightZeros;
		} else if (countRightZeros == n) {	//if all the right positions are zero then no moves needed
			moves += 0;
		} else {
			moves += n - countRightZeros;	//if the left right positions are less then the right ones, subtract n from zeros to know how many ones
		}
		
		System.out.println(moves);
		scan.close();*/
	}

}
