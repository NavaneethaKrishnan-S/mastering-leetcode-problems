package org.learn.leetcode.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr1));
    }

    // [0,1,2,3,4,2,2,3,3,4]
    //          j         i
    //
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));
        return j + 1;
    }
}
