package org.learn.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(containsDuplicate(arr1));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var number : nums){
            if(map.containsKey(number)){
                return true;
            }
            map.put(number, 1);
        }
        return true;
    }
}