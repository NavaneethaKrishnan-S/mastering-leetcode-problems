package org.learn.leetcode.array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {2,2,1,1,1,2,2};
        var result = majorityElement(array);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
//        var map = new HashMap<Integer, Integer>();
//        var times = nums.length / 2;
//
//        for(var num : nums){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for(var entry : map.entrySet()){
//            if(entry.getValue() > times)
//                return entry.getKey();
//        }
//
//        return 0;
        var candidate = 0;
        var count = 0;

        for(var num : nums) {
            if(count == 0){
                candidate = num;
            }

            if(num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }
}
