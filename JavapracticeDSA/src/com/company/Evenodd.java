package com.company;







public class Evenodd {


    public static void main(String[] args) {






        int[] num={12,345,2,6,3810,45,7000,852369};
        int sumi=0;
        for(int i=0;i<num.length;i++) {
            if(countdigit(num[i])%2==0){
                sumi++;
            }
        }
        System.out.println(sumi);
    }

    static int countdigit(int a) {
//        int temp =a;
        int count = 0;
        while (a > 0) {
            a=a/10  ;
            count++;



        }
        return count;

    }



}
