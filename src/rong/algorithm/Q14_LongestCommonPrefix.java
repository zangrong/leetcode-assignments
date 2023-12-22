/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;

/**
 *@ClassName Q12_IntegertoRoman
 *@Author Administrator
 *@Date 2023/12/21 11:26
 *@Description TODO
 */
public class Q14_LongestCommonPrefix {

    public static void main(String[] args) {
        Q14_LongestCommonPrefix instance = new Q14_LongestCommonPrefix();
//        System.out.println(instance.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(instance.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        for (String str : strs) {
            minLength = Integer.min(str.length(), minLength);
        }
        String commonPrefix = "";
        for (int i = 0; i < minLength; i++) {
            if (i == minLength){
                break;
            }
            commonPrefix = strs[0].substring(0, i+1);
            for (String str : strs) {
                if (!str.startsWith(commonPrefix)){
                    return commonPrefix.substring(0, commonPrefix.length()-1);
                }
            }
        }
        return commonPrefix;
    }

}
