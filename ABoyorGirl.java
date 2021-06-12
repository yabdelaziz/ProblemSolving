package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class ABoyorGirl {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String user = scan.next();
//		Better solution
		System.out.println(user.chars().distinct().count()%2 == 0?"CHAT WITH HER!": "IGNORE HIM!");
		
//		-------------------
		/*
//		A variable that refers to the repeated chars
		int count = 0;

		char[] user = scan.next().toCharArray();
//		Sorting the array to count the repeated elements easily
		Arrays.sort(user);
//		A loop that counts the repeated chars
		for (int i = 0; i < user.length - 1; i++) {
			if (user[i] == user[i + 1]) {
				count++;
			}
		}
//		Printing the needed result based on the count value
		if ((user.length - count) % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}*/
		scan.close();
	}
}
