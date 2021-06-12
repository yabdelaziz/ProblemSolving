package codeforces;

import java.util.Scanner;

public class ATram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		A variable for the number of the tram's stop
		int n = scan.nextInt();
//		A variable to count the passengers in the tram, and the second one for the tram's capacity
		int count = 0, capacity=0;
//		A loop that returns the max capacity of the tram
		for (int i = 0; i < n; i++) {
			count -= scan.nextInt();
			count += scan.nextInt();
			capacity = Math.max(capacity, count);
		}
		
		System.out.println(capacity);
	}

}
