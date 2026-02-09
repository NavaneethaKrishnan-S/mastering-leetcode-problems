package org.learn.leetcode.array;

import java.util.Arrays;

public class FinalArrayStateAfterKMultiOperations {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        int multiplier = 4;
        System.out.println(Arrays.toString(getFinalState(nums, k, multiplier)));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        // 1. Get least number index
        // 2. multiply the number with mulitiplier
        // 3. Do the above operation for k times.

        for(int i = 0; i < k; i++){
            var leastIndex = getLeastNumberIndex(nums);
            nums[leastIndex] = nums[leastIndex] * multiplier;
        }

        return nums;
    }

    private static int getLeastNumberIndex(int[] nums) {
        int minValueIndex = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minValue){
                minValue = nums[i];
                minValueIndex = i;
            }
        }

        return minValueIndex;
    }
}
