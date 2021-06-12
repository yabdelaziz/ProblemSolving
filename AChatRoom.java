package codeforces;

import java.util.Scanner;

public class AChatRoom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
		System.out.println(word.matches(".*h.*e.*l.*l.*o.*") ? "YES" : "NO");
		
		scan.close();
	}

}
