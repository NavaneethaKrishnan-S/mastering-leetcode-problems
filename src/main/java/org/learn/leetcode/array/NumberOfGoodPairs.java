package org.learn.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
    }

    // [1,2,3,1,1,3]
    // {(0, 1), (1, 2), (2, 3), (3, 1)}
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            map.put(i, nums[i]);
        }

        for(var entry : map.entrySet()){

        }
        return -1;
    }
}
