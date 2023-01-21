package com.arnav;

public class leetcode1095 {
}
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        return search(arr,target);
    }
    public int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = oaBinarySearch(arr, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return oaBinarySearch(arr, target, peak+1, arr.length-1);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]){
                e=m;
            } else{
                s=m+1;
            }
        }
        return s;
    }
    public int oaBinarySearch(int[] nums, int target, int s, int e){
        int n=nums.length;
        while( s <= e ) {
            int m = s + ( ( e - s ) / 2 ) ;
            if(target==nums[m]){return m;}
            if(nums[0]<nums[n-1]) {
                if (target < nums[m]) {
                    e = m - 1;
                } else if (target > nums[m]) {
                    s = m + 1;
                }
            }
            else{
                if (target > nums[m]) {
                    e = m - 1;
                } else if (target < nums[m]) {
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}