package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class BSale {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(), m = scan.nextInt(), output = 0;

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		Arrays.sort(array);

		for (int i = 0; i < m; i++) {
			if (array[i] <= 0) {
				output += array[i];
			} else {
				break;
			}

		}

		System.out.println(Math.abs(output));
		scan.close();
	}

}
