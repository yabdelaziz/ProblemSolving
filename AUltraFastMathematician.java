package codeforces;

import java.util.Scanner;

public class AUltraFastMathematician {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		Scanning the first number in a string
		String firNum = scan.next();
//		Scanning the Second number in a string
		String secNum = scan.next();
//		A new string for the final outcome
		String finalNum = "";
//		A loop that outcomes the needed result 
		for (int i = 0; i < firNum.length(); i++) {
			if (firNum.charAt(i) != secNum.charAt(i)) {
				finalNum += "1";
			} else {
				finalNum += "0";
			}
		}
		System.out.println(finalNum);
		scan.close();
	}
}
