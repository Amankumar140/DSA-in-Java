import java.util.Arrays;

public class SearchIn2d
{
    public static void main(String[] args) {
        // matrix is sorted row-wise and column-wise
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(bs(arr,11)));

    }
    static int []bs(int [][]arr,int target){
        int r=0;        // row
        int c=arr.length-1;   // column
        while(r< arr.length && c>=0){
            if(arr[r][c]==target){
                return new int []{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int []{-1,-1};
    }
}
