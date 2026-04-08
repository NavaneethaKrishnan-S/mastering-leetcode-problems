package org.learn.leetcode.array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        var result = missingNumber(nums);
        System.out.println(result);

    }

    public static int missingNumber(int[] nums) {
        var totalSum = nums.length * (nums.length + 1) / 2;
        var actualSum = 0;

        for(var num : nums){
            actualSum += num;
        }

        return totalSum - actualSum;
    }
}
