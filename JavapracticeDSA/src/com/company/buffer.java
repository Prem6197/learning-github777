package com.company;

public class buffer {
    public static void findHiddenCode(String text) {
        int stringlen = text.length();
        StringBuilder sb = new StringBuilder(text);
        StringBuilder sa = new StringBuilder();
//        if (stringlen % 2 == 0) {
            for (int i = 1; i <= stringlen; i++) {
                if (stringlen % i == 0) {

                    sa.append(sb.charAt(i));
                }
            }
            System.out.print(sa);

        }
//    }

    public static void main(String[] args) {
        String text="the gratest code";
        StringBuilder sa = new StringBuilder();
        System.out.println(sa);
        buffer.findHiddenCode(text);
    }

}
