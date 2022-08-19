package com.company;

import java.util.Arrays;

public class Concetinationarray {
    public static void main(String[] args) {
        int[] numi = {1, 2, 3};
        int[] ab = getConcatenation(numi);
        System.out.println(Arrays.toString(ab));


    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length * 2; j++) {
                nums[i] = ans[j];
                if (j == nums.length) {


                    for (int a = 0; a < nums.length; a++) {
                        nums[a] = ans[j];
//                            n++;
                    }

                }


            }

        }
        return ans;
    }
}
