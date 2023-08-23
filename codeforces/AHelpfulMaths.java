package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class AHelpfulMaths {

	public static void main(String[] args) {

//		A better solution
		
		String[] sc = new Scanner(System.in).next().split("\\+");
        Arrays.sort(sc);
        System.out.print(String.join("+", sc));
		
/* 		
		-------------------------------------
		Scanner scan = new Scanner(System.in);
//		A variable for the final outcome
		String outcome = "";
//		A variable for the sum before any processing
		String s = scan.next();
//		Converted the s string to an array of chars in order to erase, add & sort much easier. Also replaced '+' with an empty space 
		char[] sToChar = s.replaceAll("\\D", "").toCharArray();
//		Sorting the array so the numbers will be now in the right order, & as mentioned before the '+' has been removed
		Arrays.sort(sToChar);
		
//		A loop getting the final outcome ready, it puts the pluses between the number (except if it is the last char)
		for (int i = 0; i < sToChar.length; i++) {
			if (i < sToChar.length - 1) {
				outcome += sToChar[i];
				outcome += '+';
			} else {
				outcome += sToChar[i];
			}
		}
		System.out.println(outcome);
		scan.close();*/
	}

}