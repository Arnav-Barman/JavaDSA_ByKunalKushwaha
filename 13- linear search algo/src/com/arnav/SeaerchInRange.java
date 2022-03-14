package com.arnav;

public class SeaerchInRange {
    public static void main(String[] args) {
        int[] nums={1, 4, 12, 32, 45, 12, 41, -12, -23};
        int target= 45;
        int start=2,end=5;
        int ans = linear_search(nums,target,start,end);
        System.out.println("45 @ Index:"+ans);
    }
    static int linear_search(int[] nums, int target , int start, int end){
        if(nums.length==0){return -1;}
        for (int i = start; i < end; i++) {
            if(target==nums[i]){return  i;}
        }
        return -1;
    }
}
