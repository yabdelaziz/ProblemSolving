package codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ABusinesstrip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt(), count = 0;

		ArrayList<Integer> months = new ArrayList<Integer>();

		for (int i = 0; i < 12; i++) {
			months.add(scan.nextInt());
		}

		Collections.sort(months, Collections.reverseOrder());

		for (int i = 0; i < 12; i++) {
			if (k <= 0) {
				break;
			} else {
				k -= months.get(i);
				count++;
			}
		}

		System.out.println(k > 0 ? -1 : count);
		
		scan.close();
	}

}
