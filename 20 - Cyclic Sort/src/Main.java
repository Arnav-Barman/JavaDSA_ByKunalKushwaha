import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3,7,6,8,9};
        cycSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycSort(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
                swap(arr,i,correct);
            else
                i++;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}