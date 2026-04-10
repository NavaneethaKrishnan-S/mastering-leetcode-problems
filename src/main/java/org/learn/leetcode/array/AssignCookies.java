package org.learn.leetcode.array;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {3};
        var result = findContentChildren(g, s);
        System.out.println(result);
    }


    /*
    *  [1, 2, 3]
    *         c
    *  [1, 3]
    *         co
    * */
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;

        if(g.length == 0 || s.length == 0) {
            return count;
        }

        Arrays.sort(g);
        Arrays.sort(s);


        int cookie = s.length - 1;
        for(int child = g.length - 1; child >=  0; child--){
            if(cookie == -1)
                break;

            if(s[cookie] >= g[child]) {
                count++;
                cookie--;
            }
        }

        return count;
    }
}
