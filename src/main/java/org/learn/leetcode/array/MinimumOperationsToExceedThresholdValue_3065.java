package org.learn.leetcode.array;

public class MinimumOperationsToExceedThresholdValue_3065 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,9};
        int k = 9;
        System.out.println(minOperations(nums, k));
    }

    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k)
                count++;
        }

        return count;
    }
}
