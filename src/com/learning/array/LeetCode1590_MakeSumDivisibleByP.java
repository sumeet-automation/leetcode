package com.learning.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1590_MakeSumDivisibleByP {

    public int minSubarray(int[] nums, int p) {
        int remReq = 0;
        for (int num : nums) {
            remReq = ((remReq + num) % p);
        }
        if(remReq==0) return 0;
        Map<Integer, Integer> rems = new HashMap<>();
        rems.put(0, -1);
        int ans = nums.length;
        int rem = 0;
        for (int i = 0; i < nums.length; i++) {
            rem = (rem+nums[i])%p;
            int target = (rem - remReq + p) % p;
            if (rems.containsKey(target)) {
                ans = Math.min(ans, i - rems.get(target));
            }
            rems.put(rem, i);
        }
        return ans == nums.length ? -1 : ans;
    }
}
