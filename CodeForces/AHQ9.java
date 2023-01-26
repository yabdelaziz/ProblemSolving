package CodeForces;

import java.util.Scanner;

public class AHQ9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		A variable for the input, erasing all the chars which are not H, Q, or 9
		String input = scan.next().replaceAll("[^HQ9]", "");
//		After erasing the non H, Q, and 9 chars, if there is any char left so there is definitely an output
		if (input.length() > 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		scan.close();
	}

}
