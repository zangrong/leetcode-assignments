/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q11_ContainerWithMostWater
 * @Author Administrator
 */
package rong.algorithm;

/**
 *@ClassName Q11_ContainerWithMostWater
 *@Author Administrator
 *@Date 2023/12/21 9:25
 *@Description TODO
 */
public class Q11_ContainerWithMostWater {

    public static void main(String[] args) {
        Q11_ContainerWithMostWater instance = new Q11_ContainerWithMostWater();
        System.out.println(instance.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length -1;

        while (i < j){
            int current = Integer.min(height[i], height[j]) * (j-i);
            max = Integer.max(max, current);

            if (height[i] < height[j]){
                i ++;
            }else{
                j --;
            }
        }
        return max;
    }

}
