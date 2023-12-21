/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@ClassName Q12_IntegertoRoman
 *@Author Administrator
 *@Date 2023/12/21 11:26
 *@Description TODO
 */
public class Q12_IntegertoRoman {

    public static void main(String[] args) {
        Q12_IntegertoRoman instance = new Q12_IntegertoRoman();
        System.out.println(instance.intToRoman(1994));
    }

    public String intToRoman(int num) {
        String romanI = "I";
        String romanV = "V";
        String romanX = "X";
        String romanL = "L";
        String romanC = "C";
        String romanD = "D";
        String romanM = "M";
        List<String> result = new ArrayList<>();
        int pos = 1;
        while (num > 0){
            int current = num % 10;
            num /= 10;
            switch (pos){
                case 1 ->{
                    result.add(judge(current, romanI, romanV, romanX));
                }
                case 2 ->{
                    result.add(judge(current, romanX, romanL, romanC));
                }
                case 3 ->{
                    result.add(judge(current, romanC, romanD, romanM));
                }
                case 4 ->{
                    result.add(judge(current, romanM, null, null));
                }
            }
            pos++;
        }
        Collections.reverse(result);
        return result.stream().collect(Collectors.joining());
    }

    private String judge(int current, String one, String five, String ten) {
        if (current < 4){
            return one.repeat(current);
        }else if (current == 4){
            return one + five;
        }else if (current == 5){
            return five;
        }else if(current == 9){
            return one + ten;
        }else{
            return five + one.repeat(current - 5);
        }
    }

}
