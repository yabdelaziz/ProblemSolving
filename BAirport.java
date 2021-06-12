package codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BAirport {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int passengerNums = scan.nextInt(), planeNum = scan.nextInt(), sumMax = 0, sumMin = 0;

		List<Integer> emptySeats = new ArrayList<Integer>();
		

		for (int i = 0; i < planeNum; i++) {
			emptySeats.add(scan.nextInt());
		} // end of loop

		List<Integer> emptySeats2 = new ArrayList<Integer>(emptySeats);
		
		// calculating minimum
		for (int i = 0, j = 0; j < passengerNums; j++) {
			
			Collections.sort(emptySeats);

			if (emptySeats.indexOf(i) == 0) {
				emptySeats.remove(i);
			}

			if (emptySeats.size() == 0) {
				break;
			}
			sumMin += emptySeats.get(i);
			emptySeats.set(i, emptySeats.get(i) - 1);
		} // end of loop

		// calculating maximum
		for (int i = 0, j = 0; j < passengerNums; j++) {

			Collections.sort(emptySeats2, Collections.reverseOrder());

			if (emptySeats2.indexOf(i) == 0) {
				emptySeats2.remove(i);
			}

			if (emptySeats2.size() == 0) {
				break;
			}
			sumMax += emptySeats2.get(i);
			emptySeats2.set(i, emptySeats2.get(i) - 1);
		} // end of loop

		System.out.println(sumMax + " " + sumMin);
		scan.close();

	}

}
