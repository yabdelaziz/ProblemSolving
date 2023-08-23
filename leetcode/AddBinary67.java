package leetcode;

public class AddBinary67 {

    public static String addBinary(String a, String b) {

//        0 + 0 = 0
//        0 + 1 = 1
//        1 + 0 = 1
//        1 + 1 = 0 carry 1 (2)
//        1 + 1 + 1 = 1 carry 1 (3)

//        int carry = 0, temp1 = 0, temp2 = 0, totalTemps = 0, number1 = Integer.parseInt(a), number2 = Integer.parseInt(b), length = Math.max(a.length(), b.length());
//        String sum = "";
//
//        for (int i = 0; i < length+1; i++) {
//            temp1 = number1 % 10;
//            temp2 = number2 % 10;
//            totalTemps = temp1 + temp2 + carry;
//            number1 = number1 / 10;
//            number2 = number2 / 10;
//
//            if (totalTemps == 0) {
//                sum = "0" + sum;
//                carry = 0;
//            }
//            else if (totalTemps == 1) {
//                sum = "1" + sum;
//                carry = 0;
//            }
//            else if (totalTemps == 2) {
//                sum = "0" + sum;
//                carry = 1;
//            }
//            else if (totalTemps == 3) {
//                sum = "1" + sum;
//                carry = 1;
//            }
//            else {
//                break;
//            }
//        }
//
//        return sum.charAt(0) == '0' && sum.length() > 1 ? sum.substring(1) : sum;

        int carry = 0, temp1 = 0, temp2 = 0, totalTemps = 0, length = Math.max(a.length(), b.length());
        String sum = "";
        int aLength = a.length(), bLength = b.length();

        for (int i = length; i >= 0; i--) {
            aLength--;
            bLength--;

            temp1 = aLength >= 0 ? Integer.parseInt(a.substring(aLength, aLength+1)) : 0;
            temp2 = bLength >= 0 ? Integer.parseInt(b.substring(bLength, bLength+1)) : 0;
            totalTemps = temp1 + temp2 + carry;

            if (totalTemps == 0) {
                sum = "0" + sum;
                carry = 0;
            }
            else if (totalTemps == 1) {
                sum = "1" + sum;
                carry = 0;
            }
            else if (totalTemps == 2) {
                sum = "0" + sum;
                carry = 1;
            }
            else if (totalTemps == 3) {
                sum = "1" + sum;
                carry = 1;
            }
            else {
                break;
            }
        }

        return sum.charAt(0) == '0' && sum.length() > 1 ? sum.substring(1) : sum;

    }

    public static void main(String[] args) {

        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
        System.out.println(addBinary("0", "0"));
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("101101", "111101"));
        System.out.println();
    }
}
