import java.util.Scanner;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));
    }
    static void change(String [] arr){
        arr[0]="hello";
    }

}

