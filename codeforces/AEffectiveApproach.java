package codeforces;

import java.util.Scanner;
 
public class AEffectiveApproach {
 
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
//		Variables to count the comparisons
		long vasyaCounter = 0, PetyaCounter = 0;
//		A variable for the number of elements
		int n = scan.nextInt();
 
		int[] list = new int[n+1];
 
		for (int i = 1; i <= n; i++) {
			list[scan.nextInt()] = i;
		}
 
		int m = scan.nextInt();
 
		for (int Q = 0; Q < m; Q++) {
			int q = scan.nextInt();
			vasyaCounter += list[q];
			PetyaCounter += n - list[q] +1;
		}
		System.out.println(vasyaCounter + " " + PetyaCounter);
		scan.close();
	}
 
}