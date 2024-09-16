package com.learning.array;

import java.util.ArrayList;
import java.util.List;

public class KLengthApart {

    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1) indices.add(i);
        }
        System.out.println(indices);
        for (int i = 1 ; i < indices.size(); i++) {
            System.out.println(indices.get(i)-indices.get(i-1)-1);
            if(indices.get(i)-indices.get(i-1)-1<k) return false;
        }
        return true;
    }
}
