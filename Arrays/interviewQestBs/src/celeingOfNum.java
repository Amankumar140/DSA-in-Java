public class celeingOfNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9, 11, 12, 13, 14,17,19,20};
        int x = 15;
        int pos = ceiling(arr, x);
        int pos1=Floor(arr,x);
        System.out.println(arr[pos]);
        System.out.println(arr[pos1]);
    }

    static int ceiling(int[] arr, int target) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end-st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return st;

    }
    static int Floor(int []arr,int target){
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end-st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return end;
    }
}
