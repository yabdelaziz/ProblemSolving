package LeetCode;

import java.util.*;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> values = entry.getValue();

            temp = target - key;

            if (map.containsKey(temp)) {
                if (key == temp && values.size() > 1) {
                    result[0] = values.get(0);
                    result[1] = values.get(1);

                    return result;
                }

                else if (key == temp && values.size() <= 1) {
                    continue;
                }
                else {
                    result[0] = map.get(temp).get(0);
                    result[1] = values.get(0);

                    return result;
                }
            }

            continue;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}
