package com.company;

public class Maxwealth {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,1,8},{1,8,9,6}};

        int min=Integer.MIN_VALUE;
     for(int i=0;i<a.length;i++){
         int sum=0;
         for(int j=0;j<a[i].length;j++){
             sum += a[i][j];
         }
         if(min<sum){
             min=sum;
//             System.out.println(min);
         }
     }
        System.out.println(min);

    }


}
