package com.company;

import java.util.Scanner;

public class palimdrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
//        System.out.println(sum);
        int rem;
        int sco=0;
        int temp=sum;


       while (sum>0){
           rem=sum%10;
           sco=(sco*10)+rem;
           sum=sum/10;



       }
        if(temp==sco) {
            System.out.println("this is palindrome");
        }
        else
            System.out.println("no its not palindrome");

//        System.out.println(temp);

//        System.out.println(sum);

    }
}
