package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class APuzzles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(), m = scan.nextInt(), difference = 1000;

		int[] nums = new int[m];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		Arrays.sort(nums);

		for (int i = 0; i <= nums.length - n; i++) {
			int result = Math.abs(nums[i] - nums[i + n - 1]);
			difference = Math.min(result, difference);
		}
		System.out.println(difference);
		scan.close();
	}

}
