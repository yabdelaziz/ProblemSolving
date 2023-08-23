package codeforces;

import java.util.Scanner;

public class AYoungPhysicist {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);

//	every N lines contains three integers 
	int n = scan.nextInt();

//	the 3 ints for the body
	int x, y, z;

//	the sum of the 3 ints to see if it's idel or not
	int sumX=0;
	int sumY=0;
	int sumZ=0;

//	A loop that gets x,y,& z & sum every each one of them
	for(int i=0; i<n;i++){
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		sumX += x;
		sumY += y;
		sumZ += z;
	}

//	A condition that says if every sum of x,y, & z is zero then print yes
	if(sumX==0&&sumY==0&&sumZ==0)
	{
		System.out.println("YES");
	}else
	{
		System.out.println("NO");
	}
	scan.close();
}
}