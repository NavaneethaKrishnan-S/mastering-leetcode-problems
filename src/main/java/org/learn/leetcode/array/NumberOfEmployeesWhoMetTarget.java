package org.learn.leetcode.array;

public class NumberOfEmployeesWhoMetTarget {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int goodWorker = 0;
        for(var hour : hours){
            if(hour >= target)
                goodWorker++;
        }

        return goodWorker;
    }
}
