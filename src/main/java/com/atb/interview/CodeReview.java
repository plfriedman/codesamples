package com.atb.interview;

/*
 * returns a string consisting of 's' concatenated n-number of times
 */
public class CodeReview {

    public static String multiply_string(String s, int n) {
        String result = "";
        for (int i = 0; i <= n; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = CodeReview.multiply_string("foo", 5);
        System.out.println(str);
    }
}
