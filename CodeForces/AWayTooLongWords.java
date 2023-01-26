package CodeForces;

import java.util.Scanner;

public class AWayTooLongWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		A variable for the number of the words
		int n = scan.nextInt();
//		A variable to set the word
		String word = "";
//		A variable for the end result
		String outcome = "";
//		A loop that checks the word's length, based upon it, it will print if the length is less than 10, else it will print the first and the last chars and between them the number of chars
		for (int i = 0; i < n; i++) {
			word = scan.next();
			if (word.length() <= 10) {
				outcome += word + "\n";
			} else {
				String numbercount = String.valueOf((word.length()-1) - 1);
				outcome += word.substring(0, 1) + numbercount + word.substring(word.length()-1) + "\n";
			}
		}
		System.out.println(outcome);
		scan.close();
	}
}
