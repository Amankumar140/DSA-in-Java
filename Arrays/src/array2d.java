import java.util.Arrays;
import java.util.Scanner;

public class array2d
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

//        int[][] arr={
//                {1,2,3},
//                {1,3},
//                {1,2,3}
//        };
        int [][] arr2d=new int[2][];
        for(int i=0; i<arr2d.length; i++){
            System.out.println("Enter the column : ");
            int j=in.nextInt();
            arr2d[i]=new int [j];
        }

        for(int i=0; i<arr2d.length; i++){
            for(int j=0; j<arr2d[i].length; j++){
                System.out.println("Enter the element " + (i+1)+" row "+ (j+1)+" column :" );
                arr2d[i][j]=in.nextInt();
            }
        }
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+" ");
//
//            }
//            System.out.println();;
//        }
        for(int i=0; i<arr2d.length; i++){
            System.out.println(Arrays.toString(arr2d[i]));;
        }
    }
}
