package codeforces;

import java.util.Scanner;

public class ASoftDrinking {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

/*		Easier solution
		for(int i=0; i<8; i++)
			a[i] = sc.nextInt();
		
		System.out.println(Math.min(Math.min(a[1]*a[2]/a[6], a[3]*a[4]), a[5]/a[7])/a[0]);
	*/	
//		A variable for the number of friends
		int n = scan.nextInt(); 
//		A variable for the number of bottles
		int k = scan.nextInt(); 
//		A variable for the milliliters of the drink
		int l = scan.nextInt();
//		A variable for the limes
		int c = scan.nextInt();
//		A variable for the slices
		int d = scan.nextInt();
//		A variable for the grams of salt
		int p = scan.nextInt();
//		A variable for the milliliters of each drink
		int nl = scan.nextInt();
//		A variable for the grams of salt
		int np = scan.nextInt();
//		A variable for the total milliliters of the drink
		int totalMill = k * l;
//		A variable for the milliliters per each
		int millEach = totalMill / nl;
//		A variable for the total limes
		int totalSlices = c * d;
//		A variable for the total salts
		int totalSalts = p / np;
//		Getting the min value of toasts for each one can make.
		int toastsEach = Math.min(totalSalts, totalSlices);
		
		toastsEach = Math.min(toastsEach, millEach);
		
		System.out.println(toastsEach/n);
		
		scan.close();
	}

}
