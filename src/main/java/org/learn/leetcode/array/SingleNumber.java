package org.learn.leetcode.array;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        var result = singleNumber(arr);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(var num : nums){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for(var entry : map.entrySet()){
//            if(entry.getValue() == 1){
//                return entry.getKey();
//            }
//        }
//
//        return -1;

        var result = 0;
        for(var num : nums){
            result = result ^ num;
        }

        return result;
    }
}
