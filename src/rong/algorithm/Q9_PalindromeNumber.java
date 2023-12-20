/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q9_PalindromeNumber
 * @Author Administrator
 */
package rong.algorithm;

/**
 *@ClassName Q9_PalindromeNumber
 *@Author Administrator
 *@Date 2023/12/20 16:40
 *@Description TODO
 */
public class Q9_PalindromeNumber {

    public static void main(String[] args) {
        Q9_PalindromeNumber instance = new Q9_PalindromeNumber();
        System.out.println(instance.isPalindrome(-1211));

    }

    public boolean isPalindrome(int x) {
        char[] charArray = (x + "").toCharArray();
        int length = charArray.length;
        if (length == 1){
            return true;
        }
        for (int i = 0; i< length /2; i++) {
            if (charArray[i] != charArray[length-i-1]){
                return false;
            }
        }
        return true;
    }

}
