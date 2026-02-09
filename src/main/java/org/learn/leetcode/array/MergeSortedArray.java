package org.learn.leetcode.array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,0,0,0};
        int[] arr2 = {1,2,3};

        merge(arr1, 3, arr2, 3);

        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        // [4,5,6,0,0,0]   [1,2,3]
        // []
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }

    }
}
