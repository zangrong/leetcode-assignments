/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q26_RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        Q26_RemoveDuplicatesfromSortedArray instance = new Q26_RemoveDuplicatesfromSortedArray();

        System.out.println(instance.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
//        System.out.println(instance.removeDuplicates(new int[]{1,1,2}));
    }

    public int removeDuplicates(int[] nums) {
        int last = nums[0];
        int removeCount = 0;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num == last){
                removeCount++;
            }else{
                last = num;
                nums[i -removeCount]=last;
            }
        }
        return nums.length - removeCount;
    }
}


