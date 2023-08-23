package codeforces;

import java.util.Scanner;

public class APetyaandStrings {

	public static void main(String[] args) {
		
		/*
		 * better solution
		 * int v=sc.next().compareToIgnoreCase(sc.next());
			System.out.print(v<0?-1:v>0?1:0);
		 */
		
		Scanner scan = new Scanner(System.in);
//		A variable for the first string
		String firstStr = scan.next();
//		A variable for the second string
		String secondStr = scan.next();
//		Comparing the letters alphabetically with ignoring the letter case.
		if (firstStr.compareToIgnoreCase(secondStr) > 0) {
			System.out.println("1");
		} else if (firstStr.compareToIgnoreCase(secondStr) == 0) {
			System.out.println("0");
		} else {
			System.out.println("-1");
		}
		scan.close();
	}

}
