package com.arnav;

public class FindMin {
    public static void main(String[] args) {
        int[] nums={1, 4, 12, 32, 45, 12, 41, -12, -23};
        int ans = linear_search(nums);
        System.out.println("Min number in array lies at Index:"+ans);
    }
    static int linear_search(int[] nums){
        if(nums.length==0){return -1;}
        int count = nums[0];
        for (int i =0; i <nums.length ; i++) {
            if(count>nums[i]){
                count=nums[i];}
        }
        for (int i = 0; i < nums.length; i++) {
            if(count==nums[i]){return  i;}
        }
        return -1;
    }
}
