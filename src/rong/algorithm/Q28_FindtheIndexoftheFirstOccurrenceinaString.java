/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;


/**
 * @ClassName Q28_FindtheIndexoftheFirstOccurrenceinaString
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q28_FindtheIndexoftheFirstOccurrenceinaString {

    public static void main(String[] args) {
        Q28_FindtheIndexoftheFirstOccurrenceinaString instance = new Q28_FindtheIndexoftheFirstOccurrenceinaString();

        System.out.println(instance.strStr("sadbutsad", "sad"));
    }

    public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        for (int i = 0; i < lenH - lenN + 1; i++) {
            boolean matched = true;
            for (int j = 0; j < lenN; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    matched = false;
                    break;
                }
            }
            if (matched){
                return i;
            }
        }
        return -1;
    }
}


