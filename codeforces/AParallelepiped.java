package codeforces;

import java.util.Scanner;

public class AParallelepiped {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		Sum is a variable for the sum of all edges of the parallelepiped, a, b, & c are for the lengths of the sides that have one common vertex
		int sum = 0, a, b, c;
//		A variable for the first side
		int s1 = scan.nextInt();
//		A variable for the second side
		int s2 = scan.nextInt();
//		A variable for the third side
		int s3 = scan.nextInt();

		a = (int) Math.sqrt(s1 * s3 / s2);

		b = (int) Math.sqrt(s1 * s2 / s3);

		c = (int) Math.sqrt(s3 * s2 / s1);

		sum = 4 * (a + b + c);

		System.out.println(sum);
		scan.close();
	}
}
