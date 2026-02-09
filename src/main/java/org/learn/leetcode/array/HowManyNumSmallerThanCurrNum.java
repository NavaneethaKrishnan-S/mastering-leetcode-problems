package org.learn.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumSmallerThanCurrNum {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(Arrays.toString(smallerNumberThanCurrentUsingHashMap(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count;
        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            count = 0;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    if(nums[i] > nums[j])
                        count++;
                }
            }

            answer[i] = count;
        }

        return answer;
    }

    public static int[] smallerNumberThanCurrentUsingHashMap(int[] nums){
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.putIfAbsent(sorted[i], i);
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }
}
