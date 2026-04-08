package org.learn.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        var result = thirdMax(nums);
        System.out.println(result);
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(var num : nums){
            set.add(num);
        }

        var largest = Integer.MIN_VALUE;
        var secondLargest = Integer.MIN_VALUE;
        var thirdLargest = Integer.MIN_VALUE;

        for(var num : set){
            if(num > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if(num > thirdLargest){
                thirdLargest = num;
            }
        }

        if (set.size() < 3) {
            return largest;
        }

        return thirdLargest;
    }
}
