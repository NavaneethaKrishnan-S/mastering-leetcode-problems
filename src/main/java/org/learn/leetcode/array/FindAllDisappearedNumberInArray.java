package org.learn.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDisappearedNumberInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        var result = findDisappearedNumbers(nums);
        System.out.println(result);
    }

    /*
    * [-4,-3,-2,-7,8,2,-3,-1]
    * */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            var index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0)
                nums[index] = -nums[index];
        }

        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                result.add(i + 1);
        }

        return result;
    }
}
