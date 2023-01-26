package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class BQueueAtTheSchool {
 
	public static void main(String[] args) {
 
		int n, t;
		String s;
		String a = "";
		char G = 'G';
		char B = 'B';
		Scanner scan = new Scanner(System.in);
 
//		n is the number of children / string's length
		n = scan.nextInt();
 
//		t is the time / loops
		t = scan.nextInt();
 
//		s is the order of the children/string
		s = scan.next();
		
//		converting the string to char array
		char[] charS = s.toCharArray();
 
//		An iteration that loops t times to replace the B with G if found
		for (int i = 1; i <= t; i++) {
			for (int j = 0; j < n-1; j++) {
				if (charS[j] == B && charS[j+1] == G) {
					charS[j] = G;
					charS[j+1] = B;
					j++;
			}
		}
	}
//		Convert the array to string again
		a = new String(charS);
		
		System.out.println(a);
		
}
}