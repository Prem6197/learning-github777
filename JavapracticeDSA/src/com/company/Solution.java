package com.company;


public class Solution {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {226666, 15, 6331, 7456, 78};
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }

     static int even(int arr) {
        int conutt=0;
        int abb=0;
        while (arr>0) {
            arr = arr / 10;
            conutt++;
        }

      return conutt;
    }


}


