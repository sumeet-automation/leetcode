package com.learning.twopointers;

public class LeetCode165_CompareVersions {

    /*
    Return the following:

If version1 < version2, return -1.
If version1 > version2, return 1.
Otherwise, return 0.

     */
    public int compareVersion(String version1, String version2) {
        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");
        int n1 = version1Arr.length;
        int n2 = version2Arr.length;
        int p1=0, p2=0;
        while (p1 < n1 || p2 < n2) {
            int num1 = (p1 < n1) ? Integer.parseInt(version1Arr[p1++]) : 0;
            int num2 = (p2 < n2) ? Integer.parseInt(version2Arr[p2++]) : 0;
            if (num1 != num2) {
                return (num1 > num2) ? 1 : -1;
            }
        }
        return 0;
    }

    public int compareVersionOptimize(String version1, String version2) {
        int n1=version1.length();
        int n2=version2.length();
        int p1=0,p2=0;
        while(p1<n1 || p2<n2){
            int num1=0;
            while(p1<n1 && version1.charAt(p1)!='.'){
                num1=(num1*10)+(version1.charAt(p1++)-'0');

            }

            int num2=0;
            while(p2<n2 && version2.charAt(p2)!='.'){
                num2=(num2*10)+(version2.charAt(p2++)-'0');

            }

            if(num1!=num2){
                return (num1>num2) ? 1:-1;
            }
            p1++;
            p2++;
        }
        return 0;
    }
}
