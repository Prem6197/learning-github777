package com.company;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2885, 3},
                {7, 9, 6},
                {18, 11},
        };
        int target = 11;

        int[] ans = search2d(arr, target);
        System.out.println(min(arr));
        System.out.println(Arrays.toString(ans));

    }

    static int min(int[][] arr) {
        int min=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }

    static int[] search2d(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
