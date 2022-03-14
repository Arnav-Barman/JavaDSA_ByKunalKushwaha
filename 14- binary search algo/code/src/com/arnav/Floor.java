package com.arnav;

public class Floor {
    public static void main(String[] args) {
    int[] nums={1,1,2,3,4,6,6,7,8,9};
    int target=5;
    int index = floor(nums,target);
    System.out.println("The element which is the floor to "+target+" is present at index "+index+" of the array");
}
    static int floor(int[] nums, int target){
        // this code automatically returns -1 when the target < smallest num in array as the e gets < s while s=0th index... therefore e becomes -1
        int n=nums.length;
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
        return e;//target not present in array but e will be the floor as e gets < s after the final iteration in the loop (because e is less than target)
    }
}
