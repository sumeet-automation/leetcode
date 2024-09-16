package com.learning.bits;

import java.util.Map;

public class LeetCode405_ConvertNumberToHexa {

    public String toHex(int num) {
        if(num==0) return "0";
        long value;
        if(num<0)
            value= (long) Math.pow(2,32)+num;
        else
            value=num;
        Map<Integer, String> map = Map.of(10, "a", 11, "b", 12, "c", 13, "d", 14, "e", 15, "f");
        StringBuilder res = new StringBuilder();
        while (value != 0) {
            int digit = (int) (value - (((int) (value / 16)) * 16));
            if (digit > 9) res.append(map.get(digit));
            else res.append(digit);
            value /= 16;
        }
        return res.reverse().toString();
    }
}
