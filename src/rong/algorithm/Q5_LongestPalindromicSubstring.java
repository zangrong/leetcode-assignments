/**
 * @ClassName Q5_LongestPalindromicSubstring
 */
package rong.algorithm;

import java.util.Arrays;

/**
 * @ClassName Q5_LongestPalindromicSubstring
 * @Description TODO
 */
public class Q5_LongestPalindromicSubstring {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s) {
        int maxPalindromeLength = 0;
        char[] maxPalindromeArray = null;
        char[] strArray = s.toCharArray();
        int length = strArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length + 1; j++) {
                char[] subArray = Arrays.copyOfRange(strArray, i, j);
                int subArrayLength = subArray.length;
                if (subArrayLength > maxPalindromeLength && isPalindrome(subArray)) {
                    maxPalindromeLength = subArrayLength;
                    maxPalindromeArray = subArray;
                }
            }
        }
        return new String(maxPalindromeArray);
    }

    public static String longestPalindrome1(String s) {
        int maxPalindromeLength = 0;
        String maxPalindrome = null;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length + 1; j++) {
                String str = s.substring(i, j);
                int strLen = str.length();
                if (strLen > maxPalindromeLength && isPalindrome(str)) {
                    maxPalindromeLength = strLen;
                    maxPalindrome = str;
                }
            }
        }
        return maxPalindrome;
    }

    public static boolean isPalindrome(char[] array) {
        int halfSize = array.length / 2;
        int i = 0;
        int j = array.length - 1;
        for (; i < halfSize; i++, j--) {
            if (array[i] != array[j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        int halfSize = s.length() / 2;
        int i = 0;
        int j = s.length() - 1;
        for (; i < halfSize; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
