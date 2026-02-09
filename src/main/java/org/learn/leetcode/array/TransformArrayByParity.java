package org.learn.leetcode.array;

import java.util.Arrays;

public class TransformArrayByParity {
    public static void main(String[] args){
        int[] arr1 = {4,5,6,0,0,0};
        var result = transformArray(arr1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0)
                nums[i] = 0;
            else
                nums[i] = 1;
        }

        Arrays.sort(nums);

        return nums;
    }

}
