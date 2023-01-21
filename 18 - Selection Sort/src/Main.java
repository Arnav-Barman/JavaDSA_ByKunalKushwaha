import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4 ,6, 7, 1, 2, 4 ,7};
        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//    static void selSort(int[] arr){
//        int n =arr.length;
//       for (int i = 0; i <n ; i++) {
//            int maxIndex=0;
//            int last = n-i-1;
//            for (int j = 0; j <= last; j++) {
//                if(arr[j]>arr[maxIndex]){
//                    maxIndex=j;
//                }
//            }
//            int temp = arr[last];
//            arr[last]=arr[maxIndex];
//            arr[maxIndex]=temp;
//        }
//    }
static void selSort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        int max = arr.length - 1 - i;
        int maxIndex = getMaxIndex(arr, 0, max);
        swap(arr, maxIndex, max);
    }
}

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int getMaxIndex(int[] arr, int start,  int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

}