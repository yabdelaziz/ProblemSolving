package LeetCode;

public class ValidPalindrome125 {

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            continue;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

        System.out.println(isPalindrome("0p"));

        System.out.println(isPalindrome("race a car"));

        System.out.println(isPalindrome(" "));
    }
}
