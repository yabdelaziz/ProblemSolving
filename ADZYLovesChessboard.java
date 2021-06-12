package codeforces;

import java.util.Scanner;

public class ADZYLovesChessboard {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(), m = scan.nextInt();

		String[][] chess = new String[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j += 2) {
				if (i % 2 == 0) {
					chess[i][j] = "W";
					if (j + 1 <= m - 1) {
						chess[i][j + 1] = "B";
					} else {
						continue;
					}
				} else {
					chess[i][j] = "B";
					if (j + 1 <= m - 1) {
						chess[i][j + 1] = "W";
					} else {
						continue;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			String temp = scan.next();
			for (int j = 0; j < temp.length(); j++) {
				if (temp.substring(j, j+1).equals("-")) {
					chess[i][j] = "-";	
				} else {
					continue;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(chess[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}
}
