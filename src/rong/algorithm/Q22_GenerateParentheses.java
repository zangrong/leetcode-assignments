/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName Q22_GenerateParentheses
 * @Author Administrator
 * @Date 2023/12/21 11:26
 * @Description TODO
 */
public class Q22_GenerateParentheses {

    public static void main(String[] args) {
        Q22_GenerateParentheses instance = new Q22_GenerateParentheses();
        System.out.println(instance.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < n; i++) {

        }

        return result.stream().toList();
    }
}


