package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class AIsyourhorseshoeontheotherhoof {

	public static void main(String[] args) {

//		Using hash is also a solution, because it doesn't duplicate numbers
		
		Scanner scan = new Scanner(System.in);
//		An array of ints to set the shoes' colors
		int[] shoes = new int[4];
//		A variable to count the minimum number of horseshoes the horse needs to buy
		int count = 0;
//		Setting the shoes' colors
		for (int i = 0 ; i < shoes.length ; i++) {
			shoes[i] = scan.nextInt();
		}
//		Sorting the elements of the array in order to count the same elements easier
		Arrays.sort(shoes);
//		Counting the same elements
		for (int i = 0 ; i < shoes.length-1 ; i++) {
			if (shoes[i] == shoes[i+1]) {
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}

}
	