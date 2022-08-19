package com.company;


    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



    class Result {

        /*
         * Complete the 'findHiddenCode' function below.
         *
         * The function accepts STRING text as parameter.
         */

        public static void findHiddenCode(String text) {
            int stringlen=text.length();
            StringBuilder sb=new StringBuilder(text);
            StringBuilder sa=new StringBuilder();
            if(stringlen%2==0){
                for(int i=1;i<=stringlen;i++){
                    if(stringlen%i==0){

                        sa.append( sb.charAt(i));
                    }
                }
                System.out.print(sa);

            }
            else
            {
                System.out.print("Invalid input");
            }
        }


    }



