package leetcode;

public class IsSubsequence392 {

    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0;

        if (s.length() == 0 && t.length() == 0)
            return true;

        if (t.length() == 0)
            return false;

        if (s.length() == 0)
            return true;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sPointer) == t.charAt(i)) {
                sPointer++;
                if (s.length() == sPointer)
                    return true;
            }
        }

        return s.length() == sPointer;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("b", "abc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}
