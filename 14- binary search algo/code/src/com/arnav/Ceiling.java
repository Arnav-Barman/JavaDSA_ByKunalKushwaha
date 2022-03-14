package com.arnav;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4,4,6,7,8,9};
        int target=5;
        int index = ceiling(nums,target);
        System.out.println("The element which is the ceiling to "+target+" is present at index "+index+" of the array");
    }
    //returning the index of target
//if not found, return -1
    static int ceiling(int[] nums, int target){
        int n=nums.length;
        if(target>nums[n-1]){return -1;} //if target is the largest number, return -1
        int s=0,e=n-1;
        while( s <= e ) {
            int m = s + ( ( e - s ) / 2 ) ;
            if(target < nums[m] ) {
                e = m - 1 ;
            }else if(target > nums[m] ) {
                s = m + 1 ;
            }else{
                return m;//ans found
            }
        }
        return s;//target not present in array so we return start index... as s will get > than e and thus represent ceiling
    }
}
