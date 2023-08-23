package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class APanoramixsPrediction {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		the limit for length
		int max = 50;
		int n = scan.nextInt();
		int m = scan.nextInt();
//		searching for the next prime starting n+1s
		int nextPrime = BigInteger.valueOf(n).nextProbablePrime().intValue();
//		A condition to check if the given m equals the next prime to n
		if (m == nextPrime) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();
	}
}