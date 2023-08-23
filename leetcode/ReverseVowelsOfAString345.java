package leetcode;

import java.util.*;

public class ReverseVowelsOfAString345 {

    public static String reverseVowels(String s) {
        Set<String> vowels = new HashSet<>();
        int rightLockedIndex = s.length() - 1;
        String[] reversedVowels = new String[s.length()];

        vowels.add("a");
        vowels.add("A");
        vowels.add("e");
        vowels.add("E");
        vowels.add("i");
        vowels.add("I");
        vowels.add("o");
        vowels.add("O");
        vowels.add("u");
        vowels.add("U");

        for (int i = 0; i < s.length(); i++) {

            if (s.length() == 1)
                return s;

            else if (!vowels.contains(s.substring(i, i + 1))) {
                reversedVowels[i] = s.substring(i, i + 1);
            } else {
                for (int j = rightLockedIndex; j >= i; j--) {
                    if (j == i) {
                        reversedVowels[i] = s.substring(i, i+1);
                        break;
                    }

                    else if (vowels.contains(s.substring(j, j + 1))) {
                        reversedVowels[j] = s.substring(i, i + 1);
                        reversedVowels[i] = s.substring(j, j + 1);
                        rightLockedIndex = j-1;
                        break;
                    }

                    continue;
                }
            }
        }
        StringBuffer sb = new StringBuffer();

        for (String vowel : reversedVowels) {
            sb.append(vowel);
        }

        return s = sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode")); // done
        System.out.println(reverseVowels("leetcodE"));
        System.out.println(reverseVowels("hello")); // done
        System.out.println(reverseVowels("b")); // done
        System.out.println(reverseVowels("bd")); // done
        System.out.println(reverseVowels("a")); // done
        System.out.println(reverseVowels("ae")); // done
        System.out.println(reverseVowels("ab"));
        System.out.println(reverseVowels("ba"));
        System.out.println(reverseVowels("eba")); // done
        System.out.println(reverseVowels("abe")); // done
        System.out.println(reverseVowels("aie"));
    }
}
