import java.util.Arrays;

public class BSin2D {
    public static void main(String[] args) {
        // strictly sorted array
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(Search(arr,16)));

    }

    static int[] BinaryS(int[][] matrix, int row, int cSt, int cEnd, int target) {
        while (cSt <= cEnd) {
            int mid = cSt + (cEnd - cSt) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                cSt = mid + 1;
            }

        }
        return new int[]{-1, -1};
    }

    static int[] Search(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;// be cautions matrix will be empty
        if (r == 1) {
            return BinaryS(matrix, 0, 0, c - 1, target);
        }
        int rStart = 0;
        int rEnd = r - 1;
        int cMid = c / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return BinaryS(matrix, rStart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][c - 1]) {
            return BinaryS(matrix, rStart, cMid + 1, c - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return BinaryS(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return BinaryS(matrix, rStart + 1, cMid + 1, c - 1, target);
        }
    }
}