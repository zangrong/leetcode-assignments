/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q20_ValidParentheses {

    public static void main(String[] args) {
        Q20_ValidParentheses instance = new Q20_ValidParentheses();
        System.out.println(instance.isValid("]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '[' || c == '{' || c == '('){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }else{
                    Character pop = stack.pop();
                    if ((c == ']' && pop != '[') || (c == '}' && pop != '{') || (c == ')' && pop != '(')){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}


