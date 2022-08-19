package com.company;

import java.util.Arrays;

public class arrayadd {
    public static void main(String[] args) {
        int[] abc={1,2,3};
        int a=0;
        int[] ad=new int[abc.length*2];
        for(int i=0;i< abc.length;i++) {

            ad[i] = abc[i];

        }
        for(int j= abc.length;j<ad.length;j++){
            ad[j]=abc[a];
            a++;
        }



        System.out.println(Arrays.toString(ad));
    }
}
