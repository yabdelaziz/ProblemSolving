package codeforces;

import java.util.Scanner;

public class BPresentfromLena {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String present = "";
		
		int n = scan.nextInt(), numbers =  0, spaces = n, size = n*2+1;
		boolean check = false;
		
		for (int i = 0; i < size ; i++) {
			if (i > n) {
				check = true;
			}
			for (int j = 0; j < size; j++) {
				if (spaces != 0) {
					present += " ";
					spaces--;
				} else {
					if (check == false) {
						present += numbers;
						++numbers;
						if (j >= numbers) {
							continue;
						}
						
					}
				}
			}
			System.out.println();
		}

//		int n = scan.nextInt(), size = n * 2 + 1;
//		int numCount = 0, spaceCount = n;
//		String space = " ";
//		boolean check = false;
//
//		for (int i = 0; i < size; i++) {
//			int x = numCount, y = spaceCount;
//			for (int j = 0; j < size; j++) {
//				if (y > 0) {
//					System.out.print(space);
//					y--;
//					check = false;
//				} else {
//					check = true;
//				}
//
//				if (check == true) {
//					if (x == 0) {
//						break;
//					} else if (j < n) {
//						System.out.print(x);
//						x++;
//					} else if (j >= n) {
//						System.out.print(x);
//						x--;
//					}
//				}
//			}
//			numCount++;
//			spaceCount--;
//			System.out.println();
//		}
		scan.close();
	}
}