/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName TwoSum
 * @Author zangrong
 */
package rong.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *@ClassName TwoSum
 *@Author zangrong
 *@Date 2022/4/15 08:43
 *@Description TODO
 */
public class Q1_TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

}
