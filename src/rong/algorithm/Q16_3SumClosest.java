/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;

import java.util.*;

/**
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q16_3SumClosest {

    public static void main(String[] args) {
        Q16_3SumClosest instance = new Q16_3SumClosest();
//        System.out.println(instance.threeSumClosest(new int[]{-1,2,1,-4}, 1));
//        System.out.println(instance.threeSumClosest(new int[]{0,1,2}, 3));
//        System.out.println(instance.threeSumClosest(new int[]{1,1,1,1}, 0));
        System.out.println(instance.threeSumClosest(new int[]{1,1,1,0}, -100));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = Integer.MAX_VALUE;
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length -1;
            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                int currentShort = 0;
                if ((target <= 0 && currentSum <= 0) || (target >= 0 && currentSum >= 0)){
                    currentShort = Math.abs(Math.abs(target) - Math.abs(currentSum));
                }else if((target <=0 && currentSum >=0) || (target >=0 && currentSum <=0)){
                    currentShort = Math.abs(target) + Math.abs(currentSum);
                }
                if (currentShort == 0){
                    return currentSum;
                }else{
                    if (currentShort < shortest){
                        sum = currentSum;
                        shortest = currentShort;
                    }
                    if (currentSum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return sum;
    }

}
