package org.learn.leetcode.array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args){
        int[] arr1 = {9,8,9};
        System.out.println(Arrays.toString(plusOne(arr1)));
    }

    public static int[] plusOne(int[] digits) {
        int sum = 0;
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;

            if(carry == 0)
                return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
