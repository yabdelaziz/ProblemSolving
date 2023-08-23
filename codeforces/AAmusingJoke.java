package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class AAmusingJoke {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		A variable for both guest and host names combined, adding the guest first.
		String guestHostNames = scan.next();
//		adding the host name.
		guestHostNames += scan.next();
//		A variable for the letters in the pile 
		String letters = scan.next();
//		Converting names to char array in order to sort easily and compare it to letters.
		char[] names = guestHostNames.toCharArray();
//		Converting letters to char array in order to sort easily and compare it to names.
		char[] Letters = letters.toCharArray();
//		Sortng the arrays
		Arrays.sort(names);
		Arrays.sort(Letters);
//		A condition that states, if the 2 arrays are equal print yes, if not then print no
		if (Arrays.equals(names, Letters)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();
	}

}
