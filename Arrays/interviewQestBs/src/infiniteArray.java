public class infiniteArray
{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(ans(arr,8));
    }
    static  int ans(int []arr,int target){
        int st=0;
        int end=1;
        while (end < arr.length && target > arr[end]) {
            int temp = end + 1;
            end = Math.min(end + (end - st + 1) * 2, arr.length - 1); // Prevent index out of bounds
            st = temp;
        }
        return BS(arr,target,st,end);
    }
    static int BS(int[] arr, int target,int st,int end) {

        while (st <= end) {
            int mid = st + (end-st) / 2;
            if (arr[mid] > target) {
                end= mid-1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                 return mid;
            }


        }
        return -1;

    }
}

