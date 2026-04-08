package org.learn.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        var result = summaryRanges(nums);
        System.out.println(result);
    }

    public static List<String> summaryRanges(int[] nums) {
        /*
        *
        *
        *  0 1 2 3 4 5 6
        * [0,2,3,4,6,8,9] length = 7
        *  i j
        *
        * []
        * */

        List<String> rangeList = new ArrayList<>();

        if(nums.length == 0) return rangeList;

        int i = 0;
        int j = 1;
        int count = 1;

        while(j < nums.length){
            if(nums[i] + count != nums[j]){
                if(j - 1 == i)
                    rangeList.add(String.valueOf(nums[i]));
                else
                    rangeList.add(nums[i] + "->" + nums[j - 1]);
                i = j;
                j++;
                count = 1;
            } else{
                j++;
                count++;
            }
        }

        if(i == j - 1){
            rangeList.add(String.valueOf(nums[i]));
        }else{
            rangeList.add(nums[i] + "->" + nums[j - 1]);
        }

        return rangeList;
    }

}
