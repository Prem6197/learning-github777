package com.company;

import java.util.Arrays;

public class Lect1Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,7,8,9,10};
//        System.out.println(Arrays.toString(swap(arr)));
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int[] swap(int[] arr) {
        int temp;
        int start = 0;
        temp = 0;
        int end = arr.length - 1;
        for (int i = start; i <= end; i++) {
            temp=arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
            start++;
            end--;

        }
        return arr;
    }
}
