package org.learn.leetcode.array;

public class RangeSumQueryImmutable {
    int[] nums;

    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        var sum = 0;

        while(left <= right){
            sum += nums[left];
            left++;
        }

        return sum;
    }
}

class Main{
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        var ans = new RangeSumQueryImmutable(nums);

        var result = ans.sumRange(2, 5);
        System.out.println(result);
    }
}
