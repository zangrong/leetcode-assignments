/**
 * @ClassName Q3_LongestSubstringWithoutRepeatingCharacters
 */
package rong.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 *@ClassName Q3_LongestSubstringWithoutRepeatingCharacters
 *@Description TODO
 */
public class Q3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        int maxLength = lengthOfLongestSubstring("pwwkew");
        System.out.println(maxLength);
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int maxLength = 0;
        int tempLength = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            set.clear();
            tempLength = 0;
            for (int j = i; j < chars.length; j ++){
                char aChar = chars[j];
                if (set.contains(aChar)){
                    break;
                }else{
                    set.add(aChar);
                    tempLength ++;
                }
            }
            if (tempLength > maxLength){
                maxLength = tempLength;
            }
        }
        return maxLength;
    }

}
