package codeforces;

import java.util.Scanner;

public class AWordCapitalization {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
//		Capialize the first letter
		System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
		
	}
	
}
