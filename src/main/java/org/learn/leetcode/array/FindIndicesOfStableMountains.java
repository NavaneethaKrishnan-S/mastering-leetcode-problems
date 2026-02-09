package org.learn.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FindIndicesOfStableMountains {
    public static void main(String[] args) {
        int[] height = {12};
        int threshold = 10;
        System.out.println(stableMountains(height, threshold));
    }

    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < height.length; i++){
            if(height[i - 1] > threshold)
                result.add(i);
        }

        return result;
    }
}
