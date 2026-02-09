package org.learn.leetcode.array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int curValidPos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[curValidPos] = nums[i];
                if(i != curValidPos)
                    nums[i] = 0;
                curValidPos++;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
