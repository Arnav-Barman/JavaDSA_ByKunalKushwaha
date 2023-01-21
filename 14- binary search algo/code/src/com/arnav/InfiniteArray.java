package com.arnav;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int target=5;
        int index = ans(nums,target);
        System.out.println("The element "+target+" is present at index "+index+" of the array");
    }
    static int ans(int[] arr, int target){
        int start =0;
        int end = 1;
        //find the range
        while(target > arr[end]){
            int newStart = end + 1;
            //double the box value
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
