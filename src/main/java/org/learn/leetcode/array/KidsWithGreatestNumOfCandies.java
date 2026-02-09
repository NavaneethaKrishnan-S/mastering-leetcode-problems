package org.learn.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumOfCandies {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;

        for(var candy : candies){
            if(candy > greatest) {
                greatest = candy;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for(var candy : candies){
            result.add(candy + extraCandies >= greatest);
        }

        return result;
    }
}
