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
public class Q17_LetterCombinationsofaPhoneNumber {

    public static void main(String[] args) {
        Q17_LetterCombinationsofaPhoneNumber instance = new Q17_LetterCombinationsofaPhoneNumber();
        System.out.println(instance.letterCombinations("27"));
    }

    public List<String> letterCombinations(String digits) {
        Map<Character, String[]> map = new HashMap<>();
        map.put('2', "abc".split(""));
        map.put('3', "def".split(""));
        map.put('4', "ghi".split(""));
        map.put('5', "jkl".split(""));
        map.put('6', "mno".split(""));
        map.put('7', "pqrs".split(""));
        map.put('8', "tuv".split(""));
        map.put('9', "wxyz".split(""));

        char[] charArray = digits.toCharArray();
        List<String[]> charTable = new ArrayList<>();

        for (char c : charArray) {
            String[] chars = map.get(c);
            charTable.add(chars);
        }

        List<String> result = new ArrayList<>();
        for (String[] chars : charTable) {
            if (result.isEmpty()){
                result = Arrays.asList(chars).stream().toList();
            }else{
                result = result.stream().flatMap(v1 -> Arrays.asList(chars).stream().map(v2->v1+v2)).toList();
            }
        }
        return result;
    }

}
