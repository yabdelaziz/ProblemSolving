package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        answer.add("1");
        answer.add("2");

        if (n == 1)
            return List.of("1");

        if (n == 2)
            return List.of("1", "2");

        for (int i = 2, j = 3; i < n; i++, j++) {
            if (j % 3 == 0 && j % 5 == 0)
                answer.add("FizzBuzz");
            else if (j % 3 == 0)
                answer.add("Fizz");
            else if (j % 5 == 0)
                answer.add("Buzz");
            else
                answer.add(String.valueOf(j));
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(fizzBuzz(1));
        System.out.println(fizzBuzz(2));
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }
}
