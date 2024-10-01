package com.learning.stacksandqueue;

public class LeetCodde1381_IncrementalStack {

    class CustomStack {
        int capacity;
        int size;
        int[] data;

        public CustomStack(int maxSize) {
            this.capacity = maxSize;
            data = new int[capacity];
            size = 0;
        }

        public void push(int x) {
            if (size + 1 <= capacity) data[size++] = x;
        }

        public int pop() {
            if (size - 1 >= 0) return data[--size];
            else return -1;
        }

        public void increment(int k, int val) {
            for (int i = 0; i < Math.min(k ,capacity); i++) {
                data[i] += val;
            }
        }
    }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
}
