import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int []arr={4,3,2,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int []arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
