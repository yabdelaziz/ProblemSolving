package CodeForces;

import java.util.Scanner;

public class ASystemofEquations {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(), m = scan.nextInt(), count = 0;
		
		for (int a = 0; a <= Math.min(n, m) ; a++) {
			for (int b = 0; b <= Math.min(n, m); b++) {
				if (a*a+b == n && a+b*b == m) {
					count++;
				} else {
					continue;
				}
			}
		}
		
		System.out.println(count);
		scan.close();
		
	}

}
