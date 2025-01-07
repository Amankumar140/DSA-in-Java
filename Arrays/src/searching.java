import java.util.Arrays;

public class searching
{
    public static void main(String[] args) {
        int []arr={1,3,45,-67,-89};
        //System.out.println(min(arr));
        // search in 2d array

        int [][] arr1={
                {1,2,3},
                {4,51,6},
                {7,8,9}};
        System.out.println(Arrays.toString(Search(arr1,9)));
        System.out.println(maxIn2d(arr1));

    }
    static int min(int [] y){
        int min=Integer.MAX_VALUE;
        for(int i : y){
            if (i<min){
                min=i;
            }
        }
        return min;
    }

    static int[] Search(int [][]y,int target){
        for(int i=0; i<y.length; i++){
            for(int j = 0; j< y[i].length; j++){
                if(y[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int maxIn2d(int [][]y){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<y.length; i++){
            for(int j=0; j<y[i].length; j++){
                if(max<y[i][j]){
                    max=y[i][j];
                }
            }
        }
        return max;
    }
}
