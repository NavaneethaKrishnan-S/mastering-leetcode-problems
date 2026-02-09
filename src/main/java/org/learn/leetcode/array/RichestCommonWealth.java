package org.learn.leetcode.array;

public class RichestCommonWealth {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                        {1, 2, 3}};

        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int max = 0;
        int sum = 0;

        for(int i = 0; i < m; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > max)
                max = sum;
        }

        return max;
    }
}
