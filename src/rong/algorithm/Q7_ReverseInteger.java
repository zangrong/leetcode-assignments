package rong.algorithm;

import java.util.Arrays;
import java.util.List;

public class Q7_ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        String xStr = "" + x;
        StringBuffer sb = new StringBuffer();
        if (xStr.startsWith("-")){
            sb.append("-");
            xStr = xStr.substring(1);
        }

        char[] charArray = xStr.toCharArray();
        for (int i=charArray.length - 1;i>=0;i--){
            sb.append(charArray[i]);

        }
        try{
            return Integer.parseInt(sb.toString());
        }catch (Exception e){
            return 0;
        }
    }

}
