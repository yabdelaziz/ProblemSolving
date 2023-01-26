package CodeForces;

import java.util.Scanner;

public class ABeautifulYear {
	
	static boolean valid(int year) {
		boolean [] digit = new boolean[10];
		while (year > 0) {
			int x = year % 10;
			year /= 10;
			if (digit[x]) {
				return false;
			}
			digit[x] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int year = scan.nextInt();
			
			for (int i = year + 1; ; i++) {
				if (valid(i)) {
					System.out.println(i);
					break;
				}
			}
			scan.close();
	}
	
}
