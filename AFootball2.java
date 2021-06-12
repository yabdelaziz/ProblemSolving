package codeforces;

import java.util.Scanner;

public class AFootball2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String players = scan.next();
		
		System.out.println(players.contains("0000000") || players.contains("1111111") ? "YES" : "NO");
		
		scan.close();
	}

}
