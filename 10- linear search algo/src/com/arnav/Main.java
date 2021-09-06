package com.arnav;
public class Main {
    public static void main(String[] args) {
        int[] nums={1, 4, 12, 32, 45, 12, 41, -12, -23};
        int target= 45;
        int ans = linear_search(nums,target);
        System.out.println("45 @ Index:"+ans);
        System.out.println(linear_search1(nums,target));
        System.out.println(linear_search2(nums,target));
    }

    //returning a boolean
    private static boolean linear_search2(int[] nums, int target) {
        if(nums.length==0){return false;}

        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){return  true;}
        }
        return false;
    }

    //linear search using for and if
    static int linear_search(int[] nums, int target){
        if(nums.length==0){return -1;}
        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){return  i;}
        }
        return -1;
    }
    //running an enhanced for loop
    static int linear_search1(int[] nums, int target){
        if(nums.length==0){return Integer.MAX_VALUE;}
        for (int x : nums) {
            if(target==x){return  x;}
        }
        return Integer.MAX_VALUE;
    }
}