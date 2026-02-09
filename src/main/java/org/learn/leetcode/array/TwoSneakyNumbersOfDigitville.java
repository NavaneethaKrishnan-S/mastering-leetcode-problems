package org.learn.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSneakyNumbersOfDigitville {
    public static void main(String[] args){
        int[] arr = {0,1,1,0};
        var result = getSneakyNumbers(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] resultArr = new int[2];

        for(int number : nums){
            if(map.containsKey(number)){
                map.put(number, (map.get(number) + 1));
            }else{
                map.put(number, 1);
            }
        }

        int i = 0;
        for(var item : map.entrySet()){
            if(item.getValue() == 2){
                resultArr[i] = item.getKey();
                i++;
            }
        }

        return resultArr;
    }
}
