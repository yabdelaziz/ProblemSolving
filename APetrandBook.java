package codeforces;

import java.util.Scanner;

public class APetrandBook {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		A variable for the number of pages in the book
		int book = scan.nextInt();
//		A variable for the days counter
		int counterPapers = 0;
//		An array to store how many pages have been read per day
		int[] days = new int[7];
//		A loop to store the pages that have been read per day
		for (int i = 0; i < days.length; i++) {
			days[i] = scan.nextInt();
		}

//		A counter for the while loop
		int i = 0;
		while (counterPapers < book) {
			counterPapers += days[i];
			if (counterPapers >= book) {
				System.out.println(i + 1);
				break;
			} else if (counterPapers < book && i == 6) {
				i = 0;
			} else if (counterPapers < book) {
				i++;
			}
		}
	}
}
