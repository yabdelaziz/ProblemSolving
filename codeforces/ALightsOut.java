package codeforces;

import java.util.Scanner;

public class ALightsOut {

	public int callNum(int lights) {
		if (lights == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] lights = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		ALightsOut a = new ALightsOut();

		for (int i = 0; i < lights.length; i++) {
			for (int j = 0; j < lights.length; j++) {

				int input = scan.nextInt();

				if (input % 2 == 0) {
					continue;
				} else {

					if (i == 0) {
						if (j == 0) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j + 1] = a.callNum(lights[i][j + 1]);
							lights[i + 1][j] = a.callNum(lights[i + 1][j]);
						}

						if (j == 1) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j + 1] = a.callNum(lights[i][j + 1]);
							lights[i][j - 1] = a.callNum(lights[i][j - 1]);
							lights[i + 1][j] = a.callNum(lights[i + 1][j]);
						}

						if (j == 2) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j - 1] = a.callNum(lights[i][j - 1]);
							lights[i + 1][j] = a.callNum(lights[i + 1][j]);
						}
					}

					if (i == 1) {
						if (j == 0) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j + 1] = a.callNum(lights[i][j + 1]);
							lights[i - 1][j] = a.callNum(lights[i - 1][j]);
							lights[i + 1][j] = a.callNum(lights[i + 1][j]);
						}

						if (j == 1) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j + 1] = a.callNum(lights[i][j + 1]);
							lights[i][j - 1] = a.callNum(lights[i][j - 1]);
							lights[i + 1][j] = a.callNum(lights[i + 1][j]);
							lights[i - 1][j] = a.callNum(lights[i - 1][j]);
						}

						if (j == 2) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j - 1] = a.callNum(lights[i][j - 1]);
							lights[i + 1][j] = a.callNum(lights[i + 1][j]);
							lights[i - 1][j] = a.callNum(lights[i - 1][j]);
						}
					}

					if (i == 2) {
						if (j == 0) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j + 1] = a.callNum(lights[i][j + 1]);
							lights[i - 1][j] = a.callNum(lights[i - 1][j]);
						}

						if (j == 1) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j + 1] = a.callNum(lights[i][j + 1]);
							lights[i][j - 1] = a.callNum(lights[i][j - 1]);
							lights[i - 1][j] = a.callNum(lights[i - 1][j]);
						}

						if (j == 2) {
							lights[i][j] = a.callNum(lights[i][j]);
							lights[i][j - 1] = a.callNum(lights[i][j - 1]);
							lights[i - 1][j] = a.callNum(lights[i - 1][j]);
						}
					}
				}
			}
		}

	for (int i = 0; i < lights.length; i++) {
		for (int j = 0; j < lights[i].length; j++) {
			System.out.print(lights[i][j]);
		}
		System.out.println();
	}
	scan.close();
}
}