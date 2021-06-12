package codeforces;

import java.util.Scanner;

public class AThenumberofpositions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt();
		
		System.out.println((n-a) <= b+1 ? (n-a) : (b+1));
		
		scan.close();
	}

}
