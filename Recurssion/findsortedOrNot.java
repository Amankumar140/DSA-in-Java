public class findsortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 12, 19, 27};
        System.out.println(Sorted(arr));
        System.out.println(recursionSort(arr,0));
    }

    static boolean Sorted(int[] arr) {
        // is ascending or not
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    static boolean recursionSort(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return (arr[i]<arr[i+1])&& recursionSort(arr,i+1);
    }
}
