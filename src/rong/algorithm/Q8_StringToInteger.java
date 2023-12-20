/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q8_StringToInteger
 * @Author Administrator
 */
package rong.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@ClassName Q8_StringToInteger
 *@Author Administrator
 *@Date 2023/12/20 15:21
 *@Description TODO
 */
public class Q8_StringToInteger {

    public static void main(String[] args) {
        Q8_StringToInteger instance = new Q8_StringToInteger();
//        System.out.println(instance.myAtoi("-91283472332"));
//        System.out.println(instance.myAtoi("   -42"));
        System.out.println(instance.myAtoi("  0000000000012345678"));

    }

    public int myAtoi(String s) {
        int result = 0;
        if (s == null){
            return result;
        }
        int len = s.length();
        if (len == 0 || len >= 200){
            return result;
        }
        s = s.trim();
        if (s.length() == 0){
            return result;
        }
        boolean negative = false;
        if (s.charAt(0) == '-'){
            negative = true;
            s = s.substring(1);
        }else if (s.charAt(0) == '+'){
            s = s.substring(1);
        }
        boolean init = true;
        List<Character> charList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (init){
                if (c == '0'){
                    continue;
                }else{
                    init = false;
                }
            }
            if (c >= '0' && c <='9'){
                charList.add(c);
            }else{
                break;
            }
        }
        if (charList.isEmpty()){
            return result;
        }else if(charList.size() > 10){
            if (negative){
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }else{
            if (negative){
                charList.add(0, '-');
            }
            long longVal = Long.parseLong(charList.stream().map(v->v + "").collect(Collectors.joining()));
            if (longVal > Integer.MAX_VALUE){
                longVal = Integer.MAX_VALUE;
            }else if (longVal < Integer.MIN_VALUE){
                longVal = Integer.MIN_VALUE;
            }
            result = (int) longVal;
        }
        return result;
    }

}
