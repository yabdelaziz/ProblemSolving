package codeforces;

import java.util.Scanner;

public class AStonesontheTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();
//		A variable to count the removed stones
		int removedStones = 0;
		
//		 if the pattern found removedStones++ 
		for (int i = 0; i < n-1; i++) {
			if ((s.charAt(i) == 'R' && s.charAt(i+1) == 'R') || (s.charAt(i) == 'B' && s.charAt(i+1) == 'B') || s.charAt(i) == 'G' && s.charAt(i+1) == 'G') {
				removedStones++;
			}
		}
		System.out.println(removedStones);
		scan.close();
	}
		
}