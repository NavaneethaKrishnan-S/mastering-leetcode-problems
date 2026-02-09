package org.learn.leetcode.array;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr1 = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr1, 3)));
    }

    // nums = [1,2,3,4,4,3,2,1], n = 4
    //         i       j
    // resu = [1,4,]
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        int j = n;
        int first = 0;
        int second = 1;

        for(int i = 0; i < n; i++){
            result[first] = nums[i];
            result[second] = nums[j];
            j++;
            first += 2;
            second += 2;
        }

        return result;
    }
}
