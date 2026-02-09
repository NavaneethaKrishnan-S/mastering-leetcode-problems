package org.learn.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {1, 3, 7, 9, 2};
        int target = 8;
        int[] result = twoSums(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSums(int[] nums, int target){
        HashMap<Integer, Integer> numberToFindMap = new HashMap<>();

        for(int p1 = 0; p1 < nums.length; p1++){

            if(numberToFindMap.containsKey(nums[p1])){
                return new int[] {numberToFindMap.get(nums[p1]), p1};
            }

            int numberToFind = target - nums[p1];
            numberToFindMap.put(numberToFind, p1);
        }

        return null; // or throw an exception if no solution is found
    }
}
