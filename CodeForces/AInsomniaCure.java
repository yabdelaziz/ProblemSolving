package CodeForces;

import java.util.Scanner;

public class AInsomniaCure {

	public static void main(String[] args) {
//		Declaring the inputs
		int k, l, m, n, d;
//		A variable that counts the numbers that could be divided on the inputs (Damaged dragons)
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		k = scan.nextInt();
		l = scan.nextInt();
		m = scan.nextInt();
		n = scan.nextInt();
		d = scan.nextInt();
//		A loop that counts the numbers that could be divided on k, l, m, n, and d
		for(int i = 1; i <= d; i++) {
			if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}

}