package org.learn.leetcode.array;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        var result = containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        /*
        *  0 1 2 3
        * [1,0,1,1]
        *  i
        * {1=0, }
        *
        * */
        HashMap<Integer, Integer> map = new HashMap<>();
        var index = 0;
        var isPresent = false;

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                index = map.get(nums[i]);
                if(Math.abs(index - i) <= k) {
                    isPresent = true;
                    break;
                }
                else
                    map.put(nums[i], i);
            }
            else{
                map.put(nums[i], i);
            }
        }

        System.out.println(map);

        return isPresent;
    }
}
