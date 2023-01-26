package CodeForces;

import java.util.Scanner;

public class APerfectPermutation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		if (size % 2 != 0) {
			System.out.println(-1);
		} else {
			for (int i = 1 ; i < size ; i+=2) {
				System.out.print((i+1) + " " + (i) + " ");
			}
		}
		
		scan.close();
	}

}
