package CodeForces;

import java.util.Scanner;

public class AWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		A variable to count the uppercases
		int count = 0;

		String s = scan.next();

//		check how many upper case characters
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				count++;
		}
		
//		setting the string based on how many upper case characters
		if (s.length() - count >= count) {
			System.out.println(s.toLowerCase());
		} else {
			System.out.println(s.toUpperCase());
		}
		
	}

}
