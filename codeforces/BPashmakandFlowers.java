package codeforces;

import java.util.Scanner;

public class BPashmakandFlowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextInt(), min = 1000000000, max = 0, minCount = 1, maxCount = 1, maximal, ways, sameWays;

		for (int i = 0; i < n; i++) {
			long temp = scan.nextInt();

			if (temp == max) {
				maxCount++;
			}

			if (temp > max) {
				max = temp;
				maxCount = 1;
			}

			if (temp == min)
				minCount++;

			if (temp < min) {
				min = temp;
				minCount = 1;
			}

		}
		
		maximal = Math.abs(max - min);
		
		ways = maxCount * minCount;
		
		sameWays = n * (n - 1) / 2;
		
		System.out.println(min == max ? maximal + " " + sameWays : maximal + " " + ways);

		scan.close();
	}

}
