public class BinarySearch {
    public static void main(String[] args) {
        int []arr={22,34,56,78,89,222,278};
        int []arr1={24,23,12,9,7,4,-3,-6};
        int y=agnosticBS(arr,78);
        int z=agnosticBS(arr1,7);
        System.out.println(y);
        System.out.println(z);

    }

    static int agnosticBS(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        boolean isAsd = arr[st] < arr[end];
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsd) {
                if (arr[mid] < target) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
