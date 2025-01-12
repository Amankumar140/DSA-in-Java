import java.util.Arrays;

import static java.util.Collections.swap;

public class functions
{
    public static void main(String[] args) {
//        int a=10, b=4;
//        swap(a,b);
//        System.out.println(a+" "+b);

        int []arr={1,2,3,4};
        change(arr); // only changes occurs in array
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
         System.out.println(a+" "+b);
    }
    static void change(int[] nums){
        nums[0]=99;
    }
}
