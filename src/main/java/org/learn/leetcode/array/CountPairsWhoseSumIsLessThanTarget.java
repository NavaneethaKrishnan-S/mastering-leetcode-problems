package org.learn.leetcode.array;

import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-6,2,5,-2,-7,-1,3);
        int target = -2;
        System.out.println(countPairs(list, target));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for(int left = 0; left < nums.size(); left++){
            for(int right = left + 1; right < nums.size(); right++){
                if(nums.get(left) + nums.get(right) < target)
                    count++;
            }
        }

        return count;
    }
}
