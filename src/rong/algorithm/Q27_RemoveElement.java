/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;


/**
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q27_RemoveElement {

    public static void main(String[] args) {
        Q27_RemoveElement instance = new Q27_RemoveElement();

//        System.out.println(instance.removeElement(new int[]{0,0,1,1,1,2,2,3,3,4}, 3));
        System.out.println(instance.removeElement(new int[]{3,2,2,3}, 3));
    }

    public int removeElement(int[] nums, int val) {
        int removeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == val){
                removeCount++;
            }else{
                nums[i -removeCount]=num;
            }
        }
        return nums.length - removeCount;
    }
}


