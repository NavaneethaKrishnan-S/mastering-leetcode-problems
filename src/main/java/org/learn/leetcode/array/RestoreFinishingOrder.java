package org.learn.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RestoreFinishingOrder {
    public static void main(String[] args) {
        int[] order = {3,1,2,5,4};
        int[] friends = {1,3,4};
        System.out.println(Arrays.toString(recoverOrder(order, friends)));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {

        int[] result = new int[friends.length];
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for(var friend : friends){
            map.put(friend, 1);
        }

        for(var ord : order){
            if(map.containsKey(ord)){
                result[index++] = ord;
            }
        }

        return result;
    }
}
