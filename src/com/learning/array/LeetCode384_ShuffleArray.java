package com.learning.array;

import java.util.Arrays;
import java.util.Random;

public class LeetCode384_ShuffleArray {
    public static void main(String[] args) {
        //Solution solution = new Solution(new int[]{1, 2});
        LeetCode384_ShuffleArray solution = new LeetCode384_ShuffleArray(new int[]{1, 2, 3, 4});
        solution.shuffle();
        System.out.println(Arrays.toString(solution.nums));
        solution.reset();
        System.out.println(Arrays.toString(solution.nums));
    }

    private int[] nums;
    private final int[] numsCopy;
    private Random random;

    public LeetCode384_ShuffleArray(int[] nums) {
        this.nums = nums;
        numsCopy = Arrays.copyOf(nums, nums.length);
        this.random = new Random();
    }

    public int[] reset() {
        nums = Arrays.copyOf(numsCopy, numsCopy.length);
        return nums;
    }

    public int[] shuffle() {
        for (int i = 0; i < nums.length; ++i) {
            swap(i, i + random.nextInt(nums.length - i));
        }
        return nums;
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}