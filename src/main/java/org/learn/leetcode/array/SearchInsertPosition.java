package org.learn.leetcode.array;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args){
        int[] arr1 = {1, 3, 5, 6};
        System.out.println(searchInsert(arr1, 5));
    }

    /*
    * [1, 3, 5, 6]
    *
    * */
    public static int searchInsert(int[] nums, int target){

        int index = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            if(target <= nums[i]){
                continue;
            }

            index = i + 1;
            break;
        }

        return index;
    }
}
