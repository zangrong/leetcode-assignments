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
public class Q18_4Sum {

    public static void main(String[] args) {
        Q18_4Sum instance = new Q18_4Sum();
//        System.out.println(instance.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
//        System.out.println(instance.fourSum(new int[]{0,0,0,0}, 0));
//        System.out.println(instance.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
        System.out.println(instance.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length -3; i++) {
            for (int j = i+1; j < nums.length-2; j++) {
                int k = j + 1;
                int l = nums.length-1;
                while (k < l){
                    int sum = nums[i] +nums[j] +nums[k] +nums[l];
                    if (sum == target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }else if (sum < target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return result.stream().toList();
    }

}
