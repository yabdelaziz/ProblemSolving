package codeforces;

import java.util.Scanner;

public class ABit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		A variable for the number of statements in the program
		int statements = scan.nextInt();
//		A variable for the statement
		String x = "";
//		A variable of the final value of x
		int finalValue = 0;
		
		for (int i = 0; i < statements; i++) {
			x = scan.next();
//			Conditions that set the value
			if (x.startsWith("+")) {
				++finalValue;
			} else if (x.startsWith("-")){
				--finalValue;
			} else if (x.endsWith("+")) {
				finalValue++;
			} else {
				finalValue--;
			}
		}
		
		System.out.println(finalValue);
		scan.close();
	}

}
