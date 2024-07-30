package com.learning.array;

public class Leetcode35_SearchInsertPosition {

    public static void main(String[] args) {
        //System.out.println(searchInsert(new int[]{1, 3, 5, 6,8,9,11,56}, 9));
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+s2;
        s3.intern();
        String s4 = "HelloWorld";
        String s5 = "Hello";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1==s5);
        System.out.println(s1.equals(s5));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = nums.length/2;
        boolean found = false;
        while (!found && index>0) {
            if(nums[index]==target){
                return index;
            };
            if(nums[index]<target){
                index/=2;
            }
            if(nums[index]>target){
                index= (nums.length-index)/2;
            }
        }
        return index;
    }
}
