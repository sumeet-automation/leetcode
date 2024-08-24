package com.learning.maths;

public class LetCode2119_IsSameNumberAfterReversal {

    public static void main(String[] args) {
        System.out.println(new LetCode2119_IsSameNumberAfterReversal()
                .isSameAfterReversals(526));
    }

    public boolean isSameAfterReversals(int num) {
        int rev1 = reverseInteger(num);
        System.out.println(rev1);
        int rev2 = reverseInteger(rev1);
        System.out.println(rev2);
        return num==rev2;
    }

    public int reverseInteger(int num) {
        int res = 0;
        while (num > 0) {
            int div = num % 10;
            res = (res * 10) + div;
            num = num / 10;
        }
        return res;
    }
}
