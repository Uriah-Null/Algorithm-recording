package org.example.Algorithm_recording;

public class LeetCode_09 {

    /*
    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    */
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        int x_copy = x;
        int number = 0;
        while(x_copy > 0){
            number = number * 10 + x_copy % 10;
            x_copy = x_copy / 10;
        }
        if(number == x){
            return true;
        }
        return false;
    }
}
