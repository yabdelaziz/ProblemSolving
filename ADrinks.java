package codeforces;

import java.util.Scanner;

public class ADrinks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		A variable for the number of the orange-containing drinks 
		int n = scan.nextInt();
//		A variable for the final result
		double result = 0;
//		A loop to sum the number of orange-containing drinks 
		for (int i = 0 ; i < n ; i++) {
			result += scan.nextDouble();
		}
//		Calculating the volume fraction in percent of orange juice in the cocktail.
		result /= n;
		
		System.out.println(result);
		scan.close();
	}

}
