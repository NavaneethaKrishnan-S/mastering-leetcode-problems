package org.learn.leetcode.array;

import java.util.Arrays;

public class LeftAndRightSumDifference {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    // [10, 4, 8, 3]
    //      i
    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] answer = new int[nums.length];

        int leftSideSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0)
                leftSum[i] = 0;
            else{
                leftSideSum = leftSideSum + nums[i - 1];
                leftSum[i] = leftSideSum;
            }
        }

        int rightSideSum = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i == nums.length - 1){
                rightSum[i] = 0;
            }else{
                rightSideSum = rightSideSum + nums[i + 1];
                rightSum[i] = rightSideSum;
            }

        }

        for(int i = 0; i < answer.length; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}
