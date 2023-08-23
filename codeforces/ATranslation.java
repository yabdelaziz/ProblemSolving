package codeforces;

import java.util.Scanner;

public class ATranslation {

	public static void main(String[] args) {

		/*
		 *  Better solution
		 *  Scanner scan = new Scanner(System.in);
		 * 	System.out.println(new StringBuffer(scan.next()).reverse().toString().equals(scan.next()) ? "YES" : "NO");
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String berlandWord = scan.next();
		
		String word = scan.next();
		
		String birlandWord = "";
		
		for (int i = berlandWord.length(); i > 0; i--) {
			birlandWord += berlandWord.substring(i-1, i);
		}
		
		System.out.println(birlandWord.equals(word) ? "YES" : "NO");
		
	}

}
