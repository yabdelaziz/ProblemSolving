package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger13 {

    public static int romanToInt(String s) {

        Map<String, Integer> numbersRomanGuide = new LinkedHashMap<>();

        int romanLettersConvertedToInt = 0;

        numbersRomanGuide.put("CM", 900);
        numbersRomanGuide.put("CD", 400);
        numbersRomanGuide.put("XC", 90);
        numbersRomanGuide.put("XL", 40);
        numbersRomanGuide.put("IX", 9);
        numbersRomanGuide.put("IV", 4);
        numbersRomanGuide.put("M", 1000);
        numbersRomanGuide.put("D", 500);
        numbersRomanGuide.put("C", 100);
        numbersRomanGuide.put("L", 50);
        numbersRomanGuide.put("X", 10);
        numbersRomanGuide.put("V", 5);
        numbersRomanGuide.put("I", 1);


        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-2) {
                String temp = s.substring(i, i+2);

                if (numbersRomanGuide.containsKey(temp)){
                    romanLettersConvertedToInt += numbersRomanGuide.get(temp).intValue();

                    i++;

                    continue;

                } else {
                    romanLettersConvertedToInt += numbersRomanGuide.get(s.substring(i, i+1)).intValue();
                    continue;
                }

            } else if (i == s.length()-2) {
                    String temp = s.substring(i, i + 2);

                    if (numbersRomanGuide.containsKey(temp)) {
                        romanLettersConvertedToInt += numbersRomanGuide.get(temp).intValue();
                        break;
                    } else {
                        romanLettersConvertedToInt += numbersRomanGuide.get(s.substring(i, i + 1)).intValue() + numbersRomanGuide.get(s.substring(i + 1)).intValue();
                        break;
                    }
                } else {
                    romanLettersConvertedToInt += numbersRomanGuide.get(s.substring(i)).intValue();
                }

        }


        return romanLettersConvertedToInt;
    }

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));

        System.out.println(romanToInt("LVIII"));

        System.out.println(romanToInt("MCMXCIV"));

        System.out.println(romanToInt("MDCXCV"));

//        1000 + 500 + 100 + 90 + 5

    }
}
