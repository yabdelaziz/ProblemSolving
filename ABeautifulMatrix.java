package codeforces;

import java.util.Scanner;

public class ABeautifulMatrix {
	
public static void main(String[] args) {
	

//	Variable with a value of 1, will be used to find the 1 element
	int one = 1;
//	Variable for the i element in array[i][j]
	int locationI=0;
//	Variable for the j element in array[i][j]
	int locationJ=0;
//	Variable for the j element in array[i][j]
	int moves;
//	Variable for the center of the array
	int beautiful=2;
	
	int[][] array = new int[5][5];

	Scanner scan = new Scanner(System.in);
	
//	A loop to get the data from the user
	for(int i = 0; i <= 4 ;i++){
		for (int j = 0; j <= 4; j++) {
			array[i][j] = scan.nextInt();
			if (array[i][j] == one) {	//Condition to get the location of 1
				locationI = i;
				locationJ = j;
			}
			}
		}
	
//	Calculating the moves
		moves = Math.abs(beautiful-locationI)+Math.abs(beautiful-locationJ);
		
	System.out.println(moves);

}

}