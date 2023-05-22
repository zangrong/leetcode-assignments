/**
 * Cetian Techs Ltd., Co. 2021
 *
 * @ClassName Q6_ZigzagConversion
 * @Author zangrong
 */
package rong.algorithm;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *@ClassName Q6_ZigzagConversion
 *@Author zangrong
 *@Date 2023/5/21 18:36
 *@Description TODO
 */
public class Q6_ZigzagConversion {

    public static void main(String[] args) {
//        String result = convert("PAYPALISHIRING", 12);
        String result = convert("A", 2);
        System.out.println(result);
    }

    public static String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        // evaluate how many columns are needed
        int numCols = charArray.length - numRows + 1;
        if (numCols <= 0){
            numCols = 1;
        }
        Character[][] targetArray = new Character[numRows][numCols];
        int charIdx = 0;
        // interval
        int mode = 0;
        if (numRows == 1){
            mode = 1;
        }else{
            mode = numRows + (numRows-2);
        }
        // true:from up to down, false:from down to up
        boolean direction = false;
        for (int i=0;i<numCols;i++){
            // charArray is all used
            if (charIdx == charArray.length){
                break;
            }

            if (charIdx % mode == 0){
                // full column
                direction = true;
                for (int j=0;j<numRows;j++){
                    // charArray is all used
                    if (charIdx == charArray.length){
                        break;
                    }
                    targetArray[j][i] = charArray[charIdx++];
                }
            }else if ((charIdx - numRows)%mode == 0){
                // not full column, one column one character
                direction = false;
            }
            if (!direction){
                int row = mode - charIdx%mode;
                targetArray[row][i] = charArray[charIdx++];
            }
        }
        // compose
        StringBuffer sb = new StringBuffer();
        for (Character[] array : targetArray) {
            sb.append(Arrays.stream(array).filter(v->v!=null).map(String::valueOf)
                    .collect(Collectors.joining()));
        }
        return sb.toString();
    }

}
