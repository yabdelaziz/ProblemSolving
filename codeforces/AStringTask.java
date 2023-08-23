package codeforces;

import java.util.Scanner;

public class AStringTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next().toLowerCase().replaceAll("[aoueiy]", "").replaceAll("(.)",".$1");
		
		System.out.println(word);
		
		scan.close();
	}

}
