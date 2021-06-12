package codeforces;

import java.util.Scanner;

public class BBorze {

	public static void main(String[] args) {

//		String borzeCode;
//		String outputNum = "";
//		String zero = "0";
//		String one = "1";
//		String two = "2";
		Scanner scan = new Scanner(System.in);
// 		Best solution
		System.out.println(scan.next().replace("--", "2").replace("-.", "1").replace(".", "0"));
	}
}
////		my solution
//Scan borzeCode
//		borzeCode = scan.next();
//
////		An iteration to decode the Borze code
//		for (int i = 0; i < borzeCode.length(); i++) {
//
//			if (borzeCode.charAt(i) == '.') {
//				outputNum += zero;
//			} else if (borzeCode.charAt(i) == '-' && borzeCode.charAt(i+1) == '-') {
//				i++;
//				outputNum += two;
//			} else if (borzeCode.charAt(i) == '-' && borzeCode.charAt(i+1) == '.') {
//				i++;
//				outputNum += one;
//			} else {
//				outputNum += zero;
//			}
//		}
//
//		System.out.println(outputNum);
//	}
//
//}