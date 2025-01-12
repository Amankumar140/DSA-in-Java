import java.util.Arrays;

public class shadowing
{

    public static void main(String[] args) {
//        System.out.println(x);
//        int x=40;
//        System.out.println(x); // override the outer x via inner x
//        print();
       hi(2,3,4,5,6,6,7);
        change(2,3,"aman","kumar","arya","anya"); // varargs used...
    }
     static void hi(int...v){
         System.out.println(Arrays.toString(v));
     }
     static void change(int a,int b,String...v){
         System.out.println("hi");
     }
}
