package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
题目：给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。
*/


public class LeetCode_01 {
    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(Two(nums,6)));
    }


    //第二次
    public static int[] Two(int[] nums, int target) throws IllegalAccessException {
        int i = 0;
        //使用map来进行存储，每次从数组中取一个数，并且用target减去这个数，看看我们要找的数在不在这个map中
        //如果在，那么返回当前数下标，和对应数下标。
        //如果不在，则将这个数以键值对的方式添加到map中去。
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    //第一次
    public static int[] One(int[] nums, int target) {
        int i;
        for(i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    nums[0] = i;
                    nums[1] = j;
                }
            }
        }
        nums = Arrays.copyOfRange(nums,0,2);
        return nums;
    }
}