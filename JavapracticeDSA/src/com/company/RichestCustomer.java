package com.company;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts={
            {1,2,3},{2,6,8},{8,9}
        };

        int exc=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
               if(exc<sum){
                   exc=sum;
               }
            }

        }
        System.out.println(exc);
    }
}
