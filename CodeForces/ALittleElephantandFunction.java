package CodeForces;

import java.util.Scanner;

public class ALittleElephantandFunction {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int num = 1;
		String result = String.valueOf(n);
		
			while (num <= n-1) {
				
				result += " " + num;
				
				num++;
			}
			
			System.out.println(result);
			scan.close();	
	}

}
