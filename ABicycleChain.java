package codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABicycleChain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong(), count = 0, maxRatio = 0, temp = 0;

		List<Long> nList = new ArrayList<Long>();

		List<Long> mList = new ArrayList<Long>();

		for (int i = 0; i < n; i++) {
			nList.add(scan.nextLong());
		}

		int m = scan.nextInt();

		for (int i = 0; i < m; i++) {
			mList.add(scan.nextLong());
		}

		Collections.sort(nList);

		for (int i = 0; i < n; i++) {

			if (nList.get(i) == 1) {
				for (int j = m - 1; j >= 0; j--) {
					temp = mList.get(j) / 1;
					if (temp > maxRatio) {
						maxRatio = temp;
						count = 1;
					} else if (temp < maxRatio) {
						continue;
					} else {
						count++;
					}
				} // end of loop
				break;
			} else {
				for (int j = mList.size() - 1; j >= 0; j--) {
					if (mList.get(j) % nList.get(i) == 0) {
						temp = mList.get(j) / nList.get(i);
						if (temp > maxRatio) {
							maxRatio = temp;
							count = 1;
						} else if (temp < maxRatio) {
							continue;
						} else {
							count++;
						}
					} else {
						continue;
					}
				} // end of loop
			}

		}
		System.out.println(count);
		scan.close();
	}
}