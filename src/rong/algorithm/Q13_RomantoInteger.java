/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q12_IntegertoRoman
 * @Author Administrator
 */
package rong.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@ClassName Q12_IntegertoRoman
 *@Author Administrator
 *@Date 2023/12/21 11:26
 *@Description TODO
 */
public class Q13_RomantoInteger {

    public static void main(String[] args) {
        Q13_RomantoInteger instance = new Q13_RomantoInteger();
//        System.out.println(instance.romanToInt("V"));
//        System.out.println(instance.romanToInt("MCMXCIV"));
        System.out.println(instance.romanToInt("MMCCCXCIX"));
    }

    public int romanToInt(String s) {
        String[][] mark = new String[][]{{"","M","MM","MMM"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","I","II","III","IV","V","VI","VII","VIII","IX"}};

        String[] romans = new String[]{"","","",""};
        int[] intArr = new int[]{0,0,0,0};
        // slice
        for (int i = 3; i >= 0; i--) {
            for (int j = mark[i].length - 1;j>=0;j--){
                String temp = mark[i][j];
                if (s.endsWith(temp) && temp.length()>romans[i].length()){
                    romans[i] = temp;
                    intArr[i]=j;
                }
            }
            s = s.substring(0, s.length()-romans[i].length());
        }
//        System.out.println(Arrays.toString(romans));
//        System.out.println(Arrays.toString(intArr));
        return intArr[0]*1000 + intArr[1]*100 + intArr[2]*10 + intArr[3];
    }

}
