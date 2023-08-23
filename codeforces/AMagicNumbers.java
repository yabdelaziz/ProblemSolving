package codeforces;

import java.util.Scanner;

public class AMagicNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		A variable that stores the input number, with replacing only the targeted patterns
		String magicNum = scan.next().replaceAll("144", "a").replaceAll("14", "a").replaceAll("1", "a").replaceAll("a", "");
/*		Using a method that checks if the string is empty or not, 
		if it's empty due to replacing only the targeted patterns then print yes, otherwise print no*/
		System.out.println((magicNum.isEmpty()) ? "YES" : "NO");
		scan.close();
	}

}
