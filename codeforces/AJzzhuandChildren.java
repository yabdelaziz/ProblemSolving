package codeforces;

import java.util.Scanner;

public class AJzzhuandChildren {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		Variables for the number of children, the candles per child, & for the last child
		double n = scan.nextInt(), m = scan.nextInt(), lastChild = Math.ceil(scan.nextInt() / m);
//		A variable for the position of the last child
		int position = 0;

//		A loop that gets the last child with his position
		for (int i = 1; i < n; i++) {
			double temp = Math.ceil(scan.nextInt() / m);
				
				if (lastChild <= temp) {
				lastChild = temp;
				position = i;
			}
		}
		
		System.out.println(position+1);
		scan.close();
	}
}
