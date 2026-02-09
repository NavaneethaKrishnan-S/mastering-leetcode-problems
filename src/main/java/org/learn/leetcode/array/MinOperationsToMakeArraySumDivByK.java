package org.learn.leetcode.array;

public class MinOperationsToMakeArraySumDivByK {
    public static void main(String[] args) {
        int[] nums = {3,9,7};
        int k = 5;
        minOperations(nums, k);
    }

    public static int minOperations(int[] nums, int k) {

        int result = 0;
        int sum = getSum(nums);
        if(sum % k == 0)
            return 0;

        int remainder = sum % k;

        for (int num : nums) {
            if (num > remainder) {
                return remainder;
            }
        }

        return remainder;
    }

    private static int getSum(int[] nums) {
        int sum = 0;
        for(var num : nums)
            sum += num;

        return sum;
    }
}
