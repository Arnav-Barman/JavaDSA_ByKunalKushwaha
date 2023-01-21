public class SearchInASortedMatrix {
public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int target = 20;
        int[] ans = search(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
    static int[] binarySearch(int[][] matrix, int target, int cstart, int cend, int row) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] > target) {
                cend = mid - 1;
            } else {
                cstart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int [][] matrix, int target){
    int row = matrix.length;
    int col = matrix[0].length;
    int rstart =0;
    int rend = row-1;
    int cmid = col/2;
    if (row ==1)
        return binarySearch(matrix, target, 0, col-1, 0);
    while(rstart<(rend-1)){
        int mid = rstart + (rend-rstart)/2;
        if (matrix[mid][cmid] == target)
            return new int[]{mid, cmid};
        else if (matrix[mid][cmid] > target)
            rend = mid;
        else
            rstart = mid;
    }

    //we now have 2 rows, now check whether target is in the col of 2 rows
    if (matrix[rstart][cmid] == target)
        return new int[]{rstart, cmid};
    else if (matrix[rstart+1][cmid] == target)
        return new int[]{rstart+1, cmid};
    else if (target <= matrix[rstart][cmid-1]) //quadrant 1
        return binarySearch(matrix, target, 0, cmid-1, rstart);
    else if (target >= matrix[rstart][cmid+1] && target <= matrix[rstart][col-1]) //quadrant 2
        return binarySearch(matrix, target, cmid+1, col-1, rstart);
    else if (target <= matrix[rstart+1][cmid-1]) //quadrant 3
        return binarySearch(matrix, target, 0, cmid-1, rstart+1);
    else if (target >= matrix[rstart][cmid-1] && target <= matrix[rstart+1][col-1]) //quadrant 4
        return binarySearch(matrix, target, cmid+1, col-1, rstart+1);
    else
        return new int[]{-1, -1};
    }
}
