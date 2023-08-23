package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber171 {

    public static int titleToNumber(String columnTitle) {
        Map<String, Integer> letterRank = new HashMap<>();

        letterRank.put("A", 1);
        letterRank.put("B", 2);
        letterRank.put("C", 3);
        letterRank.put("D", 4);
        letterRank.put("E", 5);
        letterRank.put("F", 6);
        letterRank.put("G", 7);
        letterRank.put("H", 8);
        letterRank.put("I", 9);
        letterRank.put("J", 10);
        letterRank.put("K", 11);
        letterRank.put("L", 12);
        letterRank.put("M", 13);
        letterRank.put("N", 14);
        letterRank.put("O", 15);
        letterRank.put("P", 16);
        letterRank.put("Q", 17);
        letterRank.put("R", 18);
        letterRank.put("S", 19);
        letterRank.put("T", 20);
        letterRank.put("U", 21);
        letterRank.put("V", 22);
        letterRank.put("W", 23);
        letterRank.put("X", 24);
        letterRank.put("Y", 25);
        letterRank.put("Z", 26);

        int length = columnTitle.length() - 1;
        int result = 0;

        if (letterRank.containsKey(columnTitle))
            return letterRank.get(columnTitle);
        else {

            for (int i = length, j = 0; i > 0; i--, j++) {
                String number = "";
                number += ((int) Math.pow(26, i)) * letterRank.get(columnTitle.substring(j, j + 1));
                result += Integer.parseInt(number);
            }

            result += letterRank.get(columnTitle.substring(columnTitle.length() - 1));

            return result;
        }


    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("ZZ"));
        System.out.println(titleToNumber("AAA"));
        System.out.println(titleToNumber("ZYA"));
    }
}
