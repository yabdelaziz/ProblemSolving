
package CodeForces;

import java.util.Scanner;

public class ASupercentralPoint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int superCentralcount = 0;
		int n = scan.nextInt();
		int[][] points = new int[n][2];
		int right = 0, left = 0, up = 0, down = 0;
		int x = 0, y = 0, x1 = 0, y1 = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			right = 0;
			left = 0;
			up = 0;
			down = 0;

			x = points[i][0];
			y = points[i][1];

			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				else {
					x1 = points[j][0];
					y1 = points[j][1];

					if (x1 > x && y1 == y)
						right++;
					if (x1 < x && y1 == y)
						left++;
					if (x1 == x && y1 < y)
						down++;
					if (x1 == x && y1 > y)
						up++;
				}

			}
			if (right > 0 && left > 0 && up > 0 && down > 0)
				superCentralcount++;
		}
		System.out.println(superCentralcount);
		scan.close();
	}
}