import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 1};
        Selection(arr, arr.length , 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr, int r, int c, int maxIdx) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            if (arr[c] > arr[maxIdx]) {
                Selection(arr, r, c + 1, c);
            } else {
                Selection(arr, r, c + 1, maxIdx);
            }
        } else {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[r - 1];
            arr[r - 1] = temp;
            Selection(arr, r - 1, 0, 0);
        }
    }
}
