package org.learn.leetcode.array;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = 0; j <= i; j++){
                sum = sum + nums[j];
            }
            ans[i] = sum;
        }

        return ans;
    }
}
