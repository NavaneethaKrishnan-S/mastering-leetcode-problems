package org.learn.leetcode.array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int[] arr1 = {3,3};
        System.out.println(removeElement(arr1, 3));
    }

    /*
    * [0,1,4,0,3,2,2,2]
    *         i j
    * */
    public static int removeElement(int[] nums, int val){
        if(nums.length == 0)
            return 0;

        int validElementPointer = 0;
        for(int movingPointer = 0; movingPointer < nums.length; movingPointer++){
            if(nums[movingPointer] != val){
                nums[validElementPointer] = nums[movingPointer];
                validElementPointer++;
            }
        }

        return validElementPointer;
    }
}
