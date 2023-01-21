import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 7, 6, 9, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 1; j < n-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}