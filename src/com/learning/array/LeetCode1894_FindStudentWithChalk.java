package com.learning.array;
public class LeetCode1894_FindStudentWithChalk {
    public static void main(String[] args) {
        LeetCode1894_FindStudentWithChalk solution = new LeetCode1894_FindStudentWithChalk();
        //System.out.println(solution.chalkReplacer(new int[]{5, 1, 5}, 22));
        System.out.println(solution.chalkReplacer(new int[]{3,4,1,2}, 25));
    }
    public int chalkReplacer(int[] chalk, int k) {
        long prefixSum = 0;
        for (int x : chalk) {
            prefixSum += x;
        }
        long batch = k%prefixSum;
        if(batch==0) return (int) batch;
        else {
            int index=0;
            while (batch>=chalk[index]){
                batch=batch-chalk[index++];
            }
            return index;
        }
    }
}
