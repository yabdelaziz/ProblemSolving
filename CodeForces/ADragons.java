package CodeForces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ADragons {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int heroStrength = scan.nextInt(), dragonsNum = scan.nextInt();

		String result = "YES";

		int[][] dragons = new int[dragonsNum][2];

		for (int i = 0; i < dragonsNum; i++) {
			for (int j = 0; j < 2; j++) {
				dragons[i][j] = scan.nextInt();
			}
		}

		Arrays.sort(dragons, new Comparator<int[]>() {
			@Override
			public int compare(final int[] entry1, final int[] entry2) {
				if (entry1[0] > entry2[0])
					return 1;
				else
					return -1;
			}
		});

		for (int i = 0; i < dragonsNum; i++) {
			if (heroStrength > dragons[i][0]) {
				heroStrength += dragons[i][1];
			} else {
				result = "NO";
			}
		}

		System.out.println(result);
		scan.close();
	}
}
