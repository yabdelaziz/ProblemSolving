package codeforces;

import java.util.Scanner;

public class ALittleElephantandRozdil {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean check = false;

		int numCities = scan.nextInt();

		int minCity = scan.nextInt();
		int location = 1;

		for (int i = 2; i <= numCities; i++) {
			int temp = scan.nextInt();

			if (temp < minCity) {
				location = i;
				check = false;
			} else if (minCity == temp) {
				check = true;
			}

			minCity = Math.min(minCity, temp);
		}

		if (check == false) {
			System.out.println(location);
		} else {
			System.out.println("Still Rozdil");
		}

		scan.close();
	}

}
