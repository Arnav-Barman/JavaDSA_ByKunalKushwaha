package com.arnav;

public class EvenDgits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
//    static int findNumbers(int[] nums) {
//        int count =0;
//        int n= nums.length;
//        for (int i = 0; i <n ; i++) {
//            if(1 > nums[i] || nums[i]> 100000){return -1;}
//            else{
//                int x=0;
//                while(nums[i]>0){
//                    nums[i]/=10;
//                    x++;
//                }
//                if(x%2==0){count++;}
//            }
//        }
//        return count;
//    }
    static int findNumbers(int[] nums){
        int count=0;
        for (int num : nums) {
            if (even(num)){count++;}
        }
        return count;
    }
    static int betterOptimisedToCountDigits(int num){if(num<0){num*=-1;}
    return (int)(Math.log10(num))+1;
    }
    static boolean even(int num){
        int numberOfDigits= betterOptimisedToCountDigits(num);
        return numberOfDigits%2==0;
    }

}
